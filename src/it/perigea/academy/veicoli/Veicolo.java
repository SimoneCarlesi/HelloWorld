package it.perigea.academy.veicoli;

public class Veicolo {
	private String targa;
	private String colore;
		
	public Veicolo(String targa, String colore) {
		super();
		this.targa = targa;
		this.colore = colore;
	}

	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public void chiSono() {
		System.out.println("Sono un veicolo generico" + " " + this.targa);
	}
}
