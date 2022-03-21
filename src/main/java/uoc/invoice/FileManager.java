package invoice;
import java.io.*;

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
            String linea;
            String date = "";
            String monto = "";
            String description = "";


            while ((date = br.readLine()) != null)
                invoice.setAmount(Integer.parseInt(br.readLine()));
                invoice.setDescription(br.readLine());

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
