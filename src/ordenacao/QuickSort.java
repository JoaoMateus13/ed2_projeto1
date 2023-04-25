package ordenacao;

import objeto.generico;

public class QuickSort implements MetodoOrdenacao{
    @Override
    public void ordenar(generico<?, ?>[] vetor) {
        quickSort(vetor, 0, vetor.length-1);
    }

    private static void quickSort(generico<?, ?>[] vetor, int inicio, int fim) {
        if(inicio < fim) {
            int posicaoPivo = particiona(vetor, inicio, fim);

            quickSort(vetor, inicio, posicaoPivo - 1);
            quickSort(vetor, posicaoPivo + 1, fim);
        }
    }

    private static int particiona(generico<?, ?>[] vetor, int inicio, int fim) {
        generico<?, ?> pivo = vetor[inicio];
        int i = inicio + 1;
        int f = fim;

        while(i <= f) {
            if(vetor[i].compararCom(pivo.getKey()) <= 0) {
                i++;
            } else if(vetor[f].compararCom(pivo.getKey()) > 0) {
                f--;
            } else {
                generico<?, ?> troca = vetor[i];
                vetor[i] = vetor[f];
                vetor[f] = troca;
                i++;
                f--;
            }
        }
        vetor[inicio] = vetor[f];
        vetor[f] = pivo;
        return f;
    }
}
