package co.edu.udistrital.model;

public interface Volar {
	String despegar(double cordX, double cordY);
	String detenerse(double cordX, double cordY);
	String levitar(double cordY);
	String controlAereo(double cordX, double cordY);

	
}
