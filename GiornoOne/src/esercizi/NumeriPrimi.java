package esercizi;

import java.util.ArrayList;


public class NumeriPrimi {

	public static void main(String[] args) {
		
		ArrayList<Integer> numPrimi= new ArrayList<Integer>();
		
		int n=2;
		
		
		for(int i=0; i<10; i++, n++) {
			numPrimi.add(n); 
			if(n%2!=0||n==2) {								
//					for(int j=0; j<numPrimi.size(); j++) {
					for (Integer numeroPrimo : numPrimi) {
						if(n%numeroPrimo!=0) {
//							System.out.println(n);
							
						System.out.println(n);
					}
				}
			}
			
			
		
		}
		

	}
}

