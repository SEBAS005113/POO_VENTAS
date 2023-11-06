package co.edu.udistrital.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelImagen extends JPanel{
	
	private JLabel eimagen;
	public JLabel getEimagen() {
		return eimagen;
	}

	public void setEimagen(JLabel eimagen) {
		this.eimagen = eimagen;
	}

	

	public PanelImagen() {
		setLayout(new FlowLayout());
		setBackground(Color.WHITE);
		setBorder(new TitledBorder("Imagen de la persona "));
		inicializarComponentes();
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		
		eimagen = new JLabel();
		add(eimagen);
	}
	
	public void cambiarImagen(String elem) {
		
		if(elem.equals(null)) {
			eimagen.setIcon(null);
		}else {
			Image im = new ImageIcon(elem).getImage();
			ImageIcon icono = new ImageIcon(im.getScaledInstance(this.getWidth()-30, this.getHeight()-30,
					Image.SCALE_DEFAULT));
			
			eimagen.setIcon(icono);
		}
	}
}
