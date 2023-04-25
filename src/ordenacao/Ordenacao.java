package ordenacao;

import leitor.leitorCSV;
import objeto.generico;

public class Ordenacao {
    public generico<?, ?>[] objets;

    public Ordenacao() {
        this.objets = leitorCSV.leitor("src/dados/Sales1.csv");
    }

    public void ordenacaoAlg(MetodoOrdenacao metodoOrdenacao){
        metodoOrdenacao.ordenar(objets);
    }
}
