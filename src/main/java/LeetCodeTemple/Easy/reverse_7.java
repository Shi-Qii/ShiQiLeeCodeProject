package LeetCodeTemple.Easy;

public class reverse_7 {
    public static void main(String[] args) {
        reverse(123);
    }
    public static int reverse(int x) {

        if(x==0){
            return 0;
        }
        boolean isNegtive = false;
        if(x<0){
            isNegtive = true;
        }
        int res = 0;
        int num = Math.abs(x);
        while(num!=0){
            if(res>(Integer.MAX_VALUE-(num%10))/10){
                return 0;
            }
            res = res*10+num%10;
            num=num/10;
        }
        System.out.println(isNegtive?-res:res);
        return isNegtive?-res:res;
    }
}
