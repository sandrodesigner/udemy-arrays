package arrayExercicios;

import java.util.Scanner;

public class somarVetores {
//Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
	//- Imprimir todos os elementos do vetor
	//- Mostrar na tela a soma e a média dos elementos do vetor 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos numeros voce vai digitar? ");
		int numero = sc.nextInt();
		
		int [] vetorNumero = new int [numero];
		
		
		//usuario digite os valores 
		for (int i = 0; i < vetorNumero.length; i++) {
		
			System.out.println("DIGITE O VALOR ");
			vetorNumero[i] = sc.nextInt();
		}
		
		
		int soma = 0;
		for (int i = 0; i < vetorNumero.length; i++) {
			
			soma += vetorNumero[i];
			
		}
		
		int media = soma / vetorNumero.length;
		
		System.out.println("VALORES " + vetorNumero );
		System.out.println("SOMA " + soma);
		System.out.println("MÉDIA " + media);
		
		sc.close();
	}
	

}
