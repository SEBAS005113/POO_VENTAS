package co.edu.ustrital.model;

public class Consultor extends Empleado {
	private int añosExperiencia;
	private int lidEquDesarrollo;
	
	public Consultor(String nombre,int edad,String cedula,double salario,int añosExperiencia,int lidEquDesarrollo) {
		super(nombre,edad,cedula,salario);
		this.añosExperiencia=añosExperiencia;
		this.lidEquDesarrollo=lidEquDesarrollo;
		
	}
	
	public Consultor() {
		super();
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
		// TODO Auto-generated method stub
		salario=salario*1.25;
		System.out.println("El nuevo salario del consultor es: "+salario);
	}
	
}
