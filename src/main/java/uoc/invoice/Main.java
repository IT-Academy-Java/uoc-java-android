package uoc.invoice;

import java.util.Date;

public class Main {

    public static void main(String args[]) {

        Date date = new Date(2000-1900, 1,1);
        Invoice laDolorosa = new Invoice(date,"la dolorosa", 4000);
        Invoice laDolorosa1 = new Invoice(date,"la dolorosa1", 1000);
        Invoice laDolorosa2 = new Invoice(date,"la dolorosa2", 800);
        Invoice laDolorosa3 = new Invoice(date,"la dolorosa3", 40);

        Customer customerThomas = new Customer("Thomas");
        customerThomas.addInvoice(laDolorosa);
        customerThomas.addInvoice(laDolorosa1);
        customerThomas.addInvoice(laDolorosa2);
        customerThomas.addInvoice(laDolorosa3);


        FileManager fileManager = new FileManager();
        String localUrl = "C:\\Users\\epiaggio\\Documents\\code\\fitxers\\invoice.txt";

        System.out.println("******************* LEYENDO *********************");
        Invoice invoice = fileManager.readFile(localUrl);
        System.out.println(invoice.toString());

        System.out.println("******************* FIN LECTURA ******************");

    }
}
