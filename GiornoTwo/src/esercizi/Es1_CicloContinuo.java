package esercizi;

import java.util.Scanner;

public class Es1_CicloContinuo {

	public static void main(String[] args) {
		

		int primo;
		int secondo;
		int prodotto;
		int somma=0;
		boolean controllo=true;
		
		Scanner s = new Scanner(System.in);	
		
		while(controllo=true){
			System.out.println("inserisci il primo numero");
			primo=s.nextInt();
			System.out.println("inserisci il secondo numero");
			secondo=s.nextInt();
				if(primo!=0&&secondo!=0) {
					prodotto=primo*secondo;
					somma=somma+prodotto;
					System.out.println("Il prodotto è: "+prodotto);
				}else {
					System.out.println("la somma di tutti i prodotti è: "+somma);
					controllo=false;
					break;
				}
		}

	}

}
