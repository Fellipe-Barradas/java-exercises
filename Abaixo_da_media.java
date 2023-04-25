package vetores;
//Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
//mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
//os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.

import java.util.Scanner;
import java.util.Locale;
public class Abaixo_da_media {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);	
		Scanner input = new Scanner(System.in);
	
		System.out.print("Quantos elementos o vetor vai ter? ");
		int n = input.nextInt();
		
		double[] notas = new double[n]; // Criando vetor de notas
		
		for(int i = 0; i < notas.length; i++) {
			System.out.print("Digite um numero: ");
			notas[i] = input.nextDouble();
		}
		
		//Reaproveitar do exercicio Soma_vetor
		double media = Soma_vetor.somarElements(notas) / n;
		System.out.printf("MEDIA DO VETOR = %.2f", media);
		
		//Mostrar elementos abaixo da média
		System.out.println("\nElementos abaixo da média: ");
		for(int i = 0; i < notas.length; i++) {
			if(notas[i] < media) {
				System.out.println(notas[i]);
			}
		}
		
	}

}
