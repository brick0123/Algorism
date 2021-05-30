package code.string;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/885/
 */
public class ImplString {

  public int strStr(String haystack, String needle) {
    if (needle.length() == 0) {
      return 0;
    }

    if (haystack.length() < needle.length()) {
      return -1;
    }

    int len = needle.length();
    for (int i = 0; i < haystack.length() - len + 1; i++) {
      String str = haystack.substring(i, len + i);

      if (str.equals(needle)) {
        return i;
      }
    }
    return -1;
  }


}
