package code;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TimeBasedKeyValueStore {

    public static void main(String[] args) {

    }
}

class TimeMap {

    /** Initialize your data structure here. */
    Map<String, TreeMap<Integer, String>> map = new HashMap<>();

    public TimeMap() {
    }

    public void set(String key, String value, int timestamp) {
        if (!map.containsKey(key)) {
            map.put(key, new TreeMap<>());
        }

        map.get(key).put(timestamp, value);
    }

    public String get(String key, int timestamp) {
        String s = "";

        if (!map.containsKey(key)) {
            return s;
        }

        Integer time = map.get(key).floorKey(timestamp);

        return time == null ? s : map.get(key).get(time);
    }
}




/* Time Exceed
class TimeMap {
    */
/** Initialize your data structure here. *//*

    Map<String, List<Store>> map = new HashMap<>();

    public TimeMap() {

    }

    public void set(String key, String value, int timestamp) {
        Store store = new Store(timestamp, value);
        List<Store> list = map.getOrDefault(key, new ArrayList<>());
        list.add(store);

        map.put(key, list);
    }

    public String get(String key, int timestamp) {
        String result = "";
        if (map.get(key) == null) {
            return result;
        }

        List<Store> list = map.get(key);

        return list
            .stream()
            .filter(t -> t.time <= timestamp)
            .max((o1, o2) -> Integer.compare(o1.time, o2.time))
            .map(store -> store.key)
            .orElse("");

    }

    static class Store {
        int time;
        String key;

        public Store(int time, String key) {
            this.time = time;
            this.key = key;
        }
    }
}*/
