package pctExercicio5;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] [] matriz = new String [4] [5];

		
		// Atribuição de valores á matriz
		
		matriz [0] [0] = "a" ;
		matriz [0] [1] = "b" ;
		matriz [0] [2] = "c" ;
		matriz [0] [3] = "d" ;
		matriz [0] [4] = "e" ;
		
		matriz [1] [0] = "f" ;
		matriz [1] [1] = "g" ;
		matriz [1] [2] = "h" ;
		matriz [1] [3] = "i" ;
		matriz [1] [4] = "j" ;
		
		matriz [2] [0] = "l" ;
		matriz [2] [1] = "m" ;
		matriz [2] [2] = "n" ;
		matriz [2] [3] = "o" ;
		matriz [2] [4] = "p" ;
		
		matriz [3] [0] = "q" ;
		matriz [3] [1] = "r" ;
		matriz [3] [2] = "s" ;
		matriz [3] [3] = "t" ;
		matriz [3] [4] = "u" ;
		
		// Impresão da matriz
		
		for (int i= 0 ; i <4 ; i++) {
			
			for (int j = 0; j < 5 ; j++) {
				System.out.print("|" + matriz [i][j]+ " ");
			}
			System.out.print("|");
			System.out.println();
		}
		
	}

}
