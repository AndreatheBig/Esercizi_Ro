package esercizi;

import java.util.Scanner;

public class CalcoloPerimetroRettangolo {

	public static void main(String[] args) {
		
		double base;
		double altezza;
		double perimetro;
		
		System.out.println("Inserisci la base del rettangolo cui vuoi calcolare il perimetro");
		Scanner s = new Scanner(System.in); 
		base=s.nextDouble();
		System.out.println("ora inseriscine l'altezza");
		altezza=s.nextDouble();
		
		if(base!=0&&altezza!=0) {
			perimetro=(base*2)+(altezza*2);
			System.out.println("Il perimetro del tuo triangolo è: "+perimetro);
		}else {
			System.out.println("non si puo costuire un rettangolo");
		}

	}

}
