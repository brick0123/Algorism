package baekjoon.impl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Q1946 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int count = Integer.parseInt(br.readLine());

    for (int i = 0; i < count; i++) {
      int number = Integer.parseInt(br.readLine());
      int result = 1;

      Map<Integer, Integer> map = new HashMap<>();
      for (int j = 0; j < number; j++) {
        String[] score = br.readLine().split(" ");
        map.put(Integer.parseInt(score[0]), Integer.parseInt(score[1]));
      }
      int min = map.get(1);
      for (int j = 2; j <= number; j++) {
        if (map.get(j) < min)
          result++;
        if (min > map.get(j))
          min = map.get(j);
        if (j == number)
          System.out.println(result);
      }
    }

  }


}
