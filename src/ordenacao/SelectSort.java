package ordenacao;

import objeto.generico;

public class SelectSort {

    public static void ordenar(generico<?, ?>[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < vetor.length; j++) {
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

}
