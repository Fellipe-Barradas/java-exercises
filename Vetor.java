package vetores;

public class Vetor {
	
	private int[] vetor;
	
	//Construtor para adicionar o tamanho do vetor
	
	public Vetor(int n) {
		vetor = new int[n];
	}
	
	public void setElements(int i, int elem) {
		vetor[i] = elem;
	}
	
	public int getElements(int index) {
		return vetor[index];
	}
	
	public void getVector() {
		for(int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}
}
