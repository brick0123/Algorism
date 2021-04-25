package practice.dynamic;

public class Fibonacci {

  // 한 번 계산된 결과를 메모이제이션(Memoization)하기 위한 배열 초기화
  public static long[] d = new long[100];

  // 메모이제이션 기법을 이용한 피보나치 탑다운
  public static long fibo(int x) {

    if (x == 1 || x == 2) {
      return 1;
    }

    // 이미 계산한 적 있는 문제라면 그대로 반환
    if (d[x] != 0) {
      return d[x];
    }

    // 아직 계산하지 않았다면 점화식에 따라서 피보나치 결과 반환
    d[x] = fibo(x - 1) + fibo(x - 2);
    return d[x];
  }

  public static void main(String[] args) {
    System.out.println(fibo(10));

    // 바텀업
    d[1] = 1;
    d[2] = 1;
    int n = 50;

    for (int i = 3; i <= n; i++) {
      d[i] = d[i - 1] + d[i - 2];
    }
    System.out.println(d[n]);
  }

}
