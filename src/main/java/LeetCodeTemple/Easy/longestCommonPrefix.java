package LeetCodeTemple.Easy;

/**
 * 示例 1：
 * <p>
 * 输入：strs = ["flower","flow","flight"]
 * 输出："fl"
 * 示例 2：
 * <p>
 * 输入：strs = ["dog","racecar","car"]
 * 输出：""
 * 解释：输入不存在公共前缀。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-common-prefix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class longestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        } else if (strs.length == 1) {
            return strs[0];
        }

//          待破解
//        for (int i = 0; i < strs[0].length(); i++) {
//            int strsLen = strs.length;
//            while (strsLen > 0) {
//
//                if (!strs[0].substring(0, i+1 ).equals(strs[strsLen - 1].substring(0, i+1 ))) {
//                    return strs[0].substring(0, i);
//                }
//                strsLen -= 1;
//            }
//        }
//        return strs[0];

        int minLen = Integer.MAX_VALUE;
        String result = "";
        for (String str : strs) {
            if (str.length() < minLen) {
                minLen = str.length();
                result = str;
            }
        }
        while (result.length() > 0) {
            boolean flog = true;
            for (String str : strs) {
                if (!str.substring(0, minLen).equals(result)) {
                    minLen--;
                    result = result.substring(0, minLen);
                    flog = false;
                    break;
                }
            }
            if (flog) {
                return result;
            }
        }

        return result;
    }


    public static void main(String[] args) {
        String aa[] = {"fa","f"};
        System.out.println(longestCommonPrefix(aa));

    }


}
