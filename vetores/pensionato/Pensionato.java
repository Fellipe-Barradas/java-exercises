package vetores;
import java.util.Scanner;
import java.util.Locale;

public class Pensionato {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int n = input.nextInt();
		
		//Criar o vetor com o numero de quartos total 10
		PensionatoRoom[] vetor = new PensionatoRoom[10];
		
		for(int i = 0; i < n; i++) {
			System.out.printf("RENT #%d%n", i+1);
			System.out.print("NAME: ");
			String name = input.next();
			
			System.out.print("Email: ");
			String email = input.next();
			
			System.out.print("ROOM: ");
			int room = input.nextInt();
			
			vetor[room] = new PensionatoRoom(name, email, room);
  		}
		
		 //Mostrar os quartos alugados
		System.out.println("Busy romms");
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] != null) {
				System.out.println(vetor[i]);
			}
		}
	}

}
