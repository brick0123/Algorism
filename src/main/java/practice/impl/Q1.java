package practice.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Q1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    sc.nextLine();

    String[] plans = sc.nextLine().split(" ");
    int x = 1, y = 1;

    // L, R, U, D에 따른 이동 방향
    int[] dx = {0, 0, -1, 1};
    int[] dy = {-1, 1, 0, 0};
    char[] moveTypes = {'L', 'R', 'U', 'D'};

    // 이동 계획을 하나씩 확인
    for (String s : plans) {
      char plan = s.charAt(0);
      // 이동 후 좌표 구하기
      int nx = -1, ny = -1;
      for (int j = 0; j < 4; j++) {
        if (plan == moveTypes[j]) {
          nx = x + dx[j];
          ny = y + dy[j];
        }
      }
      // 공간을 벗어나는 경우 무시
      if (nx < 1 || ny < 1 || nx > n || ny > n)
        continue;
      // 이동 수행
      x = nx;
      y = ny;
    }

    System.out.println(x + " " + y);


  }
}
/*
    int size = Integer.parseInt(br.readLine());
    int x = 1;
    int y = 1;

    String[] input = br.readLine().split(" ");

    for (String s : input) {
      if ("R".equals(s)) {
        if (x < size) {
          x++;
        }
      } else if ("L".equals(s)) {
        if (x > 1) {
          x--;
        }
      } else if ("U".equals(s)) {
        if (y > 1) {
          y --;
        }
      } else {
        if (y < size) {
          y++;
        }
      }
    }
    System.out.println(y+ " " + x);
* */