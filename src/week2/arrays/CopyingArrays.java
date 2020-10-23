package week2.arrays;

import java.util.Random;

public class CopyingArrays {



  public static void main( String[] args ) {
    int[] arr1 = new int[10];

    Random random = new Random();


    for ( int i = 0; i < arr1.length ; i++ ) {
      arr1[i] = random.nextInt(100) +1;

    }

    int[] arr2 = arr1.clone();
    arr1[arr1.length - 1]= -7;

    System.out.print("array1: ");
    for(int i: arr1) {
      System.out.print(" " + i);
    }
    System.out.print("\narray2: ");
    for(int j: arr2) {
      System.out.print(" " + j);
    }

  }

}

