package co.edu.ustrital.model;

public class Programador extends Empleado{
	private String lenProDominante;
	private int numLinCodXHora;
	
	public Programador(String nombre,int edad,String cedula,double salario,String lenProDominante,int numLinCodXHora) {
		super(nombre,edad,cedula,salario);
		this.lenProDominante=lenProDominante;
		this.numLinCodXHora=numLinCodXHora;
	}
	public Programador() {
		super();
		lenProDominante="";
		numLinCodXHora=0;
	}
	public String getLenProDominante() {
		return lenProDominante;
	}
	public void setLenProDominante(String lenProDominante) {
		this.lenProDominante = lenProDominante;
	}
	public int getNumLinCodXHora() {
		return numLinCodXHora;
	}
	public void setNumLinCodXHora(int numLinCodXHora) {
		this.numLinCodXHora = numLinCodXHora;
	}
	@Override
	public String toString() {
		return super.toString()+"\nLenguaje de programacion dominante:" + lenProDominante + "\nNumero de lineas por hora: " + numLinCodXHora ;
	}
	@Override
	public void aumentoSalarial() {
		salario=salario*1.15;
		System.out.println("El nuevo salario del programador es: "+salario);
	}
	
}
