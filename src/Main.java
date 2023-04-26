import ordenacao.InsertSort;
import ordenacao.Ordenacao;
import ordenacao.SelectSort;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Ordenacao ordenacao = new Ordenacao("src/dados/Sales.csv", 2);



        for (int i = 0; i < ordenacao.objets.length; i++) {
            System.out.println(ordenacao.objets[i].getvalue());
        }


        System.out.println("-----------------------------------------------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        int op = scanner.nextInt();
        double startTime = System.nanoTime();
        //ordenacao.ordenacaoAlg(new SelectSort());
        ordenacao.ordenacaoAlg(new InsertSort());
        double elapsedTime = (System.nanoTime()-startTime)/1000000;
        System.out.println("-----------------------------------");

        int op1 = scanner.nextInt();
        double startTime1 = System.nanoTime();
        ordenacao.ordenacaoAlg(new InsertSort());
        double elapsedTime1 = (System.nanoTime()-startTime1)/1000000;


        for (int i = 0; i < ordenacao.objets.length; i++) {
            System.out.println(ordenacao.objets[i].getvalue());
        }

        System.out.println(elapsedTime + "ms");
        System.out.println(elapsedTime1 + "msAAA");

    }
}