package it.perigea.academy.veicoli;

public class MainVeicoli {
	public static void main (String[] args) {
		Veicolo v1=new Veicolo("FGSD", "verde");
		//Veicolo v2=new Veicolo("XZTR", "bianca");
		Automobile auto1=new Automobile("citycar", "CXDF", "blu");
		//Automobile auto2=new Automobile("suv", "C3DW", "gialla");
		auto1.chiSono();
		//auto2.chiSono();
		v1.chiSono();
		//v2.chiSono();
		//Automobile auto2=new Veicolo("CDFD","gialla");
		//Automobile auto2= v1;
		Veicolo v3=auto1;
		v3.chiSono();
		Veicolo v4=new Automobile("citycar", "CDFT", "blu");
		Automobile auto3=(Automobile)v4;
		
	}
}
