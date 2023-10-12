package co.edu.udistrital.model;

public class Atlantiano extends SuperHeroe implements Nadar, Fuerza{

	@Override
	public String fuerzaMaxima(double velocidad) {
		// TODO Auto-generated method stub
		return "SOY UN SER SUPERIOR. SOY UN ATLANTIANO. Tengo el gran poder de destruir lo que sea con mis manos. Mi fuerza maxima es: "+velocidad;
	}

	@Override
	public String lanzar(double cordX, double cordY) {
		// TODO Auto-generated method stub
		return "SOY UN SER SUPERIOR. SOY UN ATLANTIANO. El siguiente golpe lo lanzare desde: "+cordX+","+cordY;
	}

	@Override
	public String fuerzaAcutal(double velocidad) {
		// TODO Auto-generated method stub
		return "SOY UN SER SUPERIOR. SOY UN ATLANTIANO. La fuerza que utilizare en mi siguiente golpe es: "+velocidad;
	}

	@Override
	public String aguantarRespiracion(double tiempo) {
		// TODO Auto-generated method stub
		return "SOY UN SER SUPERIOR. SOY UN ATLANTIANO. El agua y yo somos aliados";
	}

	@Override
	public String bucear(double cordX, double cordY) {
		// TODO Auto-generated method stub
		return "SOY UN SER SUPERIOR. SOY UN ATLANTIANO. Esta es mi ubi exacta: "+cordX+","+cordY;
	}

	@Override
	public String resistencia(double porcentaje) {
		// TODO Auto-generated method stub
		return "SOY UN SER SUPERIOR. SOY UN ATLANTIANO. La resistencia que tengo es infinita";
	}

	@Override
	public String velocidad(double velocidad) {
		// TODO Auto-generated method stub
		return "SOY UN SER SUPERIOR. SOY UN ATLANTIANO. Puedo alcanzar velocidades inimaginables, como esta: "+velocidad+"km/s";
	}


}
