package javamark2; 
import java.util.*;

public class kosz { 
	@Override
	public String toString() {
		return "kosz [koszyk=" + koszyk + "]";
	}

	public ArrayList<pozycja> getKoszyk() {
		return koszyk;
	}

	public void setKoszyk(ArrayList<pozycja> koszyk) {
		this.koszyk = koszyk;
	}

	ArrayList<pozycja> koszyk= new ArrayList<pozycja>(); 
	public double należność(){
		double suma=0; 
		for(pozycja rzecz:koszyk){
			suma+=rzecz.getP().getCena();
			
		}
		return suma;
	} 
	
	public double należnośćpoobniżce(){
		double suma=0; 
		for(pozycja rzecz:koszyk){
			suma+=rzecz.getObcena();
			
		}
		return suma;
	} 
	
	

}
