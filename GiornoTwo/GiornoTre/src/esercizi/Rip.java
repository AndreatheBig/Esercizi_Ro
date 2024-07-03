package esercizi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rip {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		int a, b;
		int a1,b1;
		int mcm;
		int mcd=0;
		int mcm1;
		int mcd1;
		Scanner s=new Scanner(System.in);
		num1=s.nextInt();
		num2=s.nextInt();
		a=num1;
		b=num2;
		a1=num1;
		b1=num2;
		List<Integer> fattoria = new ArrayList();
		List<Integer> fattorib = new ArrayList();
		List<Integer> fattorimcm = new ArrayList();
		List<Integer> fattorimcd = new ArrayList();
		
		
		 while (a % 2 == 0) {
	            fattoria.add(2);
	            a /= 2;
	        }
		 for (int i = 3; i <= Math.sqrt(a); i += 2) {
	            while (a % i == 0) {
	                fattoria.add(i);
	                a /= i;
	            }		
		 }
		 if (a > 2) {
	            fattoria.add(a);
	        }
		 
		 while (b % 2 == 0) {
	            fattorib.add(2);
	            b /= 2;
	        }
		 for (int i = 3; i <= Math.sqrt(b); i += 2) {
	            while (b % i == 0) {
	                fattorib.add(i);
	                b /= i;
	            }		
		 }
		 if (b > 2) {
	            fattorib.add(b);
	        }
		 System.out.println("La scomposizione in fattori primi di " + num1 + " è: " + fattoria);
		 System.out.println("La scomposizione in fattori primi di " + num2 + " è: " + fattorib);
		 
		 while (b1 != 0) {
	            int temp = b1;	            
	            b1 = a1 % b1;
	            a1 = temp;            
	        }
		    mcd=a1;
		    
			mcm=(num1 * num2) / mcd;
			
			mcd1=mcd;
			mcm1=mcm;
			 while (mcm % 2 == 0) {
		            fattorimcm.add(2);
		            mcm /= 2;
		        }
				 for (int i = 3; i <= Math.sqrt(mcm); i += 2) {
			            while (mcm % i == 0) {
			                fattorimcm.add(i);
			                mcm /= i;
			            }		
				 }
				 if (mcm > 2) {
			            fattorimcm.add(mcm);
			        }
				 
				 while (mcd % 2 == 0) {
			            fattorimcd.add(2);
			            mcd /= 2;
			        }
				 for (int i = 3; i <= Math.sqrt(mcd); i += 2) {
			            while (mcd % i == 0) {
			                fattorimcd.add(i);
			                mcd /= i;
			            }		
				 }
				 if (mcd > 2) {
			            fattorimcd.add(mcd);
			        }

		System.out.println("mcm "+fattorimcm+" = "+mcm1+" l'mcd "+fattorimcd+" = "+mcd1); 
	}

}
