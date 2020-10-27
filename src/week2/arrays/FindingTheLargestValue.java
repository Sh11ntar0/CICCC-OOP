package week2.arrays;

import java.util.Random;

public class FindingTheLargestValue {
  public static void main(String[] args) {

    int[] arr = new int[10];
    Random random = new Random();
    int intMax = calcMax(arr);
    for (int i = 0; i < arr.length; i++) {
      arr[i] = random.nextInt(100) + 1;
    }
    System.out.print("array: ");
    for (int i : arr) {
      System.out.print(" " + i);
    }
    System.out.println("\nThe largest value is "+ intMax);


  }
  public static int calcMax(int[] array) {

    int intMax = array[0];

    for (int i = 1; i < array.length; i++ ) {
      if(intMax < array[i]) {
        intMax = array[i];
      }
    }
    return intMax;
  }

}