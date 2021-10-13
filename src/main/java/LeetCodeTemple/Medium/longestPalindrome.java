package LeetCodeTemple.Medium;

public class longestPalindrome {

//    static boolean isPr(String s, int i, int j){
//        while(i < j){
//            System.out.println("1=>"+s.charAt(i));
//            System.out.println("2=>"+s.charAt(j));
//            if(s.charAt(i++) != s.charAt(j--)){
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static String longestPalindrome(String s) {
//        if( s == null || s.length() <= 1  ) return s;
//        int maxLength = 1;
//        int start = 0;
//        for( int i = 0; i< s.length()-1; i++){
//            for( int j = s.length()-1; j > i; j--){ // 优化 从最长 开始
//                if( (j-i+1) > maxLength ){ // 优化 长度 不够跳过
//                    if( isPr (s,i,j) ){
//                        maxLength = j-i +1;
//                        start = i;
//                    }
//                }
//            }
//        }
//        return s.substring(start,start+maxLength);
//
//    }


    public static void main(String[] args) {
        String s = "bauabd";
      String result= longestPalindrome(s);
        System.out.println(result);
    }

    public static String longestPalindrome(String s) {
        char[] chars = s.toCharArray();

        int max = Integer.MIN_VALUE;
        int maxLeft = 0,maxRight = 1;
        for (int i = 0; i < chars.length; i++) {
            int left = kuoZhan(chars,i,i);
            int right = kuoZhan(chars,i,i + 1);
            int lenght = Math.max(left,right);
            max = Math.max(max,lenght);
            if (max == lenght) {
                maxLeft = i - (lenght - 1) / 2;
                maxRight = i + lenght / 2;
            }
        }
        return s.substring(maxLeft,maxRight + 1);
    }

    public static int kuoZhan(char[] chars,int left,int right) {

        while (left >= 0 && right < chars.length && chars[left] == chars[right]) {
            left--;
            right++;
        }
        return right - left - 1;
    }

}
