package code.string;

import java.util.HashSet;
import java.util.Set;

public class LongestWithoutRepeat {

  public int lengthOfLongestSubstring(String s) {

    Set<Character> set = new HashSet<>();
    int max = 0;

    int one = 0;
    int two = 0;

    while (two < s.length()) {
      if (!set.contains(s.charAt(two))) {
        set.add(s.charAt(two));
        max = Math.max(max, set.size());
        two++;
      } else {
        set.remove(s.charAt(one));
        one++;
      }

    }
    return max;
  }

}
