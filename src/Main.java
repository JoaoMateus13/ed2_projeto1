import leitor.LeitorArrays;
import objeto.obj;
import objeto.objOrdem;
import ordenacao.*;
import ordenacao.algoritmo.*;
import ordenacao.Ordenacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


           Scanner scanner = new Scanner(System.in);
           //Definir tipo da ordem e por qual item ordenar.
           System.out.println("1 - ORDENAR POR NOME DO PRODUTO\n2 - ORDENAR POR ID DO PRODUTO\n---------------------------");

           int opOrdenarPor = scanner.nextInt();

           System.out.println("---------------------------\n1 - CRESCENTE\n2 - DESCRESCENTE\n---------------------------");

           int opOrdemDeCrescimento = scanner.nextInt();


           Ordenacao ordenacao = new Ordenacao("src/dados/test2.csv", objOrdem.values()[opOrdenarPor-1],
                   objOrdem.values()[opOrdemDeCrescimento+1]);


           List<obj> objetos = LeitorArrays.ArrayListJDK("src/dados/test2.csv");




        //Ordenar por SelectSort
            System.out.println("-------------------------------SelectSort--------------------------------------------");
            //int opSelect = scanner.nextInt();
            double startTimeSelect = System.nanoTime();//Marcação do tempo em "ms" (inicio)
            Resultado resultadoSelect = ordenacao.algoritmo(new SelectSort());
            double elapsedTimeSelect = (System.nanoTime()-startTimeSelect)/1000000;//Marcação do tempo em "ms" (fim)
            System.out.println("Numero de trocas: " + resultadoSelect.getTrocas());
            System.out.println("Numero de comparações: " + resultadoSelect.getNumeroComparacoes());
            System.out.println("Tempo de execução: " + elapsedTimeSelect + "ms");
            System.out.println("-----------------------------------\n");

        //Ordenar por InsertSort
            System.out.println("--------------------------------InsertSort--------------------------------------------");
            //int opInsert = scanner.nextInt();
            double startTimeInsert = System.nanoTime();//Marcação do tempo em "ms" (inicio)
            Resultado resultadoInsert = ordenacao.algoritmo(new InsertSort());
            double elapsedTimeInsert = (System.nanoTime()-startTimeInsert)/1000000;//Marcação do tempo em "ms" (fim)
            System.out.println("Numero de trocas: " + resultadoInsert.getTrocas());
            System.out.println("Numero de comparações: " + resultadoInsert.getNumeroComparacoes());
            System.out.println("Tempo de execução: " + elapsedTimeInsert + "ms");
            System.out.println("-----------------------------------\n");


        //Ordenar por HeapSort
            System.out.println("----------------------------------HeapSort-------------------------------------------");
            //int opHeap = scanner.nextInt();
            double startTimeHeap = System.nanoTime();//Marcação do tempo em "ms" (inicio)
            Resultado resultadoHeap = ordenacao.algoritmo(new HeapSort());
            double elapsedTimeHeap = (System.nanoTime()-startTimeHeap)/1000000;//Marcação do tempo em "ms" (fim)
            System.out.println("Numero de trocas: " + resultadoHeap.getTrocas());
            System.out.println("Numero de comparações: " + resultadoHeap.getNumeroComparacoes());
            System.out.println("Tempo de execução: " + elapsedTimeHeap + "ms");
            System.out.println("-----------------------------------\n");

        //Ordenar por QuicSort
            System.out.println("-----------------------------------QuickSort------------------------------------------");
            //int opQuic = scanner.nextInt();
            double startTimeQuic = System.nanoTime();//Marcação do tempo em "ms" (inicio)
            Resultado resultadoQuic = ordenacao.algoritmo(new QuickSort());
            double elapsedQuic = (System.nanoTime()-startTimeQuic)/1000000;//Marcação do tempo em "ms" (fim)
            System.out.println("Numero de trocas: " + resultadoQuic.getTrocas());
            System.out.println("Numero de comparações: " + resultadoQuic.getNumeroComparacoes());
            System.out.println("Tempo de execução: " + elapsedQuic + "ms");
            System.out.println("-----------------------------------\n");


        //Ordenar por MergeSort
            System.out.println("----------------------------------MergeSort------------------------------------------");
            //int opMerge= scanner.nextInt();
            double startTimeMerge = System.nanoTime();//Marcação do tempo em "ms" (inicio)
            Resultado resultadoMerge = ordenacao.algoritmo(new MergeSort());
            double elapsedMerge = (System.nanoTime()-startTimeMerge)/1000000;//Marcação do tempo em "ms" (fim)
            System.out.println("Numero de trocas: " + resultadoMerge.getTrocas());
            System.out.println("Numero de comparações: " + resultadoMerge.getNumeroComparacoes());
            System.out.println("Tempo de execução: " + elapsedMerge + "ms");
            System.out.println("-----------------------------------\n");

        //JDK MERGE
        System.out.println("----------------------------------MergeSortJDK------------------------------------------");
        //int opOrdemDeCrescimento1 = scanner.nextInt();
        double startTimeJDKMerge = System.nanoTime();//Marcação do tempo em "ms" (inicio)
        objetos.sort(obj::compareTo);
        double elapsedTimeJDKMerge = (System.nanoTime()-startTimeJDKMerge)/1000000;//Marcação do tempo em "ms" (fim)
        System.out.println("Tempo de execução: " + elapsedTimeJDKMerge);


        //Ordenar por SiSort
            System.out.println("----------------------------------SiSort---------------------------------------------");
            //int opSi= scanner.nextInt();
            double startTimeSi = System.nanoTime();//Marcação do tempo em "ms" (inicio)
            Resultado resultadoSi = ordenacao.algoritmo(new SISort(20));
            double elapsedSi = (System.nanoTime()-startTimeSi)/1000000;//Marcação do tempo em "ms" (fim)
            System.out.println("Numero de trocas: " + resultadoSi.getTrocas());
            System.out.println("Numero de comparações: " + resultadoSi.getNumeroComparacoes());
            System.out.println("Tempo de execução: " + elapsedSi + "ms");
            System.out.println("-----------------------------------");


    }

}

