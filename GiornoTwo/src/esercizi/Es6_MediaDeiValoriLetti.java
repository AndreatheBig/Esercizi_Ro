package esercizi;

import java.util.Scanner;

public class Es6_MediaDeiValoriLetti {

	public static void main(String[] args) {
		
		
		int max;
		int min=0;
		int input;
		int c;
		int media;
		int cont=0;
		boolean controllo=true;
		Scanner s = new Scanner(System.in);
		
		System.out.println("inserisci due valori che fungano da intervallo");
			max=s.nextInt();		
			input=s.nextInt();
			
			if(input<max) {
				min=input;
			}else{
				min=max;
				max=input;				
			}
			media=max+min;
			
		while(controllo=true) {
			System.out.println("inserisci dei valori contenuti in quesll'intervallo");
			c=s.nextInt();
			media=media+c;
			cont++;
			
			if(c<min||c>max) {
				System.out.println("la media dei numeri inseriti è "+media/cont);
				controllo=false;
				break;
				
			}
		}	
	}
		

}
