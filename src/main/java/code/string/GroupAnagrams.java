package code.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

  public List<List<String>> groupAnagrams(String[] strs) {
    List<List<String>> dummy = new ArrayList<>();
    Map<String, List<String>> map = new HashMap<>();

    for (String str : strs) {
      char[] charArray = str.toCharArray();
      Arrays.sort(charArray);
      String key = String.valueOf(charArray);

      if (!map.containsKey(key)) {
        map.put(key, new ArrayList<>());
      }
      map.get(key).add(str);
    }

    dummy.addAll(map.values());
    return dummy;
  }

}
