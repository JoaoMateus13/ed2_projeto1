package ordenacao;

import leitor.Leitor;
import objeto.generico;
import objeto.objOrdem;

public class Ordenacao {
    public generico<?, ?>[] objets;

    public Ordenacao(String caminho, objOrdem ordenarPor, objOrdem ordemDeCrescimento) {
        this.objets = Leitor.leitor(caminho, ordenarPor, ordemDeCrescimento);
    }

    /*public void ordenacaoAlg(MetodoOrdenacao metodoOrdenacao){
        metodoOrdenacao.ordenar(objets);
    }*/

    public void algoritmo(MetodoOrdenacao metodoOrdenacao){
        metodoOrdenacao.ordenar(objets);
    }
}
