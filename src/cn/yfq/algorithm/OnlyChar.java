package cn.yfq.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 *
 * 案例:
 *
 * s = "leetcode"
 * 返回 0.
 *
 * s = "loveleetcode",
 * 返回 2.
 */
public class OnlyChar {
    public static int Solution(String s){
        Map<Character,Integer> map = new HashMap();
        char[] chars = s.toCharArray();
        for(int i = 0; i<s.length();i++ ){
            if(map.containsKey(chars[i])){
                map.put(chars[i],map.get(chars[i])+1);
            }else {
                map.put(chars[i],1);
            }
        }
        for(int i = 0; i<s.length();i++ ){
            if(map.get(chars[i])==1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(Solution("loveleetcode"));
    }
}
