package code.string;

public class ReverseString {

  public static void main(String[] args) {
    char[] s = {'h', 'e', 'l', 'l', 'o'};

    reverseString2(s);
  }

  public static void reverseString2(char[] s) {
    int i = 0;
    int j = s.length - 1;
    while (i < j) {
      char tmp = s[i];
      s[i] = s[j];
      s[j] = tmp;
      i++;
      j--;
    }
  }
  public static void reverseString(char[] s) {
    int len = s.length;
    for (int i = 0; i < (len / 2); i++) {

      char tmp = s[i];
      s[i] = s[len - i - 1];
      s[len - i - 1] = tmp;
    }
  }

}
