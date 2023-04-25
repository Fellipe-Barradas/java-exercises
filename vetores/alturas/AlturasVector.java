package vetores;
import java.util.Scanner;
import java.util.Locale;

public class AlturasVector {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Quantos pessoas serão digitadas?  ");
		int pessoas = input.nextInt();
		
		//Criando o vetor que vai armazenar todos as variaveis de referencia
		Alturas[] vector = new Alturas[pessoas];
		
		//Adicionando dados aos vetores
		int contadorMenor = 0; //Quantidade de pessoas com menos de 16
		for(int i = 0; i < vector.length; i++) {
			System.out.printf("Dados da %d° pessoa:%n", i + 1);
			
			System.out.print("Nome: ");
			String name = input.next();
			System.out.print("Idade: ");
			int idade = input.nextInt();
			if(idade < 16) {
				contadorMenor++;
			}
			System.out.print("Altura: ");
			double altura = input.nextDouble();
			
			vector[i] = new Alturas(name, idade, altura);
		}
		
		
		System.out.printf("%nAltura média: %.2f %n",mediaAltura(vector));
		System.out.printf("Pessoas com menos de 16 anos: %.0f%% %n",((double)contadorMenor / vector.length * 100));
		menor(vector);
	}
	
	//Altura média dos elementos do vetor
	public static float mediaAltura(Alturas[] vector) {
		float sun = 0;
		for(int i = 0; i < vector.length; i++) {
			sun += vector[i].getHeigth();
		}
		return sun / vector.length;
	}
	
	
	//Mostrar as pessoas com menos de 16 anos
	public static void menor(Alturas[] vector) {
		for(int i = 0; i < vector.length; i++) {
			if(vector[i].getAge() < 16) {
				System.out.println(vector[i].getName());
			}

		}
	}
}
