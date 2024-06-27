package esercizi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Terne {

	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		List<Integer> massimi=new ArrayList<Integer>();
		List<Integer> minimi =new ArrayList<Integer>();
		
		boolean indx=true;
		Scanner s =new Scanner(System.in);		
		
		while(indx=true) {
			
			System.out.println("inserire tre valori in ordine crescente");
			a=s.nextInt();
			b=s.nextInt();
			c=s.nextInt();
			 	if(a<b&&b<c) {
			 		massimi.add(c);
			 		minimi.add(a);			 			
			 	}
			 	if(a<0||b<0||c<0) {
			 		System.out.println("valori massimi e minimi inseriti sono: ");
			 		for(int i=0; i<=massimi.size()-1; i++) {			 		
			 		System.out.println("max: "+massimi.get(i)+" min: "+minimi.get(i));
			 		}
			 		indx=false;
			 		break;
			 	}
			
		}

	}

}
