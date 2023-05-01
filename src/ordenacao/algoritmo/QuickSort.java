package ordenacao.algoritmo;

import objeto.generico;
import ordenacao.MetodoOrdenacao;
import ordenacao.Resultado;
import org.jetbrains.annotations.NotNull;

public class QuickSort implements MetodoOrdenacao {

    static int trocas =0;
    static int numeroComparacoes =0;

    @Override
    public Resultado ordenar(generico<?, ?>[] vetor) {
        quickSort(vetor, 0, vetor.length-1);

        return new Resultado(vetor, trocas,numeroComparacoes);
    }

    private static void quickSort(generico<?, ?>[] vetor, int esquerda, int direita) {
            if(esquerda < direita){
                int posicaoPivo = particiona(vetor, esquerda, direita);

                quickSort(vetor, esquerda, posicaoPivo);
                quickSort(vetor, posicaoPivo + 1, direita);
            }
        }

            private static int particiona(generico<?, ?> [] vetor, int esquerda, int direita) {
            generico<?, ?> pivo = vetor[(int) (esquerda+direita)/2];
            int i = esquerda-1;
            int f = direita+1;

            while (true){
                numeroComparacoes+=2;
                do{
                    i++;
                }while (vetor[i].compararCom(pivo.getKey()) < 0 );
                do {

                    f--;
                }while (vetor[f].compararCom(pivo.getKey()) > 0);
                if (i>=f){
                    return f;
                }
                generico<?,?> aux = vetor[i];
                vetor[i] = vetor[f];
                vetor[f] = aux;
                trocas++;
                }
            }

    }