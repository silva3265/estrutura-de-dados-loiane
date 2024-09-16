package estruturadados.vetor;

public class Vetor {

	private String[] elementos; // Vetor de elementos
	private int tamanho;

	public Vetor(int capacidade) {
		this.elementos = new String[capacidade]; // A capacidade estamos passando para o vetor
		this.tamanho = 0;
	}

}
