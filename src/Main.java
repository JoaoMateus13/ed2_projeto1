import objeto.objOrdem;
import ordenacao.*;
import org.jetbrains.annotations.NotNull;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {




           Scanner scanner = new Scanner(System.in);

           System.out.println("1 - ORDENAR POR NOME DO PRODUTO\n2 - ORDENAR POR ID DO PRODUTO\n---------------------------");
           int opOrdenarPor = scanner.nextInt();
           System.out.println("---------------------------\n1 - CRESCENTE\n2 - DESCRESCENTE\n---------------------------");
           int opOrdemDeCrescimento = scanner.nextInt();




           Ordenacao ordenacao = new Ordenacao("src/dados/Sales1.csv", objOrdem.values()[opOrdenarPor-1],
                   objOrdem.values()[opOrdemDeCrescimento+1]);


           for (int i = 0; i < ordenacao.objets.length; i++) {
               System.out.println(ordenacao.objets[i].getvalue());
           }


           System.out.println("-----------------------------------------------------------------------------------");
           int op = scanner.nextInt();
           double startTime = System.nanoTime();
           //ordenacao.ordenacaoAlg(new SelectSort());
           //ordenacao.algoritmo(new InsertSort());
            ordenacao.algoritmo(new SISort(20));
           double elapsedTime = (System.nanoTime()-startTime)/1000000;
           System.out.println("-----------------------------------");

           int op1 = scanner.nextInt();
           double startTime1 = System.nanoTime();
            // ordenacao.algoritmo(new InsertSort());
            //ordenacao.algoritmo(new SISort(10));
           double elapsedTime1 = (System.nanoTime()-startTime1)/1000000;


           for (int i = 0; i < ordenacao.objets.length; i++) {
               System.out.println(ordenacao.objets[i].getvalue());
           }

           System.out.println(elapsedTime + "ms");
           System.out.println(elapsedTime1 + "msAAA");



    }
}

