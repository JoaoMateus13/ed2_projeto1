package ordenacao.algoritmo;

import objeto.generico;
import ordenacao.MetodoOrdenacao;
import ordenacao.Resultado;

public class InsertSort implements MetodoOrdenacao {
    public Resultado ordenar(generico<?, ?>[] vetor) {
        int numeroComparacoes =0;
        int trocas =0;
        generico<?, ?> chave;
        for(int i = 1; i < vetor.length; i++) {
            chave = vetor[i];
            int j;
            for(j = i-1; j >= 0 && vetor[j].compararCom(chave.getKey()) > 0; j--) {
                vetor[j+1] = vetor[j];
                trocas++;
                numeroComparacoes++;
            }
            vetor[j+1] = chave;
            trocas++;
        }

        return new Resultado(vetor,trocas, numeroComparacoes);
    }
}
