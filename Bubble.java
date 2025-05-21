class Bubble {

	public static void main(String[] args) {

		int[] vetor = { 7, 12, 9, 11, 3 };
		int temp;

		listaVetor(vetor);
		for (int i = 0; i < vetor.length - 1; i++) {
			for (int j = 0; j < vetor.length - i - 1; j++) {
				if (vetor[j] > vetor[j + 1]) {
					temp = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = temp;
				}
				listaVetor(vetor);
			}
		}

	}

	public static void listaVetor(int[] vetor) {
		for (int x=0; x < vetor.length; x++) {
			if (x < vetor.length - 1) 
				System.out.print(vetor[x] + ", ");
			else
				System.out.println(vetor[x]);
		}
	}
}
