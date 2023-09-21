package co.edu.ustrital.model;

public class Consultor extends Empleado {
	private int añosExperiencia;
	private int lidEquDesarrollo;
	
	public Consultor(String nombre,int edad,String cedula,int añosExperiencia,int lidEquDesarrollo) {
		super(nombre,edad,cedula);
		salario=3000000;
		this.añosExperiencia=añosExperiencia;
		this.lidEquDesarrollo=lidEquDesarrollo;
		
	}
	
	public Consultor() {
		super();
		salario=3000000;
		añosExperiencia=0;
		lidEquDesarrollo=0;
		
	}
	public int getAñosExperiencia() {
		return añosExperiencia;
	}
	public void setAñosExperiencia(int añosExperiencia) {
		this.añosExperiencia = añosExperiencia;
	}
	public int getLidEquDesarrollo() {
		return lidEquDesarrollo;
	}
	public void setLidEquDesarrollo(int lidEquDesarrollo) {
		this.lidEquDesarrollo = lidEquDesarrollo;
	}
	@Override
	public String toString() {
		return super.toString()+"\nAnios de experiencia: " + añosExperiencia + "\nLider de equipos de desarrollo: " + lidEquDesarrollo ;
	}
	@Override
	public void aumentoSalarial() {
		if(lidEquDesarrollo>5 && lidEquDesarrollo<=8) {
			salario=salario*1.25;
			System.out.println("El nuevo salario del consultor aumento en un 25% y es: "+salario);

		}
		else if(lidEquDesarrollo>8) {
			salario=salario*1.5;
			System.out.println("El nuevo salario del consultor aumento en un 50% y es: "+salario);

		}
		else {
			salario=salario*1;
			System.out.println("El salario del consultor se mantuvo estable: "+salario);

		}
	}
	
}
