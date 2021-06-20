package code.backtrack;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationPhoneNumber {

  private String[] map = {
      "0",
      "1",
      "abc",
      "def",
      "ghi",
      "jkl",
      "mno",
      "pqrs",
      "tuv",
      "wxyz"
  };

  public List<String> letterCombinations(String digits) {
    List<String> result = new ArrayList<>();
    if (digits.isEmpty()) {
      return result;
    }

    StringBuilder dummy = new StringBuilder();

    backtrack(digits, result, dummy, 0);
    return result;
  }

  public void backtrack(String digits, List<String> result, StringBuilder dummy, int index) {
    if (dummy.length() == digits.length()) {
      result.add(dummy.toString());
      return;
    }

    String str = map[digits.charAt(index) - '0'];
    for (char alphabet : str.toCharArray()) {
      dummy.append(alphabet);
      backtrack(digits, result, dummy, index + 1);
      dummy.deleteCharAt(dummy.length() - 1);
    }
  }
}
