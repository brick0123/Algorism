package code.string;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/883/
 */
public class ValidPalindrome {

  public static void main(String[] args) {
    boolean s = isPalindrome2("A man, a plan, a canal: Panama");
  }

  public static boolean isPalindrome2(String s) {
    String one = "";

    for (char ch : s.toCharArray()) {
      if (Character.isDigit(ch) || Character.isLetter(ch)) {
        one += ch;
      }
    }

    one = one.toLowerCase();

    int front = 0;
    int back = one.length() - 1;

    while (front < back) {
      if (one.charAt(front++) != one.charAt(back--)) {
        return false;
      }
    }
    return false;

  }


  public static boolean isPalindrome(String s) {
    List<Character> alphabet = new ArrayList<>();

    for (char ch : s.toCharArray()) {
      if (Character.isDigit(ch) || Character.isLetter(ch)) {
        alphabet.add(Character.toLowerCase(ch));
      }
    }

    int len = alphabet.size();

    for (int i = 0; i < (len / 2); i++) {
      if (alphabet.get(i) != alphabet.get(len - 1 - i)) {
        return false;
      }
    }
    return true;
  }

}
