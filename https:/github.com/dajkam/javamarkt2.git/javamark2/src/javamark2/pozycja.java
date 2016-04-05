package javamark2;

public class pozycja { 
	@Override
	public String toString() {
		return "pozycja [p=" + p + ", obcena=" + obcena + "]";
	}
	public pozycja(produkt p) {
		super();
		this.p = p;
		this.obcena = p.getCena();
	}
	public produkt getP() {
		return p;
	}
	public void setP(produkt p) {
		this.p = p;
	}
	public double getObcena() {
		return obcena;
	}
	public void setObcena(double obcena) {
		this.obcena = obcena;
	}
	private produkt p; 
	private double obcena;

}
