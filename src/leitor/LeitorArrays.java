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

public class LeitorArrays {
    public static List ArrayListJDK(String caminho){

        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yy HH:mm");
        String line = "";
        String csvDelimiter = ",";

        List<obj> objs = new ArrayList<obj>();


        try (BufferedReader br = new BufferedReader(new FileReader(caminho)) ) {

            while ((line = br.readLine()) != null) {


                String[] data = line.split(csvDelimiter);


                //Atributos do objeto
                int orderId = Integer.parseInt(data[0]);
                String product = data[1];
                int quantityOrdered = Integer.parseInt(data[2]);
                double priceEach = Double.parseDouble(data[3]);
                Date orderDate = dateFormat.parse(data[4]);
                String purchaseAddress = data[5];


                //Criação do objeto
                objs.add(new obj(orderId,product,quantityOrdered,priceEach,orderDate,purchaseAddress));

            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
        }

        return objs;
    }
}
