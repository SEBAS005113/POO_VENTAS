package co.edu.ustrital.controller;
import co.edu.ustrital.model.*;


public class AplMain {

	public static void main(String[] args) {

		Programador p= new Programador("Laura",25,"202245876","java",500);
		
		System.out.println(p.toString());
		p.aumentoSalarial();
		System.out.println();
		System.out.println("_____________________________________________");
		
		Consultor c=new Consultor("Mariana", 36, "52747996",5,1);
		System.out.println(c.toString());c.toString();
		c.aumentoSalarial();
		System.out.println();
		System.out.println("_____________________________________________");
		
		Directivo d=new Directivo("Mafe", 28, "1024597862",10, "Equipo de desarrolladores de software");
		System.out.println(d.toString());
		d.aumentoSalarial();
		System.out.println();
		System.out.println("_____________________________________________");
	}
}
