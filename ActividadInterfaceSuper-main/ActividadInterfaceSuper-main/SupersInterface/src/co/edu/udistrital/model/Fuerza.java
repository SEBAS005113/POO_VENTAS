package co.edu.udistrital.model;

public interface Fuerza {
	String fuerzaMaxima(double fuerza);
	String lanzar(double cordX, double cordY);
	String fuerzaAcutal(double velocidad);
	String resistencia(double porcentaje);
	default String destrozar() {
		return "Destruye algo";
	}
	
	
}
