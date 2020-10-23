package week2.arrays;

import java.util.Random;
import java.util.Scanner;

public class WhereIsIt {
  public static void main(String[] args) {
    int[] arr = new int[10];
    Random random = new Random();
    for (int i = 0; i < arr.length; i++) {
      arr[i] = random.nextInt(100) + 1;
    }
    System.out.print("array: ");
    for (int i : arr) {
      System.out.print(" " + i);
    }
    System.out.println("\nValue to find:");
    Scanner scanner = new Scanner(System.in);
    int answer = scanner.nextInt();
    boolean flag = false;

    for(int i = 0;i < arr.length; i++){

      if(arr[i] == answer){
        System.out.println(answer +" is in slot "+ i);
        flag = true;

      }
    }
    if(!flag){
      System.out.println(answer+" is not in the array.");
    }
  }

}
