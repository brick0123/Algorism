package practice.greedy;

public class Q1 {

  public static void main(String[] args) {
    int input = 1260;
    int count = 0;

    int[] coins = {500, 100, 50, 10};
    // 가장 큰 단위가 작은 단위들의 항상 배수일 경우 그리디가 효과

    for (int coin: coins) {
      count += input / coin;
      input %= coin;
    }

    System.out.println(count);
  }

}
