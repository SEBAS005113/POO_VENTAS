package co.edu.udistrital.model;

public class Kriptoniano extends SuperHeroe implements Volar, Fuerza{


	@Override
	public String fuerzaMaxima(double fuerza) {
		return "UN SER FUERA DE LO COMUN. SOY UN KRIPTONIANO!! Mi maxima fuerza es impresionante, es de: "+fuerza;
	}

	@Override
	public String lanzar(double cordX, double cordY) {
		// TODO Auto-generated method stub
		return "UN SER FUERA DE LO COMUN. SOY UN KRIPTONIANO!! El siguiente golpe lo lanzare desde "+cordX+","+cordY;
	}

	@Override
	public String fuerzaAcutal(double velocidad) {
		// TODO Auto-generated method stub
		return "UN SER FUERA DE LO COMUN. SOY UN KRIPTONIANO!! El golpe que dare tendra una fuerza de: "+velocidad;
	}

	@Override
	public String resistencia(double porcentaje) {
		// TODO Auto-generated method stub
		return "UN SER FUERA DE LO COMUN. SOY UN KRIPTONIANO!! La resistencia que tiene actualmente este gran personaje es de: "+porcentaje+"%";
	}

	@Override
	public String despegar(double cordX, double cordY) {
		// TODO Auto-generated method stub
		return "UN SER FUERA DE LO COMUN. SOY UN KRIPTONIANO!! Siempre es importante iniciar con un buen vuelo. En este momento estoy en: "+cordX+","+cordY;
	}

	@Override
	public String detenerse(double cordX, double cordY) {
		// TODO Auto-generated method stub
		return "UN SER FUERA DE LO COMUN. SOY UN KRIPTONIANO!! Ya no hay nada que ver, me detendre ahora. Estoy ubicado en "+cordX+","+cordY;
	}

	@Override
	public String levitar(double cordY) {
		// TODO Auto-generated method stub
		return "UN SER FUERA DE LO COMUN. SOY UN KRIPTONIANO!! Me encuentro a una altura: "+cordY+" listo para asesinar al enemigo";
	}

	@Override
	public String controlAereo(double cordX, double cordY) {
		// TODO Auto-generated method stub
		return "UN SER FUERA DE LO COMUN. SOY UN KRIPTONIANO!! El vuelo aereo es mi fuerte.Aqui te comparto mi coordenada actual "+cordX+","+cordY;
	}


}
