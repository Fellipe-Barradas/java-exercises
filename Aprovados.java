package vetores;
//Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
//no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
//os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
//igual a 6.0 (seis).

import java.util.Scanner;
import java.util.Locale;
public class Aprovados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Quantas alunos serão digitados: ");
		int n = input.nextInt();
		
		Alunos[] vector = new Alunos[n];
		
		//Adicionar as notas no sistema
		for(int i = 0; i < vector.length; i++) {
			System.out.println("Digite o nome, primeira e segunda nota do " + (i+1) + "°aluno:");
			vector[0] = new Alunos(input.next(), input.nextDouble(), input.nextDouble());
		}
		
		//Mostrar quem passou na média de 6
		System.out.println("Alunos aprovados: ");
		for(int i = 0; i < vector.length - 1; i++) {
			if(vector[i].getMedia() > 6) {
				System.out.println(vector[i].getName());
			}
			
		}

	}

}
