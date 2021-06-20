package code.backtrack;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.List;

public class Permutations {

  public static void main(String[] args) {
    WeekFields of = WeekFields.of(DayOfWeek.MONDAY, 1);
    System.out.println("of = " + of.getFirstDayOfWeek());

    LocalDate now = LocalDate.now();
    int dayOfWeek = now.get(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH);
    System.out.println("dayOfWeek = " + dayOfWeek);

    "aa".length();
    int i = 0;
    test(i++);

  }

  public static void test(int i) {
    System.out.println("i = " + i);
  }

  public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> dummy = new ArrayList<>();
    backtrack(nums, result, dummy);
    return result;
  }

  public void backtrack (int[] nums, List<List<Integer>> result, List<Integer> dummy) {
    if (dummy.size() == nums.length) {
      result.add(new ArrayList<>(dummy));
      return;
    }

    for (int num : nums) {
      if (dummy.contains(num)) {
        continue;
      }
      dummy.add(num);
      backtrack(nums, result, dummy);
      dummy.remove(dummy.size() - 1);
    }
  }

}
