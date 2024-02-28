package problems.easy;

import java.util.Set;

/**
 * Complexity: O(N)
 *
 * Edge cases:
 *     1. Input value can't be parsed into an Int
 *     2. Input value overflows when converted to Int (convert it to a long instead)
 *     3. Hexadecimal string needs to be converted to uppercase
 */
public class Hexspeak {
    public String toHexspeak(String num) {
        String hexadecimal = Long.toHexString(Long.parseLong(num)).toUpperCase();
        String hexspeak = "";

        Set<String> validCharacters = Set.of("A", "B", "C", "D", "E", "F", "I", "O");

        for (int i = 0; i < hexadecimal.length(); i++) {
            String s = hexadecimal.substring(i, i + 1);

            if (s.equals("0")) {
                hexspeak = hexspeak.concat("O");
            } else if (s.equals("1")) {
                hexspeak = hexspeak.concat("I");
            } else if (validCharacters.contains(s)) {
                hexspeak = hexspeak.concat(s);
            } else {
                return "ERROR";
            }
        }

        return hexspeak;
    }
}
