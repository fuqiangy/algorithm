package cn.yfq.algorithm;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.Math.max;

/**
 * 找到给定字符串（由小写字符组成）中的最长子串 T ， 要求 T 中的每一字符出现次数都不少于 k 。输出 T 的长度。
 *
 * 示例 1:
 *
 * 输入:
 * s = "aaabb", k = 3
 *
 * 输出:
 * 3
 *
 * 最长子串为 "aaa" ，其中 'a' 重复了 3 次。
 *示例 2:
 *
 *输入:
 *s = "ababbc", k = 2
 *
 *输出:
 *5
 *
 *最长子串为 "ababb" ，其中 'a' 重复了 2 次， 'b' 重复了 3 次。
 *
 *
 */
public class LongestSubstring {

    public static  int length = 0;
    public static int longestSubstring(String s, int k) {

        Map<Character,Integer> map = new HashMap();
        for (char ch:s.toCharArray()) {
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else {
                map.put(ch,1);
            }
        }
        int start = 0;
        char[] chars = s.toCharArray();
        boolean greater = true;
        for (int i =0; i<chars.length;i++){
            if(map.get(chars[i])<k){
                greater = false;
                length = max(length,longestSubstring(s.substring(start,i),k));
                start = i+1;
            }
        }
        if(greater){
            return s.length();
        }
        return length;
    }

    public static void main(String[] args) {
        String s = "ababb";
        int length = longestSubstring(s,1);
        System.out.println(length);

    }
}
