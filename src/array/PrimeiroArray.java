package array;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class PrimeiroArray {

	public static void main(String[] args) {
		
		
		
		//Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantidade de alturas: ");
		
		int qtdAltura = sc.nextInt();
		
		//vetor do tipo primitivo
		double alturas[] = new double [qtdAltura];
		//Array altura[] = new Array[(int) qtdAltura];
		
		for (int i = 0; i < alturas.length; i++) {
			
			System.out.println("Digite a altura: " + (i + 1));
			// inserindo alturas em cada posição
			alturas[i] = sc.nextDouble();
		}
		
	
		double soma  = 0.0;
		
		for (int i = 0; i < alturas.length; i++) {
			
			soma += alturas[i];
		}
		
		double media = soma / alturas.length;
		
		System.out.println("A média das alturas é: "  + media);

		
		sc.close();
	}

}
