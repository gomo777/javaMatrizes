package pctExercicio4;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int[] vetorUm = new int[5];
		
		for (int i = 0; i < 5; i++) {

			System.out.println("digite um valor:");
			vetorUm[i] = entrada.nextInt();

		}
		
		
		for (int i = 4; i >=0; i--) {

			System.out.println(vetorUm[i]);


		}		
	}

}
