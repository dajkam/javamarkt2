package javamark2;

public class produkt { 
	public produkt(String nazwa, double cena) {
		super();
		this.nazwa = nazwa;
		this.cena = cena;
	}
	@Override
	public String toString() {
		return "produkt [nazwa=" + nazwa + ", cena=" + cena + "]";
	}
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	public double getCena() {
		return cena;
	}
	public void setCena(double cena) {
		this.cena = cena;
	}
	 String nazwa; 
	 double cena; 
	

}
