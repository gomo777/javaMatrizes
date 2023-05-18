package pctExercicio3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int[] vetorUm = new int[5];

		int soma = 0, med;

		for (int i = 0; i < 5; i++) {

			System.out.println("digite um valor");

			vetorUm[i] = entrada.nextInt();

		}
		// soma dos valores

		for (int i = 0; i < 5; i++) {

			soma = soma + vetorUm[i];

		}

		System.out.println("A soma dos vetores é :" + soma);

		med = soma / vetorUm.length;

		System.out.println("A media dos vetores é :" + med);

		for (int i = 0; i < 6; i++) {
			if (vetorUm[i] > med) {
				System.out.print("Os numero maior que a média é:" + vetorUm[i]);
				System.out.println(" ");
			}
			if (med > vetorUm[i] ) {
				System.out.print("Os numero menores que a média é:" + vetorUm[i]);
				System.out.println(" ");
				
		
			}
		}

	}
}
