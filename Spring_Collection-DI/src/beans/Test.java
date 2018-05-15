package beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
	
	private List Fruits;
	private Set Cricketers;
	private Map CountryCapitals;
	
	public void setFruits(List fruits) {
		Fruits = fruits;
	}
	
	public void setCricketers(Set cricketers) {
		Cricketers = cricketers;
	}
	
	public void setCountryCapitals(Map countryCapitals) {
		CountryCapitals = countryCapitals;
	}
	
	public void printData(){
		
		System.out.println("Fruits Data ...............");
		
		for(Object valueFruit : Fruits){
			System.out.println(valueFruit);
		}
		
		System.out.println("Cricketers...............");
		
		for(Object cricketers: Cricketers){
			System.out.println(cricketers);
		}
		
		System.out.println("CountryCapitals ..................");
		
		Set keys = CountryCapitals.keySet();
		
		for(Object key : keys){
			System.out.println(key + "--" + CountryCapitals.get(key));
		}
		
	}

}
