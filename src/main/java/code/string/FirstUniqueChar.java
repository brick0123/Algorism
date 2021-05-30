package code.string;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueChar {

  public static void main(String[] args) {
  }

  public int firstUniqChar(String s) {
    Map<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      char current = s.charAt(i);

      if (map.containsKey(current)) {
        map.put(current, -1);
      } else {
        map.put(current, i);
      }
    }

    int index = Integer.MAX_VALUE;
    for (char ch: map.keySet()) {
      if (map.get(ch) != -1 && map.get(ch) < index) {
        index = map.get(ch);
      }
    }

    return index == Integer.MAX_VALUE ? -1 : index;
  }

}
