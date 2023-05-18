package pctMatrizesendereço;

public class Matrizesendereço {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] [] clientes = new String [3] [4];
		
		//Atribuição de valores aos clientes
		clientes [0] [0] = "João" ;
		clientes [0] [1] = "Rua das flores, 123" ;
		clientes [0] [2] = "149.769.145-81" ;
		clientes [0] [3] = "(15)997450107" ;
		
		clientes [1] [0] = "Maria" ;
		clientes [1] [1] = "Avenida dos Anjos, 456" ;
		clientes [1] [2] = "149.769.145-81" ;
		clientes [1] [3] = "(15)997450107" ;
		
		clientes [2] [0] = "Pedro" ;
		clientes [2] [1] = "Praça da Liberdade, 789" ;
		clientes [2] [2] = "149.769.145-81" ;
		clientes [2] [3] = "(15)997450107" ;
		
		// Impresão dos clientes
		
		for (int i= 0 ; i<3 ; i++) {
			System.out.println("Nome:" + clientes [i] [0] );
			System.out.println("Endereço:" + clientes [i] [1] );
			System.out.println("CPF:" + clientes [i] [2] );
			System.out.println("Tefone:" + clientes [i] [3] );
			System.out.println();
		}
		
	}

}
