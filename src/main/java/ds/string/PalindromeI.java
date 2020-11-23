package ds.string;

/**
 * 验证回文串
 * <p>
 * <p>
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * <p>
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: "race a car"
 * 输出: false
 */
public class PalindromeI {

    public boolean isPalindrome(String s) {
        if ("".equals(s)) {
            return true;
        }
        String lowerString = s.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = lowerString.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if ((chars[i] >= 'a' && chars[i] <= 'z') || (chars[i] >= '0' && chars[i] <= '9')) {
                stringBuilder.append(chars[i]);
            }
        }
        return stringBuilder.toString().equals(stringBuilder.reverse().toString());
    }

    /**
     * 验证字符串是否为回文字符串
     */
    public boolean isPalindrome2(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    /**
     * 寻找字符串中的最长回文串
     */
    private String palindrome(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            //找到了中点
            left--;
            right++;
        }
        return s.substring(left + 1, right - 1 - left);
    }

    public static void main(String[] args) {
        String a = "A man, a plan, a canal: Panama";
        String b = "race a car";
        String c = "78987";
        PalindromeI palindromeI = new PalindromeI();
        System.out.println(palindromeI.isPalindrome(a));
        System.out.println(palindromeI.isPalindrome(b));
        System.out.println(palindromeI.isPalindrome2(c));
        System.out.println(palindromeI.palindrome(c, 0, c.length()));
    }
}
