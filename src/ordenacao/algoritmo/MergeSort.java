package ordenacao.algoritmo;

import objeto.generico;
import ordenacao.MetodoOrdenacao;
import ordenacao.Resultado;

public class MergeSort implements MetodoOrdenacao {
    static int trocas =0;
    static int numeroComparacoes=0;
    @Override
    public Resultado ordenar(generico<?, ?>[] vetor) {
        generico<?, ?>[] temp = new generico[vetor.length];

        mergeMain(vetor, temp, 0, vetor.length-1);

        return new Resultado(vetor,trocas,numeroComparacoes);
    }

    private static generico<?, ?>[] mergeMain(generico<?, ?>[] vetor, generico<?, ?>[] temp, int esq, int dir) {
        int meio;

        if(esq < dir){
            meio = (esq+dir)/2;
            mergeMain(vetor, temp, esq, meio);
            mergeMain(vetor, temp, meio+1, dir);
            merge(vetor, temp, esq, meio+1, dir);
        }
        numeroComparacoes++;

        return vetor;
    }

    private static void merge(generico<?, ?>[] vetor, generico<?, ?>[] temp, int esqPos, int dirPos, int dirFim) {
        int esqFim = dirPos-1;
        int tempPos = esqPos;
        int numElem = dirFim - esqPos + 1;

        while(esqPos <= esqFim && dirPos <= dirFim) {
            if(vetor[esqPos].compararCom(vetor[dirPos].getKey()) <= 0){
                temp[tempPos++] = vetor[esqPos++];
                trocas++;
                numeroComparacoes++;
            } else {
                temp[tempPos++] = vetor[dirPos++];
                trocas++;
                numeroComparacoes++;
            }
        }

        while(esqPos <= esqFim) {
            temp[tempPos++] = vetor[esqPos++];
            trocas++;
            numeroComparacoes++;

        }

        while(dirPos <= dirFim) {
            temp[tempPos++] = vetor[dirPos++];
            trocas++;
            numeroComparacoes++;
        }

        for(int i = 0; i < numElem; i++, dirFim--) {
            vetor[dirFim] = temp[dirFim];
            trocas++;
            numeroComparacoes++;
        }

    }
}
