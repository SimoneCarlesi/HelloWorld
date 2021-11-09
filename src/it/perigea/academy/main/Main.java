package it.perigea.academy.main;

import it.perigea.academy.persona.Persona;

public class Main {
	public static void main(String[] args) {
		//String nome= args[0];
		//System.out.println("Hello World" + " " + nome);
		Persona persona1= new Persona("Simone", "Carlesi");
		persona1.stampa();
		System.out.println(persona1.toString());
		Persona persona2= new Persona("Pippo", "Paperino");
		persona2.stampa();
		System.out.println(persona2.toString());
	}
}
