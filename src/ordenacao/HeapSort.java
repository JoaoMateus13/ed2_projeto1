package ordenacao;

import objeto.generico;

public class HeapSort implements MetodoOrdenacao{
    @Override
    public void ordenar(generico<?, ?>[] vetor, Integer ordemDeCrescimento) {
        buildMaxHeap(vetor, vetor.length-1,ordemDeCrescimento);
        for(int i = vetor.length - 1; i >= 1; i--) {
            generico<?, ?> aux = vetor[0];
            vetor[0] = vetor[i];
            vetor[i] = aux;
            maxHeapify(vetor, 0, i - 1, ordemDeCrescimento);
        }
    }

    private static void buildMaxHeap(generico<?, ?>[] vetor, int tamanho, Integer ordemDeCrescimento) {
        for(int i = (int)Math.floor((double)tamanho/2); i >= 0; i--) {
            //System.out.println(i);
            maxHeapify(vetor, i, tamanho, ordemDeCrescimento);
        }
    }

    private static void maxHeapify(generico<?, ?>[] vetor, int indice, int tamanhoAtual, Integer ordemDeCrescimento) {
        int e = esq(indice);
        int d = dir(indice);
        int maior;

        if(e <= tamanhoAtual && vetor[e].compararCom(vetor[indice].getKey(), ordemDeCrescimento) > 0) {
            maior = e;
        } else {
            maior = indice;
        }

        if (d <= tamanhoAtual && vetor[d].compararCom(vetor[maior].getKey(), ordemDeCrescimento) > 0) {
            maior = d;
        }


        if(maior != indice) {
            generico<?, ?> aux = vetor[maior];
            vetor[maior] = vetor[indice];
            vetor[indice] = aux;

            maxHeapify(vetor, maior, tamanhoAtual, ordemDeCrescimento);
        }
    }

    private static int esq(int indice) {
        return 2*indice;
    }

    private static int dir(int indice) {
        return 2*indice+1;
    }
}
