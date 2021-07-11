package code;

public class PairsOfSongs {

    public int numPairsDivisibleBy60(int[] time) {
        int[] store = new int[60];
        int count = 0;

        for (int num : time) {
            int tmp = num % 60;

            if (tmp == 0) {
                count += store[0];
            } else {
                count += store[60 - tmp];
            }
            store[tmp]++;

        }
        return count;
    }
}
