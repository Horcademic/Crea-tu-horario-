package horario;

import java.util.Scanner;

import acm.program.ConsoleProgram;

public class principal extends ConsoleProgram{
	public void run() {
		
		
		Estudiante a[]= new Estudiante[1];
		Scanner leer= new Scanner (System.in);
		
		
		String correo;
		
		for(int i=0; i<a.length; i++) {
			println("Ingrese su correo");
			// no lee 
			correo= leer.nextLine();
			a[i]= new Estudiante (correo);
			
			}
		for(int i=0; i<a.length; i++) {
			
		    println(a[i].getCorreo());}
		
		}


	
	}


