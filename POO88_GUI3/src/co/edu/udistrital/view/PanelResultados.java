package co.edu.udistrital.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelResultados extends JPanel{

	private JLabel eblanco;
	private JLabel enombre1;
	private JTextField txtnombre;
	private JLabel eciudad1;
	private JTextField txtciudad;
	private JLabel etel1;
	private JTextField txtTel;
	private JLabel email1;
	private JTextField txtemail;
	private JButton btnCrear;
	private JButton btnEliminar;
	
	public PanelResultados() {
		setLayout(new GridLayout(8, 2));
		setBackground(new Color(247, 218, 193));
		setBorder(new TitledBorder("Modulo de informacion"));
		setPreferredSize(new Dimension(300, 300));
		
		inicializarComponentes();
		
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		
		eblanco= new JLabel();
		add(eblanco);
		
		eblanco= new JLabel();
		add(eblanco);
		
		enombre1=new JLabel("Nombre: ");
		add(enombre1);
		
		txtnombre= new JTextField();
		txtnombre.setActionCommand("nombre");
		add(txtnombre);
		
		eciudad1= new JLabel("Ciudad: ");
		add(eciudad1);
		
		txtciudad= new JTextField();
		txtciudad.setActionCommand("ciudad");
		add(txtciudad);
		
		etel1= new JLabel("Telefono: ");
		add(etel1);
		
		txtTel= new JTextField();
		txtTel.setActionCommand("telefono");
		add(txtTel);
		
		email1= new JLabel("Email: ");
		add(email1);
		
		txtemail= new JTextField();
		txtemail.setActionCommand("email");
		add(txtemail);
		
		eblanco= new JLabel();
		add(eblanco);
		
		eblanco= new JLabel();
		add(eblanco);
		
		btnCrear=new JButton("CREAR");
		btnCrear.setActionCommand("CrearPersona");
		add(btnCrear);
		
		btnEliminar=new JButton("ELIMINAR");
		btnEliminar.setActionCommand("EliminarPersona");
		add(btnEliminar);

	}

	public JButton getBtnCrear() {
		return btnCrear;
	}

	public void setBtnCrear(JButton btnCrear) {
		this.btnCrear = btnCrear;
	}

	public JButton getBtnEliminar() {
		return btnEliminar;
	}

	public void setBtnEliminar(JButton btnEliminar) {
		this.btnEliminar = btnEliminar;
	}

	public JLabel getEblanco() {
		return eblanco;
	}

	public void setEblanco(JLabel eblanco) {
		this.eblanco = eblanco;
	}

	public JLabel getEnombre1() {
		return enombre1;
	}

	public void setEnombre1(JLabel enombre1) {
		this.enombre1 = enombre1;
	}

	public JTextField getTxtnombre() {
		return txtnombre;
	}

	public void setTxtnombre(JTextField txtnombre) {
		this.txtnombre = txtnombre;
	}

	public JLabel getEciudad1() {
		return eciudad1;
	}

	public void setEciudad1(JLabel eciudad1) {
		this.eciudad1 = eciudad1;
	}

	public JTextField getTxtciudad() {
		return txtciudad;
	}

	public void setTxtciudad(JTextField txtciudad) {
		this.txtciudad = txtciudad;
	}

	public JLabel getEtel1() {
		return etel1;
	}

	public void setEtel1(JLabel etel1) {
		this.etel1 = etel1;
	}

	public JTextField getTxtTel() {
		return txtTel;
	}

	public void setTxtTel(JTextField txtTel) {
		this.txtTel = txtTel;
	}

	public JLabel getEmail1() {
		return email1;
	}

	public void setEmail1(JLabel email1) {
		this.email1 = email1;
	}

	public JTextField getTxtemail() {
		return txtemail;
	}

	public void setTxtemail(JTextField txtemail) {
		this.txtemail = txtemail;
	}
}








