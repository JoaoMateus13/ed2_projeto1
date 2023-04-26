package ordenacao;

import leitor.Leitor;
import leitor.leitorCSV;
import objeto.generico;

public class Ordenacao {
    public generico<?, ?>[] objets;

    public Ordenacao(String caminho, int i) {
        this.objets = Leitor.leitor(caminho, i);
    }

    public void ordenacaoAlg(MetodoOrdenacao metodoOrdenacao){
        metodoOrdenacao.ordenar(objets);
    }
}
