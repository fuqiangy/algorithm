package cn.yfq.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * 找出一个字符串，最大不包含重复字符的字串长度
 */
public class DiffSubstring {
    /**
     * 思想：滑动窗口，以每个字符为字符串的起点遍历，向后滑动，判断是否重复
     * P[i,j) ->P[i,j+1), if P[j] in P[i,j] , i++,  else j++
     * @param s
     * @return
     */
    public int solution(String s){
        char[] chars = s.toCharArray();
        int length = s.length();
        int result = 0;
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0,j=0;j<length;j++){
            if(map.containsKey(chars[j])){
                i = Math.max(i,map.get(chars[j]));//当map中包含字符，且i小于字符下标，直接从该字符的下一个字符开始滑动。
            }
            result = Math.max(result,j-i+1);
            map.put(chars[j],j+1);//储存每个字符的下标+1，
        }
        return result;
    }

    public static void main(String[] args) {
        DiffSubstring diffSubstring = new DiffSubstring();
        int length = diffSubstring.solution("abcabcbb");
        System.out.println(length);
    }
}
