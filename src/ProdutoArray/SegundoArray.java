package ProdutoArray;

import java.util.Scanner;


public class SegundoArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantidade de produtos: ");
		int qtdProduto = sc.nextInt();
		
		//double[] produto = new double [qtdProduto];
		
		//vetor do tipo referencia
		Produto[] vectProduto = new Produto[qtdProduto];
		
		for (int i = 0; i < vectProduto.length; i++) {
			
			System.out.print("Nome do produto:" + (i + 1));
			String nome = sc.next();
			
			System.out.print("Valor do produto:");
			double valor  = sc.nextDouble();
			
			// instanciando novo produto apontando 
			// para outro produto
			vectProduto[i] = new Produto(nome, valor);
			
			System.out.println("..............");
		}
		
		double soma = 0.0;
		
		for (int i = 0; i < vectProduto.length; i++) {
			
			//somando o valor de cada posição do indice
			soma += vectProduto[i].getValor();
		}
		
		double media = soma / vectProduto.length;
		
		System.out.println("Média dos valores é " + media);
		
		sc.close();
	}
	
}
