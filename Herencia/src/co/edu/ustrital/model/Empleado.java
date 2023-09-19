package co.edu.ustrital.model;

public class Empleado {
	protected String nombre;
	protected int edad;
	protected String cedula;
	protected double salario;
	
	
	public Empleado(String nombre,int edad,String cedula,double salario) {
		this.cedula=cedula;
		this.edad=edad;
		this.nombre=nombre;
		this.salario=salario;
	}
	public Empleado() {
		cedula="";
		edad=0;
		nombre="";
		salario=0.0;
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	public void aumentoSalarial() {
		
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + "\nEdad: " + edad + "\nCedula=" + cedula + "\nSalario=" + salario;
	}
	
}
