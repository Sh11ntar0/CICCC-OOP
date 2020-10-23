package miniProject;


//間違えを管理するクラス
public class WrongAnswer {

//間違えた回数を保存する
  public int count;

//  間違えをカウントする。
  public void countUp() {

  }
//  10回間違えた場合
  public boolean didGameOver(){
    if(count == 10){
      return true;
    }
    return false;


  }
}
