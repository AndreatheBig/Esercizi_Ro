package esercizi;

public class TrovaMaggioreEMinore {

	public static void main(String[] args) {
		
		int[] in= {10,20,72,35,40};
		int max;
		int min;
		
		max=in[0];
		min=in[0];
		
		for(int i=0; i<in.length; i++) {
			if(max<in[i]) {
				max=in[i];
			}
			if(in[i]<min) {
				min=in[i];
			}
		    
		}
		System.out.println("il massimo è "+max+" il minimo è "+ min);
	
	}

}
