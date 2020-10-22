package fridayProject;

import sun.tools.jconsole.JConsole;

public class MyTest {

  public static void main(String[] args) {
    Console cosole = new Console();
    cosole.GameOver("Toront");

    WrongAnswer wa = new WrongAnswer();
    System.out.println("10回以下");
    wa.count = 1;
    System.out.println(wa.didGameOver());

    System.out.println("10回間違えた");
    wa.count = 10;
    System.out.println(wa.didGameOver());
  }

}
