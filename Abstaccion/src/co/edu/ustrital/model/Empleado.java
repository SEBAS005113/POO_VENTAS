package co.edu.ustrital.model;

public abstract class Empleado {
	protected String nombre;
	protected int edad;
	protected String cedula;
	protected double salario;
	
	
	public Empleado(String nombre,int edad,String cedula) {
		this.cedula=cedula;
		this.edad=edad;
		this.nombre=nombre;
	}
	public Empleado() {
		cedula="";
		edad=0;
		nombre="";
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
	public abstract void aumentoSalarial();

	@Override
	public String toString() {
		return "Nombre: " + nombre + "\nEdad: " + edad + "\nCedula=" + cedula + "\nSalario=" + salario;
	}
	
}
