package pctExercicio5b;

public class Exercicio5b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] [] matriz = new int [3] [4];

		
		// Atribuição de valores á matriz
		
		matriz [0] [0] = 19 ;
		matriz [0] [1] = 25 ;
		matriz [0] [2] = 100 ;
		matriz [0] [3] = 99 ;
		
		
		matriz [1] [0] = 10 ;
		matriz [1] [1] = 7 ;
		matriz [1] [2] = 25 ;
		matriz [1] [3] = 14 ;

		
		matriz [2] [0] = 35 ;
		matriz [2] [1] = 2 ;
		matriz [2] [2] = 47 ;
		matriz [2] [3] = 74 ;


		// Impresão da matriz
		
		for (int i= 0 ; i <3 ; i++) {
			
			for (int j = 0; j < 4 ; j++) {
				System.out.print(" | " + matriz [i][j]+ "");
			}
			System.out.print(" | ");
			System.out.println();
		}
		
	}

}
