package ordenacao;

import objeto.generico;

public class Resultado {

    private generico<?,?>[] vetor;
    private int trocas;

    private int numeroComparacoes;


    public Resultado(generico<?, ?>[] vetor, int trocas, int numeroComparacoes) {
        this.vetor = vetor;
        this.trocas = trocas;
        this.numeroComparacoes = numeroComparacoes;
    }


    public generico<?, ?>[] getVetor() {
        return vetor;
    }

    public int getTrocas() {
        return trocas;
    }

    public int getNumeroComparacoes() {
        return numeroComparacoes;
    }

    @Override
    public String toString() {
        return "Resultado{" +
                "trocas=" + trocas +
                ", numeroComparacoes=" + numeroComparacoes +
                '}';
    }
}
