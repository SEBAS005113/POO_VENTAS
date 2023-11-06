package co.edu.udistrital.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.udistrital.model.Directorio;
import co.edu.udistrital.model.Persona;
import co.edu.udistrital.view.VentanaPrincipal;

public class Controller implements ActionListener{

	private VentanaPrincipal ventana;
	private Directorio dir;
	
	public Controller() {
		ventana = new VentanaPrincipal();
		dir = new Directorio();
		asignarOyentes();
	}
	
	public void asignarOyentes() {
		ventana.getPd().getLista_genero().addActionListener(this);
		ventana.getPi().getAgregar().addActionListener(this);
		ventana.getPi().getEliminar().addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		if(comando.equals("LISTA1")) {
			ventana.getPd().getLista_personas().removeAllItems();
			ventana.getPd().getLista_personas().removeActionListener(this);
			int pos = ventana.getPd().getLista_genero().getSelectedIndex(); // Buscar posicion
			String g = ventana.getPd().getLista_genero().getItemAt(pos); // Devolver el elemento seleccionado
			for (Persona x : dir.getDirectorio()) {
				if(x.getGenero().equals(g)){
					ventana.getPd().getLista_personas().addItem(x.getNombre());
				}
			}
			
			ventana.getPi().getEnombre2().setText("");
			ventana.getPi().getEciudad2().setText("");
			ventana.getPi().getEtel2().setText("");
			ventana.getPi().getEmail2().setText("");
			ventana.getPim().cambiarImagen("");
			
			ventana.getPd().getLista_personas().addActionListener(this);
		}else if(comando.equals("LISTA2")) {
			int pos2 = ventana.getPd().getLista_personas().getSelectedIndex(); // Traer nombre 
			String n = ventana.getPd().getLista_personas().getItemAt(pos2); // Asignar posicion
			for (Persona x : dir.getDirectorio()) {
				if(x.getNombre().equals(n)){
					ventana.getPi().getEnombre2().setText(x.getNombre());
					ventana.getPi().getEciudad2().setText(x.getCiudad());
					ventana.getPi().getEtel2().setText(x.getTelefono());
					ventana.getPi().getEmail2().setText(x.getEmail());
					ventana.getPim().cambiarImagen(x.getNfoto());
				}
			}
		}else if (comando.equals("AGREGAR")){
			dir.rellenar(ventana.obtenerDatos());
		}else if (comando.equals("ELIMINAR")) {
			String x[]=new String [25];
			int l=0;
		for (Persona i:dir.getDirectorio()) {
			x[l]=i.getNombre();
			l=l+1;
			
		}try {
			Persona AMEN=new Persona();
			int contador=0;
			String	index=(JOptionPane.showInputDialog(ventana, "Selecciona a la persona que deseas eliminar", "PERSONA A ELIMINAR",JOptionPane.PLAIN_MESSAGE,null,x,null).toString());
			for (Persona m:dir.getDirectorio()) {
				if (m.getNombre().equals(index)) {
					contador+=1;
				}AMEN=m;}
					if (contador==1) {
						dir.getDirectorio().remove(AMEN);
						}
					else {
						int u=0;
						int c=Integer.parseInt(JOptionPane.showInputDialog(ventana,"su usuario esta repetido, ingrese cual de ellos desea eliminar"));
						int p=0;
						for (Persona g:dir.getDirectorio()) {
						if( p!=c) {
							u+=1;
								if (g.getNombre().equals(index)) {
									p+=1;
						}}}
						dir.getDirectorio().remove(u-1);
					}
				
			
			
		}catch(  java.lang.NullPointerException p){
			JOptionPane.showMessageDialog(ventana, "ingresa usuarios para eliminar");
		
		}}
			
			
		
	}
}


