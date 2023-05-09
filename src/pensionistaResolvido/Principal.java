package pensionistaResolvido;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		Alugueis [] vectQuartos = new Alugueis[10];
		
		System.out.println("Quantidade de alunos:");
	    int qtdAlunos = sc.nextInt();
	    
	    for (int i = 1; i < qtdAlunos; i++) {
			System.out.println();
	    	System.out.println("Aluguel #" + i);
	    	
	    	System.out.println("Nome: ");
	    	sc.nextLine();
	    	String nome = sc.nextLine();
	    	
	    	System.out.println("Email: ");
	    	
	    	String email = sc.next();
	    	
	    	System.out.println("Numero do quarto:");
	    	int numeroQuarto = sc.nextInt();
	    	
	    	//instanciando objeto aluguel com parametros(nome e email)
	    	// e colocando dentro vetor na posição numeroQuarto q o usuario digitar
	    	vectQuartos[numeroQuarto] = new Alugueis( nome,email);
		}
	    
	    System.out.println();
	    System.out.println("Quartos ocupados");
	    
	    for (int i = 0; i < 10; i++) {
			
	    	if(vectQuartos[i] != null) {
	    		
	    		System.out.println(i + ":" + vectQuartos[i]);
	    	}
		}
		
	    sc.close();
	}
	
}
