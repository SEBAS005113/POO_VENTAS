package co.edu.ustrital.model;

public class Directivo extends Empleado{
	private int añosExperiencia;
	private String areaEncargada;
	
	public Directivo(String nombre,int edad,String cedula,int añosExperiencia,String areaEncargada) {
		super(nombre,edad,cedula);
		salario=5000000;
		this.areaEncargada=areaEncargada;
		this.añosExperiencia=añosExperiencia;
	}
	public Directivo() {
		super();
		salario=5000000;
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
		if(añosExperiencia>8 && añosExperiencia<=12) {
			salario=salario*1.3;
			System.out.println("El nuevo salario del directivo aumento en un 30% y es: "+salario);
		}
		else if(añosExperiencia>12) {
			salario=salario*1.5;
			System.out.println("El nuevo salario del directivo aumento en un 50% y es: "+salario);
		}
		else {
			salario=salario*1;
		}
		
	}
	
}
