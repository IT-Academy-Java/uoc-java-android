package uoc.persistencia;

import java.io.*;

class LlegirFitxer {

  public static void main(String[] arg) {

    File archivo = null;
    FileReader fr = null;
    BufferedReader br = null;

    try {
      archivo = new File("/Users/elena/Documents/fitxeret.txt");
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
      // En el finally tanquem el fitxer, para assegurar-nos
      // que es tanca si tot va bé o si es produeix una excepció.
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
}