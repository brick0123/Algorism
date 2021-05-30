package code.string;

public class ReverseInteger {

  public int reverse(int x) {
    int reverse = 0;
    int pop = 0;

    while (x != 0) {
      pop = x % 10;
      x /= 10;

      if (reverse > Integer.MAX_VALUE / 10) {
        return 0;
      }

      if (reverse < Integer.MIN_VALUE / 10) {
        return 0;
      }

      reverse = (reverse * 10) + pop;
    }
    return reverse;
  }

  }
