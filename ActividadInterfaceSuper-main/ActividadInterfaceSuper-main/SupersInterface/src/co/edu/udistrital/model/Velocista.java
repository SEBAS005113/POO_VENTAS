package co.edu.udistrital.model;

public class Velocista extends SuperHeroe implements SuperVelocidad{

	@Override
	public String velocidadMaxima(double velocidad) {
		// TODO Auto-generated method stub
		return "NO ME COMPARES CON OTROS SUPERHEROES. NINGUNO CORRE TAN RAPIDO COMO YO!! A cuantas personas conoces que corran a "+velocidad+" millas por segundo?" ;
	}

	@Override
	public String arrancar(double cordX) {
		// TODO Auto-generated method stub
		return "NO ME COMPARES CON OTROS SUPERHEROES. NINGUNO CORRE TAN RAPIDO COMO YO!!Siempre es importante en donde comienzas tu recoorido. Ahora estoy en: "+cordX;
	}

	@Override
	public String detenerse(double cordX, double cordY) {
		// TODO Auto-generated method stub
		return "NO ME COMPARES CON OTROS SUPERHEROES. NINGUNO CORRE TAN RAPIDO COMO YO!! A veces debo detenerme solo para observar a un par de damas, como en este momento que estoy en: "+cordX+","+cordY;
	}

	@Override
	public String velocidadAcutal(double velocidad) {
		// TODO Auto-generated method stub
		return "NO ME COMPARES CON OTROS SUPERHEROES. NINGUNO CORRE TAN RAPIDO COMO YO!! Estoy corriendo a: "+velocidad+" millas por segundo";
	}

	@Override
	public String resistencia(double porcentaje) {
		// TODO Auto-generated method stub
		return "NO ME COMPARES CON OTROS SUPERHEROES. NINGUNO CORRE TAN RAPIDO COMO YO!! Debo admitir que tambien me canso. Actualmente tengo este porcentaje de vida: "+porcentaje+"%";
	}

}
