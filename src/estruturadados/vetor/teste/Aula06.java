package estruturadados.vetor.teste;

import estruturadados.vetor.Vetor;

public class Aula06 {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(10);

		vetor.adiciona("elemento 1"); //0
		vetor.adiciona("elemento 2"); //1
		vetor.adiciona("elemento 3"); //2

		System.out.println(vetor.busca("elemento 1")); // vai retorna a posição 0 porque existe
		System.out.println(vetor.busca("elemento 4")); // vai retornar a posição -1 porque essa posição nao existe
	}

}
