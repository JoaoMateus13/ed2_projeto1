package ordenacao;

import objeto.generico;

public class MergeSort implements MetodoOrdenacao{
    @Override
    public void ordenar(generico<?, ?>[] vetor) {
        generico<?, ?>[] temp = new generico[vetor.length];

        mergeMain(vetor, temp, 0, vetor.length-1);
    }

    public static void ordenarInsertion(generico<?, ?>[] vetor) {
        generico<?, ?>[] temp = new generico[vetor.length];

        mergeMain(vetor, temp, 0, vetor.length-1);
    }

    private static generico<?, ?>[] mergeMain(generico<?, ?>[] vetor, generico<?, ?>[] temp, int esq, int dir) {
        int meio;

        if(esq < dir) {
            meio = (esq+dir)/2;
            mergeMain(vetor, temp, esq, meio);
            mergeMain(vetor, temp, meio+1, dir);
            merge(vetor, temp, esq, meio+1, dir);
        }

        return vetor;
    }

    private static void merge(generico<?, ?>[] vetor, generico<?, ?>[] temp, int esqPos, int dirPos, int dirFim) {
        int esqFim = dirPos-1;
        int tempPos = esqPos;
        int numElem = dirFim - esqPos + 1;

        while(esqPos <= esqFim && dirPos <= dirFim) {
            if(vetor[esqPos].compararCom(vetor[dirPos].getKey()) <= 0) {
                temp[tempPos++] = vetor[esqPos++];
            } else {
                temp[tempPos++] = vetor[dirPos++];
            }
        }

        while(esqPos <= esqFim) {
            temp[tempPos++] = vetor[esqPos++];
        }

        while(dirPos <= dirFim) {
            temp[tempPos++] = vetor[dirPos++];
        }

        for(int i = 0; i < numElem; i++, dirFim--) {
            vetor[dirFim] = temp[dirFim];
        }

    }
}
