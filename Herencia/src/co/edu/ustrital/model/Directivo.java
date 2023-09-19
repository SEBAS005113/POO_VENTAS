package co.edu.ustrital.model;

public class Directivo extends Empleado{
	private int añosExperiencia;
	private String areaEncargada;
	
	public Directivo(String nombre,int edad,String cedula,double salario,int añosExperiencia,String areaEncargada) {
		super(nombre,edad,cedula,salario);
		this.areaEncargada=areaEncargada;
		this.añosExperiencia=añosExperiencia;
	}
	public Directivo() {
		super();
		areaEncargada="";
		añosExperiencia=0;
	}
	public int getAñosExperiencia() {
		return añosExperiencia;
	}
	public void setAñosExperiencia(int añosExperiencia) {
		this.añosExperiencia = añosExperiencia;
	}
	public String getAreaEncargada() {
		return areaEncargada;
	}
	public void setAreaEncargada(String areaEncargada) {
		this.areaEncargada = areaEncargada;
	}
	@Override
	public String toString() {
		return super.toString()+"\nAnios de experiencia:" + añosExperiencia + "\nArea encargada=" + areaEncargada;
	}
	@Override
	public void aumentoSalarial() {
		salario=salario*1.35;
		System.out.println("El nuevo salario del directivo es: "+salario);
	}
	
}
