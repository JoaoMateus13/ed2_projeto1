package ordenacao;

import objeto.generico;

public class QuickSort implements MetodoOrdenacao{
    @Override
    public void ordenar(generico<?, ?>[] vetor, Integer ordemDeCrescimento) {
        quickSort(vetor, 0, vetor.length-1, ordemDeCrescimento);
    }

    private static void quickSort(generico<?, ?>[] vetor, int inicio, int fim, Integer ordemDeCrescimento) {
        if(inicio < fim) {
            int posicaoPivo = particiona(vetor, inicio, fim, ordemDeCrescimento);

            quickSort(vetor, inicio, posicaoPivo - 1, ordemDeCrescimento);
            quickSort(vetor, posicaoPivo + 1, fim, ordemDeCrescimento);
        }
    }

    private static int particiona(generico<?, ?>[] vetor, int inicio, int fim, Integer ordemDeCrescimento) {
        generico<?, ?> pivo = vetor[inicio];
        int i = inicio + 1;
        int f = fim;

        while(i <= f) {
            if(vetor[i].compararCom(pivo.getKey(), ordemDeCrescimento) <= 0) {
                i++;
            } else if(vetor[f].compararCom(pivo.getKey(), ordemDeCrescimento) > 0) {
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
