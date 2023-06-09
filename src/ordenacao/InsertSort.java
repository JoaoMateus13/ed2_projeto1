package ordenacao;

import objeto.generico;

public class InsertSort {
    public static void ordenar(generico<?, ?>[] vetor) {
        generico<?, ?> chave;
        for(int i = 1; i < vetor.length; i++) {
            chave = vetor[i];
            int j;
            for(j = i-1; j >= 0 && vetor[j].compararCom(chave.getKey()) > 0; j--) {
                vetor[j+1] = vetor[j];
            }
            vetor[j+1] = chave;
        }

    }
}
