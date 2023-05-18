package pctExercicio1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int cpf=0 , cpf1=0 , cpf2=0;
		int num=0 , num1=0 , num2=0;
		
		
		String [] [] clientes = new String [3] [4];
		int [] [] clientes1 = new int [3] [4];
		
		
		System.out.println("Digite o seu cpf:");
		cpf = entrada.nextInt();	
		
		System.out.println("Digite o seu cpf:");
		cpf1 = entrada.nextInt();	
		
		System.out.println("Digite o seu cpf:");
		cpf2 = entrada.nextInt();	
		
		System.out.println("Digite o seu numero:");
		num = entrada.nextInt();	
		
		System.out.println("Digite o seu numero:");
		num1 = entrada.nextInt();	
		
		System.out.println("Digite o seu numero:");
		num2 = entrada.nextInt();	
		
		
		//Atribuição de valores aos clientes
		clientes [0] [0] = "João" ;
		clientes [0] [1] = "Rua das flores, 123" ;
		clientes1 [0] [2] = cpf;
		clientes1 [0] [3] = num ;
		
		clientes [1] [0] = "Maria" ;
		clientes [1] [1] = "Avenida dos Anjos, 456" ;
		clientes1 [1] [2] = cpf1;
		clientes1 [1] [3] = num1;
		
		clientes [2] [0] = "Pedro" ;
		clientes [2] [1] = "Praça da Liberdade, 789" ;
		clientes1 [2] [2] = cpf2 ;
		clientes1 [2] [3] = num2 ;
		
		// Impresão dos clientes
		
		for (int i= 0 ; i<3 ; i++) {
			System.out.println("Nome:" + clientes [i] [0] );
			System.out.println("Endereço:" + clientes [i] [1] );
			System.out.println("CPF:" + clientes1 [i] [2] );
			System.out.println("Tefone:" + clientes1 [i] [3] );
			System.out.println();
		}
	}

}
