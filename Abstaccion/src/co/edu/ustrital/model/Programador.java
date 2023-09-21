package co.edu.ustrital.model;

public class Programador extends Empleado{
	private String lenProDominante;
	private int numLinCodXHora;
	
	public Programador(String nombre,int edad,String cedula,String lenProDominante,int numLinCodXHora) {
		super(nombre,edad,cedula);
		this.salario=1500000;
		this.lenProDominante=lenProDominante;
		this.numLinCodXHora=numLinCodXHora;
	}
	public Programador() {
		super();
		salario=1500000;
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
		if(numLinCodXHora>=500 && numLinCodXHora<1000) {
			salario=salario*1.2;
			System.out.println("El nuevo salario del programador aumento en un 20% y es: "+salario);
		}
		else if(numLinCodXHora>=1000) {
			salario=salario*1.4;
			System.out.println("El nuevo salario del programador aumento en un 40% y es: "+salario);
		}
		else {
			salario=salario*1;
			System.out.println("El salario del programador sigue siendo el mismo: "+salario);
		}	
	}
	
}
