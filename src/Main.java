import leitor.leitorCSV;
import objeto.generico;
import ordenacao.MetodoOrdenacao;
import ordenacao.Ordenacao;
import ordenacao.SelectSort;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Ordenacao ordenacao = new Ordenacao("src/dados/Sales.csv");



        for (int i = 0; i < ordenacao.objets.length; i++) {
            System.out.println(ordenacao.objets[i].getvalue());
        }


        System.out.println("-----------------------------------------------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        int op = scanner.nextInt();
        double startTime = System.nanoTime();

        ordenacao.ordenacaoAlg(new SelectSort());
        //System.out.println("-----------------------------------------------------------------------------------");


       // InsertSort.ordenar(objetos);
        double elapsedTime = (System.nanoTime()-startTime)/1000000;
        //System.out.println(elapsedTime + "msAAA");
        System.out.println("-----------------------------------");

        int op1 = scanner.nextInt();
        double startTime1 = System.nanoTime();
        //InsertSort.ordenar(objetos);
     //   SelectSort.ordenar(objetos);
        double elapsedTime1 = (System.nanoTime()-startTime1)/1000000;
       // selectionSort.ordenar(objetos);


        for (int i = 0; i < ordenacao.objets.length; i++) {
            System.out.println(ordenacao.objets[i].getvalue());
        }

        System.out.println(elapsedTime + "ms");
        System.out.println(elapsedTime1 + "msAAA");

    }
}