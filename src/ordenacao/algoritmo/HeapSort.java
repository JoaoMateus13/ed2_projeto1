package ordenacao.algoritmo;

import objeto.generico;
import ordenacao.MetodoOrdenacao;
import ordenacao.Resultado;

public class HeapSort implements MetodoOrdenacao {

    static int trocas = 0;
    static int numeroComparacoes =0;

    @Override
    public Resultado ordenar(generico<?, ?>[] vetor) {
        buildMaxHeap(vetor, vetor.length-1);
        for(int i = vetor.length - 1; i >= 1; i--) {
            generico<?, ?> aux = vetor[0];
            vetor[0] = vetor[i];
            vetor[i] = aux;
            trocas++;
            maxHeapify(vetor, 0, i - 1);
        }
        return new Resultado(vetor, trocas, numeroComparacoes);
    }

    private static void buildMaxHeap(generico<?, ?>[] vetor, int tamanho) {
        for(int i = (int)Math.floor((double)tamanho/2); i >= 0; i--) {
            //System.out.println(i);
            maxHeapify(vetor, i, tamanho);
        }
    }

    private static void maxHeapify(generico<?, ?>[] vetor, int indice, int tamanhoAtual) {
        int e = esq(indice);
        int d = dir(indice);
        int maior;

        if(e <= tamanhoAtual && vetor[e].compararCom(vetor[indice].getKey()) > 0) {
            maior = e;
        } else{
            maior = indice;
        }
        numeroComparacoes++;

        if (d <= tamanhoAtual && vetor[d].compararCom(vetor[maior].getKey()) > 0){
            maior = d;
        }
        numeroComparacoes++;
        numeroComparacoes++;
        if(maior != indice){
            generico<?, ?> aux = vetor[maior];
            vetor[maior] = vetor[indice];
            vetor[indice] = aux;
            trocas++;

            maxHeapify(vetor, maior, tamanhoAtual);
        }
    }

    private static int esq(int indice) {
        return 2*indice;
    }

    private static int dir(int indice) {
        return 2*indice+1;
    }
}
