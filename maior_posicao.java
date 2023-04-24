package vetores;
// Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
// o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
// considerando a primeira posição como 0 (zero). 

import java.util.Scanner;
import java.util.Locale;

public class maior_posicao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Quantos numeros você vai digitar? ");
		int n = input.nextInt();
		
		double[] vector = new double[n];
		
		//Adicionar os elementos no vetor
		for(int i = 0; i < vector.length; i++) {
			System.out.print("Digite um numero: ");
			vector[i] = input.nextDouble();
		}
		
		double maior = vector[0]; // Maior elemento
		int maiorIndex = 0; //Posição do menor elemento no vetor
		
		//Iterar pelo vetor e buscar maior elemento e posição
		for(int i = 0; i < vector.length; i++) {
			if(vector[i] > maior) {
				maior = vector[i];
				maiorIndex = i;
			}
		}
		
		System.out.println("MAIOR  VALOR = " + maior);
		System.out.println("POSIÇÃO DO MAIOR VALOR = " + maiorIndex);
	}
	

}
