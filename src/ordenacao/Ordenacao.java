package ordenacao;

import leitor.Leitor;
import leitor.leitorCSV;
import objeto.generico;

public class Ordenacao {
    public generico<?, ?>[] objets;

    public Ordenacao(String caminho, Integer ordenarPor, Integer ordemDeCrescimento) {
        this.objets = Leitor.leitor(caminho, ordenarPor, ordemDeCrescimento);
    }

    /*public void ordenacaoAlg(MetodoOrdenacao metodoOrdenacao){
        metodoOrdenacao.ordenar(objets);
    }*/

    public void ordenacaoAlg(MetodoOrdenacao metodoOrdenacao){
        metodoOrdenacao.ordenar(objets);
    }
}
