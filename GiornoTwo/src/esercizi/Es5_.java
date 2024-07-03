package esercizi;

import java.util.Scanner;

public class Es5_ {

	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		int pari=0;
		int dispari=0;
		int nulli=0;
		boolean controllo=true;
		Scanner s = new Scanner(System.in);
		
		while(controllo=true) {
			System.out.println("inserisci un valore per A ");
				a=s.nextDouble();
			System.out.println("inserisci un valore per B ");
			 	b=s.nextDouble();
			System.out.println("inserisci un valore per C ");
				c=s.nextDouble();
				
				
				if((a-b)%2==0) {
					pari++;
				}else if((a-b)%2!=0) {
					dispari++;
				}else if((a-b)==0) {
					nulli++;
				}
				
				if(a+b<c) {
					System.out.println("ci sono stati "+pari+"numeri pari");
					System.out.println("ci sono stati "+dispari+"numeri pari");
					System.out.println("ci sono stati "+nulli+" risultati 0");
					controllo=false;
					break;
				}
		}
		
		

	}

}
