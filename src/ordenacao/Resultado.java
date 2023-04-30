package ordenacao;

import objeto.generico;

public class Resultado {

    private generico<?,?>[] vetor;
    private int trocas;


    public Resultado(generico<?, ?>[] vetor, int trocas) {
        this.vetor = vetor;
        this.trocas = trocas;
    }


    public generico<?, ?>[] getVetor() {
        return vetor;
    }

    public int getTrocas() {
        return trocas;
    }
}
