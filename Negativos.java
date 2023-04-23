package vetores;
//Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.

import java.util.Scanner;
import java.util.Locale;

public class Negativos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Quantos numeros você vai digitar? ");
		int n = input.nextInt();
		
		int vector[] = new int[n]; //criando o vetor para armazenar os dados
		
		for(int i = 0; i < vector.length; i++) {
			System.out.print("Digite um numero: ");
			int num = input.nextInt();
			
			while(num > 10) { // Verificar se é maior que dez
				System.out.print("Adicione um numero menor ou igual a 10: ");
				num = input.nextInt();
			}
			
			vector[i] = num;
		}
		
		negativos(vector);
		input.close();
	}
	
	// mostrar os numeros negativos na tela
	public static void negativos(int[] vector) {
		System.out.println("NUMEROS NEGATIVOS: ");
		for(int i = 0; i < vector.length; i++) {
			if(vector[i] < 0) {
				System.out.print(vector[i]);
			}
		}
	}


}

