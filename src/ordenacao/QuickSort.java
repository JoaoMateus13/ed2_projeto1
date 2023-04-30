package ordenacao;

import objeto.generico;
import org.jetbrains.annotations.NotNull;

public class QuickSort implements MetodoOrdenacao{

    static int trocas =0;

    @Override
    public Resultado ordenar(generico<?, ?>[] vetor) {
        quickSort(vetor, 0, vetor.length-1);

        return new Resultado(vetor, trocas);
    }

    private static void quickSort(generico<?, ?>[] vetor, int inicio, int fim) {
        if(inicio < fim) {
            int posicaoPivo = particiona(vetor, inicio, fim);

            quickSort(vetor, inicio, posicaoPivo - 1);
            quickSort(vetor, posicaoPivo + 1, fim);
        }
    }

    private static int particiona(@org.jetbrains.annotations.NotNull generico<?, ?> @NotNull [] vetor, int inicio, int fim) {
        generico<?, ?> pivo = vetor[inicio];
        int i = inicio + 1;
        int f = fim;

        while(i <= f) {
            if(vetor[i].compararCom(pivo.getKey()) <= 0) {
    //Se o retorno do método for menor ou igual que 0, então o valor que está em "i" é menor que o que está em "pivo"
                i++;
            } else if(vetor[f].compararCom(pivo.getKey()) > 0) {
    //Se o retorno do método for maior que 0, então o valor que está em "F" é maior que o que está em "pivo"
                f--;
            } else {
                generico<?, ?> troca = vetor[i];
                vetor[i] = vetor[f];
                vetor[f] = troca;
                i++;
                f--;
                trocas++;
            }

        }
        vetor[inicio] = vetor[f];
        vetor[f] = pivo;
        trocas++;
        return f;
    }

}
