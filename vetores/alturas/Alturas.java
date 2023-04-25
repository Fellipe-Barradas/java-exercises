package vetores;
//Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar natela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,bem como os nomes dessas pessoas caso houver

public class Alturas {
		
	private String name;
	private int age;
	private double heigth;
	
	public Alturas(String name, int age, double heigth) {
		this.name = name;
		this.age = age;
		this.heigth = heigth;
	}

	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}


	public double getHeigth() {
		return heigth;
	}

	
	
	
	
}
