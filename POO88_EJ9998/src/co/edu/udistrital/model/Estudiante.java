package co.edu.udistrital.model;

public class Estudiante extends Persona{
	private String carrera;
	private String codigo;
	
	public Estudiante(String pnombre,int pedad, String pcarrera, String pcodigo) {
		super(pnombre,pedad);
		carrera = pcarrera;
		codigo = pcodigo;
	}
	
	public String getCarrera() {
		return carrera;
	}
	
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	@Override
	public String toString() {
		return super.toString()+"Carrera:" + carrera + "\nCodigo:" + codigo;
	}
}
