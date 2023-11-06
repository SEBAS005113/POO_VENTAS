package co.edu.udistrital.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.udistrital.model.Directorio;
import co.edu.udistrital.model.Persona;
import co.edu.udistrital.view.VentanaPrincipal;

public class Controller implements ActionListener{

	private VentanaPrincipal vista;
	private Directorio datos;
	
	
	public Controller() {
		vista = new VentanaPrincipal();
		datos= new Directorio();
		asignarOyentes();
	}
	
	public void asignarOyentes() {
		vista.getPd().getLista_genero().addActionListener(this);
		vista.getPr().getBtnCrear().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando=e.getActionCommand();
		
		if (comando.equals("LISTA1")) {
			vista.getPd().getLista_personas().removeActionListener(this);
			vista.getPd().getLista_personas().removeAllItems();
			vista.getPd().getLista_genero().removeItem("Buscar...");
			String generoBuscar= (String)vista.getPd().getLista_genero().getSelectedItem();
			for(Persona x: datos.getDirectorio()) {
				if(x.getGenero().equals(generoBuscar)) {
					vista.getPd().getLista_personas().addItem(x.getNombre());
				}
			}
			
			limpiarCampos();
			
			vista.getPd().getLista_personas().addActionListener(this);
		}else if(comando.equals("LISTA2")) {
			 String nombreBuscar= (String)vista.getPd().getLista_personas().getSelectedItem();
			 Persona encontrada=null;
			 for(Persona x: datos.getDirectorio()) {
				 if(x.getNombre().equals(nombreBuscar)) {
					 encontrada=x;
				 }
			 }
			 vista.getPr().getTxtnombre().setText(encontrada.getNombre());
			 vista.getPr().getTxtciudad().setText(encontrada.getCiudad());
			 vista.getPr().getTxtTel().setText(encontrada.getTelefono());
			 vista.getPr().getTxtemail().setText(encontrada.getEmail());
			 vista.getPim().cambiarImagen(encontrada.getArchivoFoto());

		}else if(comando.equals("CrearPersona")) {
			String nombre=vista.getPr().getTxtnombre().toString();
			String ciudad=vista.getPr().getTxtciudad().toString();
			String telefono=vista.getPr().getTxtTel().toString();
			String email=vista.getPr().getTxtemail().toString();
			String imagen="m1";
			String genero="Femenino";
			System.out.println(vista.getPr().getName());
			
			Persona nuevaPersona=new Persona(nombre, genero, ciudad, telefono, email, genero);
			if(!nombre.equals("")&&!ciudad.equals("")&&!telefono.equals("")&&!email.equals("")&&!genero.equals("")&&!imagen.equals("")) {
				JOptionPane.showMessageDialog(vista, "La persona fue creada con éxito");
				datos.add(nuevaPersona);
			}else {
				JOptionPane.showMessageDialog(vista, "Por favor digite todos los campos");
			}
			for (Persona x :datos.getDirectorio()) {
				System.out.println("nombre: "+x.getNombre());
			}
			
			String generoBuscar= (String)vista.getPd().getLista_genero().getSelectedItem();
			for(Persona x: datos.getDirectorio()) {
				if(x.getGenero().equals(generoBuscar)) {
					vista.getPd().getLista_personas().addItem(x.getNombre());
				}
			}
			
			limpiarCampos();
			
		}
	}
	public void limpiarCampos() {
		vista.getPr().getTxtnombre().setText("");
		 vista.getPr().getTxtciudad().setText("");
		 vista.getPr().getTxtTel().setText("");
		 vista.getPr().getTxtemail().setText("");
		 vista.getPim().cambiarImagen("");
	}
}





