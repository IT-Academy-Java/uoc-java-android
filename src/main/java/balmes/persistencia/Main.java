package balmes.persistencia;

import java.io.IOException;

public class Main {

  public static void main(String[] args) throws IOException {

    CheckersIO checkersIO;
    checkersIO = new CheckersIO();
    checkersIO.setInputFile("hola que ase");

    // print file
    checkersIO.setOutputFile("hola");
  }
}
