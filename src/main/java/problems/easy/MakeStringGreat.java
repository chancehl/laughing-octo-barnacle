package problems.easy;

import java.util.Stack;

public class MakeStringGreat {
    /**
     * This is the recursive O(n^2) solution
     *
     * @param s The input string
     * @return The "great" string
     */
    public String makeGood(String s) {
        if (s.length() < 2) {
            return s;
        }

        int i = 0;
        int j = 1;

        while (j < s.length()) {
            String pair = s.substring(i, j + 1);

            char a = pair.charAt(0);
            char b = pair.charAt(1);

            if (a == getOppositeLetter(b)) {
                String before = s.substring(0, i);
                String after = s.substring(j + 1);

                return makeGood(before + after);
            }

            i++;
            j++;
        }

        return s;
    }

    /**
     * This is the O(n) solution that leverages a stack
     *
     * @param s The input string
     * @return The "great" string
     */
    public String makeGoodOptimized(String s) {
        Stack<Character> stack = new Stack<>();

        for (Character c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek().equals(getOppositeLetter(c))) {
                    stack.pop();
            } else {
                stack.add(c);
            }
        }

        return convertStackToString(stack);
    }

    public String convertStackToString(Stack<Character> s) {
        String out = "";

        for (Character c : s) {
            out = out.concat(c.toString());
        }

        return out;
    }

    public char getOppositeLetter(char c) {
        if (Character.isLowerCase(c)) {
            return String.valueOf(c).toUpperCase().charAt(0);
        } else {
            return String.valueOf(c).toLowerCase().charAt(0);
        }
    }
}