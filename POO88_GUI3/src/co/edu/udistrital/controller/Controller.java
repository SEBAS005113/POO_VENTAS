package co.edu.udistrital.controller;

import java.awt.Component;
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
		vista.getPr().getBtnEliminar().addActionListener(this);
		vista.getPr().getBtnImagen().addActionListener(this);
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
			String nombre=vista.getPr().getTxtnombre().getText();
			String ciudad=vista.getPr().getTxtciudad().getText();
			String telefono=vista.getPr().getTxtTel().getText();
			String email=vista.getPr().getTxtemail().getText();
			String imagen="m2";
			String genero=vista.getPd().getLista_genero().getSelectedItem().toString();
			
			System.out.println(genero);;
			
			Persona nuevaPersona=new Persona(nombre, genero, ciudad, telefono, email, imagen);
			if(!nombre.equals("")&&!ciudad.equals("")&&!telefono.equals("")&&!email.equals("")&&!genero.equals("")&&!imagen.equals("")) {
				JOptionPane.showMessageDialog(vista, "La persona fue creada con éxito");
				datos.add(nuevaPersona);
				limpiarCampos();
			}else {
				JOptionPane.showMessageDialog(vista, "Por favor digite todos los campos");
			}
			for (Persona x :datos.getDirectorio()) {
				System.out.println("nombre: "+x.getNombre());
			}
			
		}else if(comando.equals("EliminarPersona")) {
			String nombre=vista.getPr().getTxtnombre().getText();
			String telefono=vista.getPr().getTxtTel().getText();
			
			
			int respuesta=JOptionPane.showConfirmDialog(vista, "¿Está seguro de eliminar a " + nombre+ "?");
			if(respuesta==0) {
				limpiarCampos();
				int seElimino=datos.quitar(nombre, telefono);
				if(seElimino==1) {
					JOptionPane.showMessageDialog(vista, nombre+" fue eliminada.");
				}else if(seElimino==2) {
					JOptionPane.showMessageDialog(vista, nombre+" no fue encontrada para eliminar.");
				}
			}
			
		}else if (comando.equals("BuscarImagen")) {
			
		}
	}
	public void limpiarCampos() {
		vista.getPr().getTxtnombre().setText("");
		 vista.getPr().getTxtciudad().setText("");
		 vista.getPr().getTxtTel().setText("");
		 vista.getPr().getTxtemail().setText("");
		 vista.getPim().cambiarImagen("");
		 vista.getPd().getLista_genero().setSelectedIndex(0);
		 
	}
}





