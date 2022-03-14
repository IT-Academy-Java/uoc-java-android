package uoc.persistencia;

import java.io.*;

public class EscriureFitxer {

  public static void main(String[] args) {
    FileWriter fichero = null;
    PrintWriter pw = null;
    try {

      // Si volem afegir al final d'un fitxer ja existent, simplement hem de posar un flag a true com
      // a segon paràmetre del constructor de FileWriter.
      // FileWriter fichero = new FileWriter("c:\\prueba.txt",true)

      fichero = new FileWriter("/Users/elena/Documents/fitxeret.txt");
      pw = new PrintWriter(fichero);
      for (int i = 0; i < 10; i++) {
        pw.println("Linea " + i);
      }
    } catch (Exception e) {
      // e.printStackTrace();
      System.out.println("\n" + e.getMessage());
    } finally {
      try {
        // Ho fem dins del finally per assegurar-nos que es tanca el fitxer.
        if (null != fichero)
          fichero.close();
      } catch
      (Exception e2) {
        // e2.printStackTrace();
        System.out.println("\n" + e2.getMessage());
      }
    }
  }
}
