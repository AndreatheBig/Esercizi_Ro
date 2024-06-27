package esercizi;

import java.util.Scanner;

public class SommaDelleRadici {

	public static void main(String[] args) {
		
		double n;
		double somma=0;				
		boolean indx=true;
		Scanner s=new Scanner(System.in);
		
		while(indx=true) {
			System.out.println("Inserire un valore da operare");
			n=s.nextDouble();
				if(n>0) {
					somma=somma+Math.sqrt(n);
					System.out.println("la somma delle radici è "+somma);
				}else {
					System.out.println("ERROR:hai inserito un valore non presente nel dominio dei numeri reali");
					indx=false;
					break;
				}
			
		}
		
		
		
	

	}

}
