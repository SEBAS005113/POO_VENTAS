package co.edu.udistrital.model;

public interface SuperVelocidad {
	String velocidadMaxima(double velocidad);
	String arrancar(double cordX);
	String detenerse(double cordX, double cordY);
	String velocidadAcutal(double velocidad);
	String resistencia(double porcentaje);
	
	
}
