package uoc.persistencia;

import java.io.*;
import java.util.ArrayList;

public class CheckersIO {

  private BufferedReader in;
  private BufferedWriter out;


  public void setInputFile(String inputFile) throws IOException {
    BufferedWriter bw=new BufferedWriter(new FileWriter("/Users/elena/Documents/fitxer.txt"));
    bw.write("this is a demo line");
    bw.newLine();
    bw.write(inputFile);
    bw.flush();
    bw.close();
  }

  public void setOutputFile(String outputFile) throws IOException {
    BufferedReader br=new BufferedReader(new FileReader("/Users/elena/Documents/fitxer.txt"));
    // Leer y mostrar fichero
    String linea=br.readLine();
    while(linea!=null){
      System.out.println(linea);
      linea=br.readLine();
    }
  }

  public void write(ArrayList<String> moves){

  }

  public ArrayList<String> read(){
    return null;
  }
}
