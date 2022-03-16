package uoc.birds;

import java.io.*;

public class FileManager {

  private FileWriter fichero = null;
  private PrintWriter pw = null;
  private File archivo = null;
  private FileReader fr = null;
  private BufferedReader br = null;

  public FileManager() {
  }

  public void readFile(String file){
    try {
      archivo = new File(file);
      fr = new FileReader(archivo);
      br = new BufferedReader(fr);
      // Lectura del fitxer
      String linea;
      while ((linea = br.readLine()) != null)
        System.out.println(linea);
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
