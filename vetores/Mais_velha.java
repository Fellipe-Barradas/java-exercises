package vetores;
//Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
//devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
//da pessoa mais velha.

import java.util.Scanner;
import java.util.Locale;
public class Mais_velha {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Quantas pessoas você vai digitar: ");
		int n = input.nextInt();
		
		//Criando o array
		String[] nomes = new String[n];
		int[] idades = new int[n];
		
		//Adicionar os dados no array
		for(int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i+1)+"° pessoa:");
			
			System.out.print("Nome:");
			nomes[i] = input.next();
			
			System.out.println("Idade:");
			idades[i] = input.nextInt();
			
		}
		
		
		int maiorIdade = idades[0];
		int maiorIndex = 0;
		
		//Buscar a pessoa mais velha
		for(int i = 0; i < n;i++) {
			if(idades[i] > maiorIdade) {
				maiorIdade = idades[i];
				maiorIndex = i;
			}
		}
		
		//Mostrar quem a pessoa mais velha
		System.out.println("MAIS VELHA: " + nomes[maiorIndex]);
		

	}

}
