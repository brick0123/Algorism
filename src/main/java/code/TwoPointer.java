package code;

public class TwoPointer {

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 2, 5};

    int n = 5;
    int m = 5;


    int count = 0;
    int intervalSum = 0;
    int end = 0;

    for (int start = 0; start < n; start++) {
      while (intervalSum < m && end < n) {
        intervalSum += arr[end];
        end++;
      }
      if (intervalSum == m) {
        count++;
      }

      intervalSum -= +arr[start];
    }

    System.out.println("end = " + count);
  }

}
