package esercizi;

public class Es7_Matrici {

	public static void main(String[] args) {
		
		int[][]matrice=new int[3][3];
		int min=100;
		
		matrice[0][0]=3;
		matrice[0][1]=2;
		matrice[0][2]=1;
		matrice[1][0]=5;
		matrice[1][1]=9;
		matrice[1][2]=7;
		matrice[2][0]=11;
		matrice[2][1]=6;
		matrice[2][2]=44;
		
		for(int i=0;i<3;i++) {
			System.out.println();
			for(int j=0;j<3;j++) {
				if(matrice[i][j]<min) {
					min=matrice[i][j];
					System.out.println(min);
				}	
			}
		}
		
		

	}

}
