package baekjoon.impl;

public class Q4673 {

  // https://www.acmicpc.net/problem/4673
  public static void main(String[] args) {

    // 인데스 최대 10,000짜리 배열 생성
    int[] values = new int[10_001];

    // 1부터 ~ 10,000까지 순회
    for (int i = 1; i <= values.length - 1; i++) {
      int num = constructor(i);
      // 생성자의 값이 1만보다 클 경우
      if (num > 10_000) {
        continue;
      }
      values[num] = 1;
    }

    for (int i = 1; i <= values.length - 1; i++) {
      // 생성자가 없다 (= 셀프 넘버)
      if (values[i] != 1) {
        System.out.println(i);
      }
    }

  }

  static int d(int n) {
    int sum = n;
    while(n!=0) {
      sum+=n%10;
      n/=10;
    }
    return sum;
  }

  public static int constructor(int i) {
    String input = String.valueOf(i);

    for (int j = 0; j < input.length(); j++) {
      // i + 각 자릿수 더하기
      i += input.charAt(j) - '0';
    }
    return i;
  }
}
