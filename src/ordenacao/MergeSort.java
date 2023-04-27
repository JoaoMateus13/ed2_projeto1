package ordenacao;

import objeto.generico;

public class MergeSort implements MetodoOrdenacao{
    @Override
    public void ordenar(generico<?, ?>[] vetor, Integer ordemDeCrescimento) {
        generico<?, ?>[] temp = new generico[vetor.length];

        mergeMain(vetor, temp, 0, vetor.length-1, ordemDeCrescimento);
    }

    public static void ordenarInsertion(generico<?, ?>[] vetor, Integer ordemDeCrescimento) {
        generico<?, ?>[] temp = new generico[vetor.length];

        mergeMainInsertion(vetor, temp, 0, vetor.length-1, ordemDeCrescimento);
    }

    private static generico<?, ?>[] mergeMainInsertion(generico<?, ?>[] vetor, generico<?, ?>[] temp, int esq, int dir,
                                                       Integer ordemDeCrescimento) {
        int meio;
        if(esq < dir) {
            int numElem = dir-esq+1;
            if(numElem > 15) {
                meio = (esq+dir)/2;
                mergeMain(vetor, temp, esq, meio, ordemDeCrescimento);
                mergeMain(vetor, temp, meio+1, dir, ordemDeCrescimento);
                merge(vetor, temp, esq, meio+1, dir, ordemDeCrescimento);
            } else { 						// Se o subconjunto tiver 15 elementos ou menos, o insertion sort é utilizado
                System.out.println(numElem);
                generico<?, ?> chave;
                for(int i = esq+1; i <= dir; i++) {
                    chave = vetor[i];
                    int j;
                    for(j = i-1; j >= esq && vetor[j].compararCom(chave.getKey(),ordemDeCrescimento) > 0; j--) {
                        vetor[j+1] = vetor[j];
                    }
                    vetor[j+1] = chave;
                }
            }
        }

        return vetor;
    }

    private static generico<?, ?>[] mergeMain(generico<?, ?>[] vetor, generico<?, ?>[] temp, int esq, int dir,
                                              Integer ordemDeCrescimento) {
        int meio;

        if(esq < dir) {
            meio = (esq+dir)/2;
            mergeMain(vetor, temp, esq, meio, ordemDeCrescimento);
            mergeMain(vetor, temp, meio+1, dir, ordemDeCrescimento);
            merge(vetor, temp, esq, meio+1, dir, ordemDeCrescimento);
        }

        return vetor;
    }

    private static void merge(generico<?, ?>[] vetor, generico<?, ?>[] temp, int esqPos, int dirPos, int dirFim,
                              Integer ordemDeCrescimento) {
        int esqFim = dirPos-1;
        int tempPos = esqPos;
        int numElem = dirFim - esqPos + 1;

        while(esqPos <= esqFim && dirPos <= dirFim) {
            if(vetor[esqPos].compararCom(vetor[dirPos].getKey(),ordemDeCrescimento) <= 0) {
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
