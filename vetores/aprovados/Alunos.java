package vetores;

public class Alunos {
	private String name;
	private double media;
	
	public Alunos(String name, double nota1, double nota2) {
		this.name = name;
		setMedia(nota1, nota2);
	}
	
	public String getName() {
		return name;
	}
	
	public void setMedia(double nota1, double nota2) {
		media = (nota1 + nota2) / 2; 
	}
	
	public double getMedia() {
		return media;
	}
	
}
