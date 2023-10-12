package co.edu.udistrital.model;

public class Alienigena extends SuperHeroe implements Volar, Fuerza, SuperVelocidad, Nadar{

	@Override
	public String aguantarRespiracion(double tiempo) {
		// TODO Auto-generated method stub
		return "SOY UN ALIENIGENA!! Tengo la capacidad de aguantar la respiracion";
	}

	@Override
	public String bucear(double cordX, double cordY) {
		// TODO Auto-generated method stub
		return "SOY UN ALIENIGENA!!"+cordX+","+cordY;
	}

	@Override
	public String velocidad(double velocidad) {
		// TODO Auto-generated method stub
		return "SOY UN ALIENIGENA!! Tengo la facilidad de moverme a "+velocidad+" km/h";
	}

	@Override
	public String velocidadMaxima(double velocidad) {
		// TODO Auto-generated method stub
		return "SOY UN ALIENIGENA!! Tengo la facilidad de moverme a una velocidad maxima de "+velocidad+" km/h";
	}

	@Override
	public String arrancar(double cordX) {
		// TODO Auto-generated method stub
		return "SOY UN ALIENIGENA!! y estoy listo para arrancar a correr, me encuentro ubicado en "+cordX;
	}

	@Override
	public String velocidadAcutal(double velocidad) {
		// TODO Auto-generated method stub
		return "SOY UN ALIENIGENA!! Tengo la capacidad de desplazarme a una velocidad maxima de "+velocidad+" km/h";
	}

	@Override
	public String fuerzaMaxima(double velocidad) {
		// TODO Auto-generated method stub
		return "SOY UN ALIENIGENA!! y no me busques problema, porque te puedo partir en dos. Mi fuerza maxima es de "+velocidad;
	}

	@Override
	public String lanzar(double cordX, double cordY) {
		// TODO Auto-generated method stub
		return "SOY UN ALIENIGENA!! los golpes se me dan bien. Mi ubicacion para lanzar el golpe es: "+cordX+","+cordY;
	}

	@Override
	public String fuerzaAcutal(double velocidad) {
		// TODO Auto-generated method stub
		return "SOY UN ALIENIGENA!! La fuerza imprimida en este golpe es de: "+velocidad;
	}

	@Override
	public String resistencia(double porcentaje) {
		// TODO Auto-generated method stub
		return "SOY UN ALIENIGENA!! Y este es mi porcentaje de resistencia: "+porcentaje;
	}

	@Override
	public String despegar(double cordX, double cordY) {
		// TODO Auto-generated method stub
		return "SOY UN ALIENIGENA!! empezare con mi vuelo. Estas son mis coordenadas de inicio "+cordX+","+cordY;
	}

	@Override
	public String detenerse(double cordX, double cordY) {
		// TODO Auto-generated method stub
		return "SOY UN ALIENIGENA!! PERO ESO NO SIGNIFICA QUE NO ME CANSE. Me detendre por aqui "+cordX+","+cordY;
	}

	@Override
	public String levitar(double cordY) {
		// TODO Auto-generated method stub
		return "SOY UN ALIENIGENA!! Es mi hora de brillar. Este poder lo sacare a una altura de: "+cordY;
	}

	@Override
	public String controlAereo(double cordX, double cordY) {
		// TODO Auto-generated method stub
		return "SOY UN ALIENIGENA!! Estoy volando. Estas son mis coordenadas aereas "+cordX+","+cordY;
	}


}
