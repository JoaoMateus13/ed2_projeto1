package ordenacao;

import objeto.generico;

public class SISort implements  MetodoOrdenacao{


    private double percentual;

    public SISort(double percentual) {
        this.percentual = percentual;
    }


    @Override
    public void ordenar(generico<?, ?>[] vetor) {
        int n = vetor.length;
        int inicio = (int) (n * percentual / 100.0);
        int fim = n - (int) (n * percentual / 100.0) - 1;

        ordenarSelect(vetor, 0, inicio-1);
        ordenarSelect(vetor, fim+1, n-1);

        ordenarInsert(vetor, inicio, fim);

    }


    public void ordenarSelect(generico<?, ?>[] vetor, int inicio, int fim) {
        for (int i = inicio; i < fim - 1; i++) {
            int min = i;
            for (int j = i + 1; j <= fim; j++) {
                if (vetor[j].compararCom(vetor[min].getKey()) < 0) {
                    // Se o retorno do método for menor que 0, então o valor que está em "j" é menor que o que está em "min"
                    min = j;
                }
            }

            generico<?, ?> aux = vetor[i];
            vetor[i] = vetor[min];
            vetor[min] = aux;
        }
    }



    public void ordenarInsert(generico<?, ?>[] vetor, int inicio, int fim) {
        generico<?, ?> chave;
        for(int i = inicio+1; i <= fim; i++) {
            chave = vetor[i];
            int j;
            for(j = i-1; j >= inicio && vetor[j].compararCom(chave.getKey()) > 0; j--) {
                vetor[j+1] = vetor[j];
            }
            vetor[j+1] = chave;
        }

    }

}
