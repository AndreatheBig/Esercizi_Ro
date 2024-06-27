package esercizi;

public class ArrayAlternato {

	public static void main(String[] args) {
		
		int[]input= {5,14,90,6,7,32,58};
		
		
		for(int i=0, d=input.length; i< input.length/2; i++ ,d--){
			
			System.out.print(" "+ input[i]+" "+input[d-1]);
			
			}
		System.out.println();
		
		
			for(int i=0; i< input.length/2; i++) {
	
			System.out.print(" "+input[i]+" "+input[(input.length-i)-1]);
			
		}
		
		

	}

}
