package co.edu.udistrital.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import co.edu.udistrital.model.Persona;

public class VentanaPrincipal extends JFrame{

	private PanelDatos pd;
	private PanelInformacion pi;
	private PanelImagen pim;
	
	public VentanaPrincipal() {
		setTitle("Buscador de Personas");
		setSize(800, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(162, 34, 6));
		getContentPane().setLayout(new BorderLayout(10, 10));
		
		inicializarComponentes();
		
		setResizable(true);
		setLocationRelativeTo(null);	
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		
		pd = new PanelDatos();
		getContentPane().add(pd, BorderLayout.NORTH);
		
		pi = new PanelInformacion();
		getContentPane().add(pi, BorderLayout.WEST);
		
		pim = new PanelImagen();
		getContentPane().add(pim, BorderLayout.CENTER);
		
	}
	public Persona obtenerDatos() {
		String imagen;
		String genero;
		String nombre=JOptionPane.showInputDialog("ingrese el nombre");
		String ciudad=JOptionPane.showInputDialog("ingrese la ciudad");
		String telefono=JOptionPane.showInputDialog("ingrese el telefono");
		String email=JOptionPane.showInputDialog("ingrese el email");
		int sexo=JOptionPane.showOptionDialog(this,"seleccione opcion","selector de opcion",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,new Object[]{"Masculino","Femenino","No sabe"},"Masculino");
		if (sexo==0) {
			genero= "Masculino";
		}else if(sexo==1) {
			genero="Femenino";
		}else  {
			genero="no binario";}
		JFileChooser x= new JFileChooser();
		FileNameExtensionFilter filtrado= new FileNameExtensionFilter("JPG","jpg");
		x.setFileFilter(filtrado);
		int n= x.showOpenDialog(this);
		if(n==x.APPROVE_OPTION) {
			imagen=x.getSelectedFile().getPath();
		}else {
			imagen="";
		}
		
		
		return new Persona(nombre,ciudad,genero,telefono,email,imagen);
	}

	public PanelDatos getPd() {
		return pd;
	}

	public void setPd(PanelDatos pd) {
		this.pd = pd;
	}

	public PanelInformacion getPi() {
		return pi;
	}

	public void setPi(PanelInformacion pi) {
		this.pi = pi;
	}

	public PanelImagen getPim() {
		return pim;
	}

	public void setPim(PanelImagen pim) {
		this.pim = pim;
	}	
	
}









