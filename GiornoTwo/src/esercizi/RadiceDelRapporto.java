package esercizi;

import java.util.Scanner;

public class RadiceDelRapporto {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		double input;
		double max;
		double min=0;
		double calcolo;
		boolean controllo;
		
		while(controllo=true) {
		
			System.out.println("inserisci il primo valore ");
			max=s.nextDouble();
			
			System.out.println("inserisci il secondo valore ");
			input=s.nextDouble();
			
			if(input<max) {
				min=input;
			}else{
				min=max;
				max=input;
			}
			
			
			calcolo=Math.sqrt(max/min);
			System.out.println(calcolo);
		
		}
		
		


	}

}
