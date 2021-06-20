package code.array;

public class ContainerMostWater {

  public int maxArea(int[] height) {
    int max = Integer.MIN_VALUE;
    int min = 0;

    int i = 0;
    int j = height.length - 1;

    while (i < j) {
      min = Math.min(height[i], height[j]);
      max = Math.max(max, min * (j - i));
      if (height[i] < height[j]) {
        i++;
      } else {
        j--;
      }
    }
    return max;
  }

  public static void main(String[] args) {

  }

}
