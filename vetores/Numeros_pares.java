package vetores;
//Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre natela todos os números pares, e também a quantidade de números pares.
import java.util.Scanner;
import java.util.Locale;

public class Numeros_pares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Quantos numeros você vai digitar? ");
		int n = input.nextInt();
		
		int pares = 0; //contador de numeros pares
		int[] vector = new int[n]; // vetor que armazenara os numeros pares
		
		for(int i = 0; i < vector.length; i++) {
			System.out.print("Digite um numero: ");
			int num = input.nextInt();
			if(num % 2 == 0) {		
				pares++;
			}
			vector[i] = num;
		}
		
		numeros_pares(vector);
		System.out.println(" ");
		System.out.println("Quantidade de pares = " + pares);
	}
	
	//Mostrar os numeros pares na tela
	public static void numeros_pares(int[] vector) {
		System.out.println("NUMEROS PARES:");
		for(int i = 0; i < vector.length; i++) {
			if(vector[i] % 2 == 0) {
				System.out.print(vector[i] + " ");
			}
		}
	}

}
