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

  }

