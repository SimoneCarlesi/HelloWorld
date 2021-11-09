package it.perigea.academy.persona;

public class Persona {
	private String nome;
	private String cognome;
	
	public Persona(String nome, String cognome) {
		this.nome=nome;
		this.cognome=cognome;
	}
	
	public void stampa() {
		System.out.println("Si chiama" + " " + this.nome + " " + this.cognome);
	}
}
