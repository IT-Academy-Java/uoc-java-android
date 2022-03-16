package uoc.birds;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Write the route file: \t");
    String file = scanner.nextLine();

    System.out.println("el file recibido es: " + file);

    //String routeFile = "/Users/elena/Documents/fitxeret.txt";
    FileManager fileManager = new FileManager();

    fileManager.writeFile("estoy escribiendo esta linea", file);

    System.out.println(" ---------------------- ");
    fileManager.readFile(file);




  }
}
