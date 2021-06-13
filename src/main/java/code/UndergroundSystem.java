package code;

import java.util.HashMap;
import java.util.Map;

public class UndergroundSystem {

  Map<String, Statistic> statics = new HashMap<>();
  Map<Integer, SubStation> userStore = new HashMap<>();

  public void checkIn(int id, String stationName, int t) {
    userStore.put(id, new SubStation(stationName, t));
  }

  public void checkOut(int id, String stationName, int t) {
    SubStation subStation = userStore.get(id);
    int totalTime = t - subStation.startTime;

    String key = generateKey(subStation.startStation, stationName);
    Statistic statistic = statics.getOrDefault(key, new Statistic());

    statistic.personnel++;
    statistic.totalTime += totalTime;

    statics.put(key, statistic);
  }

  public double getAverageTime(String startStation, String endStation) {
    String key = generateKey(startStation, endStation);
    Statistic statistic = statics.get(key);
    return (double) statistic.totalTime / statistic.personnel;

  }

  public String generateKey(String startStation, String endStation) {
    return startStation + "_" + endStation;
  }

  static class Statistic {
    int personnel;
    int totalTime;
  }

  static class SubStation {
    String startStation;
    int startTime;

    public SubStation(String startStation, int startTime) {
      this.startStation = startStation;
      this.startTime = startTime;
    }

  }
}
