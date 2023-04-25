package ordenacao;

import leitor.leitorCSV;
import objeto.generico;

public class Ordenacao {
    public generico<?, ?>[] objets;

    public Ordenacao(String caminho) {
        this.objets = leitorCSV.leitor(caminho);
    }

    public void ordenacaoAlg(MetodoOrdenacao metodoOrdenacao){
        metodoOrdenacao.ordenar(objets);
    }
}
