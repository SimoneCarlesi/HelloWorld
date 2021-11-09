package it.perigea.academy.veicoli;

public class Automobile extends Veicolo{
	private String segmento;
	
	public String getSegmento() {
		return segmento;
	}

	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}

	public Automobile(String segmento, String targa, String colore) {
		super(targa, colore);
		this.segmento = segmento;
	}
	
	@Override
	public void chiSono() {
		System.out.println("Sono un'automobile" + " " + this.getTarga());
	}
	
}
