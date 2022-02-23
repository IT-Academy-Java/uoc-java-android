package week_1;

public class Ex9 {

  public static void main(String[] args) {
    for(int i = 0; i <= 100; i++){
      System.out.println("Random => " + getRandomBetwenOneAndTen());
    }
  }

  private static int getRandomBetwenOneAndTen() {
    return (int)(Math.random()*10+1);
  }
}
