package co.edu.udistrital.model;

import java.util.ArrayList;

public class Directorio {

	private ArrayList<Persona> directorio;
	
	public Directorio() {
		directorio = new ArrayList<Persona>();
	}
	
	public void rellenar(Persona x) {
		directorio.add(x);
	}

	public ArrayList<Persona> getDirectorio() {
		return directorio;
	}

	public void setDirectorio(ArrayList<Persona> directorio) {
		this.directorio = directorio;
	}
	
}
