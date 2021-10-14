package LeetCodeTemple.Easy;

public class romanToInt_13 {
    public static int get(char num){
        switch (num){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
    public static int romanToInt(String s) {

        int sum=0;
        int charNum1=get(s.charAt(0));
        for(int i=1;i<s.length();i++){
            int charNum2=get(s.charAt(i));
            if(charNum1<charNum2){
                sum-=charNum1;
            }else {
                sum+=charNum1;
            }
            charNum1=charNum2;
        }
        sum+=charNum1;
        return sum;
    }

    public static void main(String[] args) {
        String str="III";
        String str1="LVIII";

        System.out.println(romanToInt(str));
        System.out.println(romanToInt(str1));
    }

}
