import java.util.ArrayList;
import java.util.List;

public class Solution {
    private static final String[] KEYPAD = {
        "",     // 0
        "",     // 1
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.isEmpty()) {
            return result;
        }
        pad(result, "", digits);
        return result;
    }

    private void pad(List<String> result, String current, String remaining) {
        if (remaining.isEmpty()) {
            result.add(current);
            return;
        }
        int digit = remaining.charAt(0) - '0';
        String letters = KEYPAD[digit];
        for (char ch : letters.toCharArray()) {
            pad(result, current + ch, remaining.substring(1));
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String digits = "23";
        List<String> combinations = solution.letterCombinations(digits);
        System.out.println(combinations);  // Output: [ad, ae, af, bd, be, bf, cd, ce, cf]
    }
}
