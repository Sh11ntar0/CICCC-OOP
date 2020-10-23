package miniProject;

public class Driver {

  public static void main(String[] args) {
    WrongAnswer wa = new WrongAnswer();
    wa.count = 1;
    String cities = "vancouver";

//    勝った場合画面に表示
    if (!wa.didGameOver()){
      System.out.println("You win!");
      System.out.println("You have guessed'"+ cities +"'correctly.");
    }
  }

}
