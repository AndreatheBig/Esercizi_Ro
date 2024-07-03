package esercizi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Es3_MediaOrdineInverso {

	public static void main(String[] args) {
		
		int num;
		List<Integer> numeri = new ArrayList<Integer>();
		int media=0;
		int div=0;
		boolean controllo=true;
		
		Scanner s = new Scanner(System.in);	
		
		while(controllo=true) {
			
			System.out.println("inserisci un numero: ");
			num=s.nextInt();
			if(num!=0) {
				div++;
				media=media+num;
				numeri.add(num);	
			}else {
				controllo=false;
				System.out.println("la media dei valori inseriti è: "+media/div);
//					for (Integer numero : numeri) {
//						System.out.println(numero);
//					}
					for(int i=numeri.size()-1; i>=0; i--) {
						System.out.println(numeri.get(i));
					}
				
			break;		
			}
		}
		

	}

}
