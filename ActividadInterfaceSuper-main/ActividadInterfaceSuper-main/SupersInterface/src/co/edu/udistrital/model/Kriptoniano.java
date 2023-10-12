package co.edu.udistrital.model;

public class Kriptoniano extends SuperHeroe implements Volar, Fuerza, SuperVelocidad{

	@Override
	public String velocidadMaxima(double velocidad) {
		return "Corre maximo a  " + velocidad + "Km/h";
	}

	@Override
	public String arrancar(double cordX) {
		return "Empieza a correr desde la coordenada " + cordX + "m";
	}

	@Override
	public String velocidadAcutal(double velocidad) {
		return "Corre a  " + velocidad + "Km/h";
	}

	@Override
	public String fuerzaMaxima(double fuerza) {
		return " ";
	}

	@Override
	public String lanzar(double cordX, double cordY) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String fuerzaAcutal(double velocidad) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String resistencia(double porcentaje) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String despegar(double cordX, double cordY) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String detenerse(double cordX, double cordY) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String levitar(double cordY) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String controlAereo(double cordX, double cordY) {
		// TODO Auto-generated method stub
		return null;
	}


}
