package pensionatoEstudantes;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
	    int numQuarto = 0;
	    String nome = null,email = null;
	    
		Scanner sc = new Scanner(System.in);
	    
		System.out.println("Quantidade de alunos:");
	    int qtdAlunos = sc.nextInt();	
		
		String[] vectNome = new  String[qtdAlunos];
		String[] vectEmail = new  String[qtdAlunos];
		int[] vectQuarto = new  int[qtdAlunos];
		
		for (int i = 0; i < qtdAlunos; i++) {
			
			System.out.println("NOME DO " + (i + 1) + " ALUNO");
			vectNome[i] = sc.next();
			
			System.out.println("EMAIL DO ALUNO");
			vectEmail[i] = sc.next();
			
			System.out.println("ESCOLHA UM QUARTO DE 1 A 10:");
			vectQuarto[i] = sc.nextInt();
			
			if(vectQuarto[i] > 10) {
				
				System.out.println("NÚMERO DE QUARTO INVÁLIDO!");
				
				System.out.println("");
				
				System.out.println("ESCOLHA UM QUARTO DE 1 A 10:");
				vectQuarto[i] = sc.nextInt();
				
				
			}
			
			
		}

		System.out.println("** Clientes hospedados **");
		for (int i = 0; i < qtdAlunos; i++) {
			
			System.out.println("NOME DO HOSPEDE: " + vectNome[i]);
			System.out.println("EMAIL: " + vectEmail[i]);
			System.out.println("QUARTO: " + vectQuarto[i]);
		}
	}

}
