package code.array;

public class RotateImage {

  /**
   * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/770/
   *
   * You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
   * You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
   * DO NOT allocate another 2D matrix and do the rotation.
   */
  public static void main(String[] args) {
    int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    rotate(matrix);
  }

  public static void rotate(int[][] matrix) {
    int len = matrix.length;

    for (int i = 0; i < len; i++) {
      for (int j = i; j < len; j++) {
        int tmp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = tmp;
      }
    }

    for (int i = 0; i < len; i++) {
      for (int j = 0; j < (len / 2); j++) {
        int tmp = matrix[i][j];
        matrix[i][j] = matrix[i][len - 1 - j];
        matrix[i][len - 1 - j] = tmp;
      }
    }

  }
}
