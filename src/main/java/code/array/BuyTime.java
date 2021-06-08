package code.array;

public class BuyTime {

  public static void main(String[] args) {
    int i = maxProfit(new int[]{1, 5, 6});
    System.out.println("i = " + i);
  }

  public static int maxProfit(int[] prices) {
    int profit = 0;
    for (int i = 0; i < prices.length -1; i++) {
      if (prices[i] < prices[i + 1]) {
        profit += prices[i + 1] - prices[i];
      }
    }
    return profit;
  }

}
