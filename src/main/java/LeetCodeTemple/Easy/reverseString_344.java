package LeetCodeTemple.Easy;

public class reverseString_344 {
    public static void main(String[] args) {
        char[] charArray = new char[]{'a','b','c','d','e','f','G'};
        reverseString(charArray);
    }
    public static void reverseString(char[] s) {
        int len = s.length;
        int left = 0;
        int right = len - 1;
        char  temp =0;
        while (left < right) {
            temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        System.out.println("AA"+temp);
    }

}
