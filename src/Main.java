import objeto.objOrdem;
import ordenacao.*;
import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


           Scanner scanner = new Scanner(System.in);

           //Definir tipo da ordem e por qual item ordenar.
           System.out.println("1 - ORDENAR POR NOME DO PRODUTO\n2 - ORDENAR POR ID DO PRODUTO\n---------------------------");


           int opOrdenarPor = scanner.nextInt();


           System.out.println("---------------------------\n1 - CRESCENTE\n2 - DESCRESCENTE\n---------------------------");


           int opOrdemDeCrescimento = scanner.nextInt();




           Ordenacao ordenacao = new Ordenacao("src/dados/Sales142k.csv", objOrdem.values()[opOrdenarPor-1],
                   objOrdem.values()[opOrdemDeCrescimento+1]);




           for (int i = 0; i < ordenacao.objets.length; i++) {
               System.out.println(ordenacao.objets[i].getvalue());
           }


           System.out.println("-----------------------------------------------------------------------------------");
           int op = scanner.nextInt();
           double startTime = System.nanoTime();//Marcação do tempo em "ms" (inicio)
            Resultado resultado = ordenacao.algoritmo(new InsertSort());
           System.out.println(resultado.getTrocas());
           double elapsedTime = (System.nanoTime()-startTime)/1000000;//Marcação do tempo em "ms" (fim)
           System.out.println("-----------------------------------");


/*           int op1 = scanner.nextInt();
           double startTime1 = System.nanoTime();
             ordenacao.algoritmo(new InsertSort());
            //ordenacao.algoritmo(new SISort(10));
           double elapsedTime1 = (System.nanoTime()-startTime1)/1000000;


           for (int i = 0; i < ordenacao.objets.length; i++) {
               System.out.println(ordenacao.objets[i].getvalue());
           }*/

           System.out.println(elapsedTime + "ms");
        //    System.out.println(elapsedTime1 + "msAAA");



    }
}

