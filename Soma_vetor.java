package vetores;
//Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
//- Imprimir todos os elementos do vetor
//- Mostrar na tela a soma e a média dos elementos do vetor 
import java.util.Scanner;
import java.util.Locale;

public class Soma_vetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Quantos numeros você vai digitar: ");
		int n = input.nextInt();
		double vector[] = new double[n]; //criando o vetor para armazenar os dados
		
		//adicionando elemento no arry
		for(int i = 0; i < vector.length; i++) {
			System.out.print("Digite um numero: ");
			vector[i] = input.nextDouble();
		}
		
		showElements(vector);
		System.out.println("SOMA = "+somarElements(vector));
		mediaElements(vector);
		
	}
	
	//mostrar elementos do array
	public static void showElements(double[] vector) {
		System.out.print("Valores = ");
		for(int i = 0; i < vector.length; i++) {
			System.out.print(vector[i] + " | ");
		}
		System.out.println("");
	}
	
	//Soma dos elementos no array
	public static double somarElements(double[] vector) {
		double sum = 0;
		for(int i = 0; i < vector.length; i++) {
			sum += vector[i];
		}
		return sum;
	}
	
	//Calcular a media dos valores do array
	public static void mediaElements(double[] vector) {
		System.out.printf("MEDIA = %.2f", somarElements(vector) / vector.length);
	}
	
}
