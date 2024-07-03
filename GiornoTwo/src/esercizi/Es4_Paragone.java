package esercizi;

import java.util.Scanner;

public class Es4_Paragone {

	public static void main(String[] args) {
		
		int primo;
		int secondo;
		int rapporto;
		
		Scanner s = new Scanner(System.in);	
	
		
		for(int i=0;i<10;i++) {
			System.out.println("inserisci il primo numero");
			primo=s.nextInt();
			System.out.println("inserisci il secondo numero");
			secondo=s.nextInt();
				if(primo!=0||secondo!=0) {
			
				
				
					rapporto=primo/secondo;
					System.out.println("il rapporto è: "+rapporto);
				}else {
					break;
				}
		}		
					
		
		

	}

}
