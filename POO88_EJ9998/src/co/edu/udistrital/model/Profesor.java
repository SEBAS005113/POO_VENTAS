package co.edu.udistrital.model;

public class Profesor extends Persona {
	private String especialidad;
	private int horasClase;
	
	public Profesor(String pnombre,int pedad, String pespecialidad, int phorasClase) {
		super(pnombre,pedad);
		especialidad = pespecialidad;
		horasClase = phorasClase;
	}
	
	public String getEspecialidad() {
		return especialidad;
	}
	
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	public int getHorasClase() {
		return horasClase;
	}
	
	public void setHorasClase(int horasClase) {
		this.horasClase = horasClase;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Especialidad: " + especialidad + "\nHoras de clase:" + horasClase;
	}
	
}
