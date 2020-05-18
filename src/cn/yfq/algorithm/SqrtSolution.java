package cn.yfq.algorithm;

public class SqrtSolution {
    public static int mySqrt(int x) {
        if(x==0 || x==1){
            return x;
        }
        int left=1,right=x;
        int mid = 0;
        while(left<=right){
            mid = left + (right-left)/2;
            if(mid*mid==x){
                return mid;
            }else if((long)mid*mid<x){
                left = mid+1;
            }else {
                right = mid-1;
            }
        }
        return right;
    }

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        if(strs.length == 1){
            return strs[0];
        }
        int flag = 1;
        int end_index = 0;
        for(int i=0; i< strs[0].length(); i++){

            for(int j=0; j<strs.length;j++){
                char temp = strs[0].charAt(i);
                if(temp !=strs[j].charAt(i)){
                    flag = 0;
                    break;
                }
            }
            if(flag==0){
                end_index = i;
                break;
            }
        }
        if(end_index==0){
            return "";
        }
        return strs[0].substring(0,end_index);

    }

    public static void main(String[] args) {
        //["dog","racecar","car"]
        String[] strs = {"c","c"};
        System.out.println(longestCommonPrefix(strs));

        System.out.println("hello".substring(0,2));
    }
}
