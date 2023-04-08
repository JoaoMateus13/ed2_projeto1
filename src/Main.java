import leitor.leitorCSV;
import objeto.generico;
import ordenacao.SelectSort;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

  //      CsvReader.leitor("src/dados/Sales.csv");

        //ystem.out.println(CsvReader.leitor("src/dados/Sales.csv"));


        generico<?, ?>[] objetos = leitorCSV.leitor("src/dados/Sales1.csv");




        for (int i = 0; i < objetos.length; i++) {
            System.out.println(objetos[i].getvalue());
        }


        System.out.println("-----------------------------------------------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        int op = scanner.nextInt();
        double startTime = System.nanoTime();
        SelectSort.ordenar(objetos);

        //System.out.println("-----------------------------------------------------------------------------------");


       // InsertSort.ordenar(objetos);
        double elapsedTime = (System.nanoTime()-startTime)/1000000;
        //System.out.println(elapsedTime + "msAAA");
        System.out.println("-----------------------------------");

        int op1 = scanner.nextInt();
        double startTime1 = System.nanoTime();
        //InsertSort.ordenar(objetos);
        SelectSort.ordenar(objetos);
        double elapsedTime1 = (System.nanoTime()-startTime1)/1000000;
       // selectionSort.ordenar(objetos);





        for (int i = 0; i < objetos.length; i++) {
            System.out.println(objetos[i].getvalue());
        }

        System.out.println(elapsedTime + "ms");
        System.out.println(elapsedTime1 + "msAAA");

    }
}