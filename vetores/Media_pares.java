package vetores;
//Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
//aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
//digitado, mostrar a mensagem "NENHUM NUMERO PAR"

import java.util.Scanner;
import java.util.Locale;
public class Media_pares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);	
		Scanner input = new Scanner(System.in);
		
		int somaPares = 0;
		int contadorPares = 0;	
		
		System.out.print("Numero de elementos no vetor: ");
		int n = input.nextInt();
		
		int[] vector = new int[n];
		
		//Adicionar os elementos ao vetor criado
		for(int i = 0; i < vector.length; i++) {
			System.out.print("Digite um numero: ");
			int num = input.nextInt();
			vector[0] = num;
			if(num % 2 == 0) {
				contadorPares++;
				somaPares += num;
			}
		}
		
		//Mostrar a media da soma dos numeros pares
		
		if(contadorPares == 0) {
			System.out.println("NENHUM NUMERO PAR");
		}
		else {
			double mediaPares = somaPares / contadorPares;
			System.out.println("MEDIA PARES = " + mediaPares);
		}
		
	}

}
