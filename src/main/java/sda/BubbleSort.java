package sda;

public class BubbleSort {

  static void bubbleSort (int [] arr) {
      int n = arr.length;

      for (int i=0; i < n; i++){
          int temp = 0;
          for (int j = 1; j <n ; j++)
          if (arr[j-1] > arr[j]) {
              temp = arr[j-1];
              arr[j-1] = arr[j];
              arr[j] = temp;
              }
          }
      }

// for(int i=1; i<x.length; i++) {
//         int temp=0;
//         if(x[i-1] > x[i]) {
//            temp = x[i-1];
//            x[i-1] = x[i];
//            x[i] = temp;
  }

