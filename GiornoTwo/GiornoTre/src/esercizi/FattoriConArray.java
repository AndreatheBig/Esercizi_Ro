package esercizi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FattoriConArray {

	public static void main(String[] args) {
		int num;
		List<Integer>numeri=new ArrayList<Integer>();
		List<Integer>fattori=new ArrayList<Integer>();		
		Scanner n=new Scanner(System.in);
		
		System.out.println(" inserisci i due valori interi da valutare");
		numeri.add(n.nextInt());
		numeri.add(n.nextInt());
		
		 for(int j=0; j<numeri.size()/2; j++){
			 
			num=numeri.get(j);
				while (num % 2 == 0) {
		            fattori.add(2);
		            num /= 2;
		        }
			 for (int i = 3; i <= Math.sqrt(num); i += 2) {
		            while (num % i == 0) {
		                fattori.add(i);
		                num /= i;
		            }		
			 }
			 if (num > 2) {
		            fattori.add(num);
		        }
			 System.out.println("La scomposizione in fattori primi è: " + fattori);
				
			
			
		}
		System.out.println(numeri);
		
	}

}
