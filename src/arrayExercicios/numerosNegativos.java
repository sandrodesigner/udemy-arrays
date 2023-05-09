package arrayExercicios;

import java.util.Scanner;

//Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
//e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. 


public class numerosNegativos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	
		System.out.print("Quantos numeros vc quer digitar? ");
	
		int qtdNumero = sc.nextInt();
		
		int [] arrayNumeros = new int [qtdNumero];
		
		for (int i = 0; i < arrayNumeros.length; i++) {
			
		    System.out.println("Digite o numero " + (i + 1));
		    
		     arrayNumeros[i] = sc.nextInt();
		}
		
		
		
		System.out.println("Voçe deseja os números NEGATIVOS ou POSITIVOS");
		System.out.println("Digite 1 SIM ou 0 para NÃO: ");
		
		int sim = 0;
		
		if (sim == 0) {
			
            System.out.println("NUMEROS POSITIVOS ");
			
			for (int i = 0; i < arrayNumeros.length; i++) {
				
				if(arrayNumeros[i] > 0 ) {
					
			     System.out.println(arrayNumeros[i]);
					
				}
			}
			
		} else {

            System.out.println("NUMEROS NEGATIVOS ");
			
			for (int i = 0; i < arrayNumeros.length; i++) {
				
				if(arrayNumeros[i] < 0 ) {
					
			     System.out.println(arrayNumeros[i]);
					
				}
			}
		}
		
		
		sc.close();
	}
}
