package problems.easy;

/**
 * Complexity: O(N)
 */
public class AlternatingDigitSum {
    public int alternateDigitSum(int n) {
        String s = String.valueOf(n);

        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            int parsed = Integer.parseInt(Character.toString(s.charAt(i)));

            if (i % 2 == 0) {
                sum += parsed;
            } else {
                sum -= parsed;
            }
        }

        return sum;
    }
}
