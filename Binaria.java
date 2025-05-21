
public class Binaria {

	public static void main(String[] args) {
		int[] vetor = {1, 3, 9, 11, 13, 16, 23, 35, 48, 51, 52, 60, 62, 67, 74, 76, 80, 85, 87, 88, 90, 95, 99};
		int elemento = 48; int  inicio  =  0 ; int meio = 0; int  fim  = vetor.length - 1 ; 
		
		while (inicio <= fim) { 
			listaVetor(vetor, inicio, fim);
			meio  = inicio + (fim - inicio) / 2 ; 

			if (vetor[meio] == elemento) { 
				System.out.println("Valor " + elemento + " encontrado na posição " + meio); 
				break;
			}
			if (vetor[meio] < elemento) 
				inicio = meio + 1 ; 
			else
				fim = meio - 1 ; 
		} 
		
	}
	
	public static void listaVetor(int[] vetor, int ini, int fim) {
		for (int x=ini; x <= fim; x++) {
			if (x < fim) 
				System.out.print(vetor[x] + ", ");
			else
				System.out.println(vetor[x]);
		}
	}

}
