package arrayExercicios;

import java.util.Iterator;
import java.util.Scanner;

//Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
//tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
//bem como os nomes dessas pessoas caso houver. 

public class arrayAlturas {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serao digitadas? ");
		int qtdPessoas = sc.nextInt();
		
		//Pessoa [] pessoas = new Pessoa[qtdPessoas];
		
		String[] nome =  new String[qtdPessoas];
		int[] idade = new int [qtdPessoas];
		double[] altura = new  double [qtdPessoas];
		
		for(int i = 0; i < qtdPessoas; i++){
			
			System.out.println("Dados do usuario " +(i + 1));
			System.out.print("Nome: ");
			nome[i] = sc.next();
			
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
			
		}
		
		//variavel soma vai receber a quantidade de alturas
		double soma = 0;
		for (int i = 0; i < qtdPessoas; i++) {
			
			soma += altura[i];
		}
		//calculo media altura
		double mediaAltura = soma / qtdPessoas;
		
		System.out.printf("Média das alturas: %.2f%n " , mediaAltura);
		
		
		//calculo media idade
		int cont = 0;
		// esse "int i" esta contando a qtd de pessoas digitadas
		for (int i = 0; i < qtdPessoas; i++) {
			
			if(idade[i] < 16) {
	    // esse "CONT" esta contando as pessoas com menos de 16
				cont += 1;
				
			}
			
			
		}
		
		double porcentagem = cont * 100.0 / qtdPessoas;
		
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n" , porcentagem);
		
	    for (int i = 0; i < qtdPessoas; i++) {
			
	    	if(idade[i] < 16) {
	    		
	    		System.out.println(nome[i]);
	    	}
		}
		sc.close();		

	}

}
