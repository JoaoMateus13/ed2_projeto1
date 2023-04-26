package leitor;

import objeto.generico;
import objeto.obj;
import objeto.objTest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Leitor {
    public static generico<?, ?>[] leitor(String caminho, int i){

        int op = i;
        String line = "";
        String csvDelimiter = ",";
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yy HH:mm");
        int conte = 0;
        int tamanho = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(caminho)) ) {
            while ((line = br.readLine()) != null) {
                tamanho++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        generico<?, ?>[] genericos = new generico[tamanho];
        objTest[] objTests = new obj[tamanho];

        try (BufferedReader br = new BufferedReader(new FileReader(caminho)) ) {

            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvDelimiter);

                int orderId = Integer.parseInt(data[0]);
                String product = data[1];
                int quantityOrdered = Integer.parseInt(data[2]);
                double priceEach = Double.parseDouble(data[3]);
                Date orderDate = dateFormat.parse(data[4]);
                String purchaseAddress = data[5];

                objTests[conte] = new obj(orderId,product,quantityOrdered,priceEach,orderDate,purchaseAddress);
                genericos[conte] = new generico<>(objTests[conte].retornarChave(op), objTests[conte]);

                conte++;

            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
        }

        return genericos;
    }

}
