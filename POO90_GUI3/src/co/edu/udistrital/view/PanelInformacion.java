package co.edu.udistrital.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelInformacion extends JPanel{

	private JLabel enombre1;
	private JLabel enombre2;
	private JLabel eciudad1;
	private JLabel eciudad2;
	private JLabel etel1;
	private JLabel etel2;
	private JLabel email1;
	private JLabel email2;
	private JLabel eblanco;
	private JButton agregar;
	private JButton eliminar;

	public PanelInformacion() {
		setLayout(new GridLayout(8, 2, 5, 5));
		setBackground(Color.LIGHT_GRAY);
		setBorder(new TitledBorder("Modulo de informacion "));
		setPreferredSize(new Dimension(350, 350));
		inicializarComponentes();
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		eblanco = new JLabel();
		add(eblanco);
		
		eblanco = new JLabel();
		add(eblanco);
		
		eblanco = new JLabel();
		add(eblanco);
		
		eblanco = new JLabel();
		add(eblanco);
		
		enombre1 = new JLabel("Nombre:");
		add(enombre1);
		
		enombre2 = new JLabel();
		add(enombre2);
		
		eciudad1 = new JLabel("Ciudad:");
		add(eciudad1);
		
		eciudad2 = new JLabel();
		add(eciudad2);
		
		etel1 = new JLabel("Telefono:");
		add(etel1);
		
		etel2 = new JLabel();
		add(etel2);
		
		email1 = new JLabel("Email:");
		add(email1);
		
		email2 = new JLabel();
		add(email2);
		
		agregar = new JButton("AGREGAR PERSONA");
		add(agregar);
		agregar.setActionCommand("AGREGAR");
		eliminar=new JButton("Eliminar persona");
		eliminar.setActionCommand("ELIMINAR");
		add(eliminar);
		
		eblanco = new JLabel();
		add(eblanco);
		
		eblanco = new JLabel();
		add(eblanco);
	}

	public JButton getEliminar() {
		return eliminar;
	}

	public void setEliminar(JButton eliminar) {
		this.eliminar = eliminar;
	}

	public JButton getAgregar() {
		return agregar;
	}

	public void setAgregar(JButton agregar) {
		this.agregar = agregar;
	}

	public JLabel getEnombre1() {
		return enombre1;
	}

	public void setEnombre1(JLabel enombre1) {
		this.enombre1 = enombre1;
	}

	public JLabel getEnombre2() {
		return enombre2;
	}

	public void setEnombre2(JLabel enombre2) {
		this.enombre2 = enombre2;
	}

	public JLabel getEciudad1() {
		return eciudad1;
	}

	public void setEciudad1(JLabel eciudad1) {
		this.eciudad1 = eciudad1;
	}

	public JLabel getEciudad2() {
		return eciudad2;
	}

	public void setEciudad2(JLabel eciudad2) {
		this.eciudad2 = eciudad2;
	}

	public JLabel getEtel1() {
		return etel1;
	}

	public void setEtel1(JLabel etel1) {
		this.etel1 = etel1;
	}

	public JLabel getEtel2() {
		return etel2;
	}

	public void setEtel2(JLabel etel2) {
		this.etel2 = etel2;
	}

	public JLabel getEmail1() {
		return email1;
	}

	public void setEmail1(JLabel email1) {
		this.email1 = email1;
	}

	public JLabel getEmail2() {
		return email2;
	}

	public void setEmail2(JLabel email2) {
		this.email2 = email2;
	}

	public JLabel getEblanco() {
		return eblanco;
	}

	public void setEblanco(JLabel eblanco) {
		this.eblanco = eblanco;
	}
	
}
