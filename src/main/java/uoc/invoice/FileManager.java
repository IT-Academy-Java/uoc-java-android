package uoc.invoice;

import java.io.*;
import java.util.Date;

public class FileManager {

    private FileWriter fichero = null;
    private PrintWriter pw = null;
    private File archivo = null;
    private FileReader fr = null;
    private BufferedReader br = null;

    public FileManager() {
    }

    public Invoice readFile(String file){
        Invoice invoice = new Invoice();

        try {
            archivo = new File(file);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            // Lectura del fitxer
            String date = "";

            while ((date = br.readLine()) != null){
                try {
                    invoice.setAmount(Integer.parseInt(br.readLine()));
                    invoice.setDescription(br.readLine());
                    String[] convertDate = date.split("/");

                    int year = Integer.parseInt(convertDate[0]) - 1900;
                    int month = Integer.parseInt(convertDate[1]) - 1;
                    int day = Integer.parseInt(convertDate[2]);

                    Date myDate = new Date(year, month, day);
                    invoice.setDate(myDate);
                }catch (Exception e){
                    System.out.println("Error -> " + e.getMessage());
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("\n" + e.getMessage());
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                System.out.println("\n" + e2.toString());
            }
        }
        invoice.toString();
        return invoice;
    }

    public void writeFile(String textLine, String file){
        try {
            fichero = new FileWriter(file, true);
            pw = new PrintWriter(fichero);
            pw.println("Linea " + textLine);
        } catch (Exception e) {
            System.out.println("\n" + e.getMessage());
        } finally {
            try {
                if (null != fichero)
                    fichero.close();
            } catch
            (Exception e2) {
                System.out.println("\n" + e2.getMessage());
            }
        }
    }
}
