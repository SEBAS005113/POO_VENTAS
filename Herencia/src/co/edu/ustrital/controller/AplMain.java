package co.edu.ustrital.controller;
import java.util.Scanner;
import co.edu.ustrital.model.*;


public class AplMain {

	public static void main(String[] args) {
		
		Empleado e= new Empleado("Juan",18,"1011320821",1000000);
		System.out.println(e.toString());
		System.out.println();
		System.out.println("_____________________________________________");
		
		Programador p= new Programador("Laura",25,"202245876",2350000,"java",500);
		
		System.out.println(p.toString());
		p.aumentoSalarial();
		System.out.println();
		System.out.println("_____________________________________________");
		
		Consultor c=new Consultor("Mariana", 36, "52747996", 5610000, 5,1);
		System.out.println(c.toString());c.toString();
		c.aumentoSalarial();
		System.out.println();
		System.out.println("_____________________________________________");
		
		Directivo d=new Directivo("Mafe", 28, "1024597862", 7000000, 10, "Equipo de desarrolladores de software");
		System.out.println(d.toString());
		d.aumentoSalarial();
		System.out.println();
		System.out.println("_____________________________________________");
	}
}
