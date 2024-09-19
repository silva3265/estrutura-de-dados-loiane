package estruturadados.vetor;

public class Vetor {

	private String[] elementos; // Vetor de elementos
	private int tamanho;

	public Vetor(int capacidade) {
		this.elementos = new String[capacidade]; // A capacidade estamos passando para o vetor
		this.tamanho = 0; // Variavel de Controle
	}

//	public void adiciona(String elemento) {
//		for (int i = 0; i < this.elementos.length; i++) { // Iterando todo o vetor
//			if (this.elementos[i] == null) { // verificando se o elemento na posição I esta null
//				this.elementos[i] = elemento; // se tiver, essa posição null recebe elemento
//				break; // o break vai parar a se ser executado na primeira posição que ele encontrar nula
//			}
//		}
//	}

//	public void adiciona(String elemento) throws Exception {
//		if (this.tamanho < this.elementos.length) { // Verificando se o tamanaho for Menor do que a capacidade do Vetor de Elementos
//			this.elementos[this.tamanho] = elemento; // adicionando o elemento
//			this.tamanho++; // incrementando 1
//		} else {
//			throw new Exception("Vetor já está cheio, não é possível adicionar mais elementos");
//		}
//	}

	public boolean adiciona(String elemento) {
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}

	public int tamanho() {
		return this.tamanho;
	}

	@Override
	public String toString() {

		StringBuilder s = new StringBuilder();
		s.append("[");

		for (int i = 0; i < this.tamanho - 1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}

		if (this.tamanho > 0) {
			s.append(this.elementos[this.tamanho - 1]);
		}

		s.append("]");

		return s.toString();
	}

}
