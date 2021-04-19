package practice.binary;

public class BinarySearchImpl {

  private static int binarySearch(int[] x, int len, int key) {
    int start = 0;
    int end = len - 1;
    int mid;

    while (start <= end) {
      mid = (start + end) / 2;

      if (x[mid] == key) {
        return mid;
      }

      if (x[mid] < key) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return -1;
  }

  private static int recursiveBinary(int[] arr, int key, int start, int end) {
    if (start > end) {
      return -1;
    }
    int mid = (start + end) / 2;

    if (arr[mid] == key) {
      return mid;
    }
    if (arr[mid] > key) {
      return recursiveBinary(arr, key, start, mid - 1);
    }
    return recursiveBinary(arr, key, mid + 1, end);
  }

}
