package code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class InsertDeleteGetRandom {

  Map<Integer, Integer> map = new HashMap<>();
  List<Integer> list = new ArrayList<>();
  Random random = new Random();

  /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
  public boolean insert(int val) {
    if (map.containsKey(val)) {
      return false;
    }

    list.add(val);
    map.put(val, list.size() -1);
    return true;
  }

  /** Removes a value from the set. Returns true if the set contained the specified element. */
  public boolean remove(int val) {
    if (!map.containsKey(val)) {
      return false;
    }

    int targetIdx = map.get(val);

    int lastIdx = list.size() -1;
    int lastVal = list.get(lastIdx);

    list.set(targetIdx, lastVal);
    list.remove(lastIdx);

    map.put(lastVal, targetIdx);
    map.remove(val);

    return true;
  }

  /** Get a random element from the set. */
  public int getRandom() {
    return list.get(random.nextInt(list.size()));
  }

}
