package cn.yfq.algorithm;

/**
 * 求一个字符串的最大回文子串
 * 中心扩展算法，已每个字符为中心向两边扩展
 */
public class Palindrome {
    public String solution(String s){
        char[] chars = s.toCharArray();
        int resutl = 0;
        int start = 0;
        int end = 0;
        for(int i=0; i<s.length();i++){
            int len1 = expandforCenter(chars,i,i);
            int len2 = expandforCenter(chars,i,i+1);
            resutl = Math.max(len1,len2);
            System.out.println(len1);
            System.out.println(len2);
            if(resutl>end-start){
                start = i - (resutl-1)/2; // 如果result为偶数，奇数不影响
                end = i + resutl/2 +1;
            }
        }
        return s.substring(start,end);
    }

    private int expandforCenter(char[] chars, int i, int j) {
        while (i>=0 && j<chars.length && chars[i]==chars[j]){
            i--;
            j++;
        }
        return j-i-1;

    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        String s = palindrome.solution("saddaw");
        System.out.println(s);

    }

}
