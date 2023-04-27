package ordenacao;

import objeto.generico;

public class InsertSort implements MetodoOrdenacao{
    public void ordenar(generico<?, ?>[] vetor, Integer ordemDeCrescimento) {
        generico<?, ?> chave;
        for(int i = 1; i < vetor.length; i++) {
            chave = vetor[i];
            int j;
            for(j = i-1; j >= 0 && vetor[j].compararCom(chave.getKey(), ordemDeCrescimento) > 0; j--) {
                vetor[j+1] = vetor[j];
            }
            vetor[j+1] = chave;
        }

    }
}
