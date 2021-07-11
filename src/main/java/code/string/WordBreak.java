package code.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {

    public static void main(String[] args) {
        wordBreak("abcd", Arrays.asList("a", "b", "c", "bc", "ab", "abc"));
    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        return wordBreakMemo(s, new HashSet<>(wordDict), 0, new Boolean[s.length()]);
    }

    private static boolean wordBreakMemo(String s, Set<String> wordDict, int start, Boolean[] memo) {
        if (start == s.length()) {
            return true;
        }
        if (memo[start] != null) {
            return memo[start];
        }
        for (int end = start + 1; end <= s.length(); end++) {
            if (wordDict.contains(s.substring(start, end)) && wordBreakMemo(s, wordDict, end, memo)) {
                return memo[start] = true;
            }
        }
        return memo[start] = false;
    }


    // recursive O(2^n)
//    public boolean wordBreak(String s, List<String> wordDict) {
//
//        return wb(s, new HashSet<>(wordDict));
//    }
//
//    private boolean wb(String s, HashSet<String> set) {
//        if (s.length() == 0) {
//            return true;
//        }
//
//        for (int i = 1; i <= s.length(); i++) {
//            if(set.contains(s.substring(0, i)) && wb(s.substring(i), set)) {
//                return true;
//            }
//        }
//        return false;
//    }
}
