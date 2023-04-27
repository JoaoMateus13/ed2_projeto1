package leitor;
import objeto.generico;
import objeto.obj;
import objeto.objOrdem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class leitorCSV{


    public static generico<?, ?>[] leitorCSV(String caminho, int i, objOrdem ordemDeCrescimento){
        String line = "";
        String csvDelimiter = ",";
        int cont = 0;
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yy HH:mm");

        generico<?, ?>[] genericos = new generico[142009];

        obj[] objeto = new obj[142009]; //usar um arrylist

        try (BufferedReader br = new BufferedReader(new FileReader(caminho)) ) {

            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvDelimiter);

                int orderId = Integer.parseInt(data[0]);
                String product = data[1];
                int quantityOrdered = Integer.parseInt(data[2]);
                double priceEach = Double.parseDouble(data[3]);
                Date orderDate = dateFormat.parse(data[4]);
                String purchaseAddress = data[5];


                objeto[cont] = new obj(orderId,product,quantityOrdered,priceEach,orderDate,purchaseAddress);
                genericos[cont] = new generico<>(objeto[cont].getProduct(), objeto[cont],objOrdem.CRESCENTE);

                cont++;

            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        return genericos;
    }
}