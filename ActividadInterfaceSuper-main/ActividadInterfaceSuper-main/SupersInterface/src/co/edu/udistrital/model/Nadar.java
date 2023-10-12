package co.edu.udistrital.model;

public interface Nadar {
	String aguantarRespiracion(double tiempo);
	String bucear(double cordX, double cordY);
	String resistencia(double porcentaje);
	String velocidad(double velocidad);
	default String visionACuatica() {
		return "Puede ver bajo el agua";
	}
	

}
