package cn.yfq.algorithm;

import java.util.Arrays;

/**
 * 求两个有序数组的中位数，O(log(m+n))
 */
public class Median {

    public double solution(int[] nums1,int[] nums2){
        int length1= nums1.length;
        int length2= nums2.length;
        int[] nums ;

       return merge(nums1,nums2,length1,length2,(length1+length2)/2);



    }

    private double merge(int[] nums1, int[] nums2,int length1,int length2, int k) {
        System.out.println(k);
        double result ;
        if(k == 1){
            return  Math.min(nums1[0],nums2[0]);

        }
        if(length1<k){
            if(nums1[length1-1]<nums2[(k-1)/2]){

                return nums2[(k-length1)];
            }else{
                result = merge(nums1,Arrays.copyOfRange(nums2,k/2,nums2.length),length1,length2-k/2,k-k/2);
            }
        }
        if(length2<k){
            if(nums2[length2-1]<nums1[(k-1)/2]){

                return  nums1[(k-length1)];
            }else {
                result = merge(nums2,Arrays.copyOfRange(nums1,k/2,nums1.length),length2,length1-k/2,k-k/2);
            }
        }
        if(nums1[(k-1)]/2 > nums2[(k-1)]){
            result = merge(nums1,Arrays.copyOfRange(nums2,k/2,nums2.length),length1,length2-k/2,k-k/2);
        }else{
            result = merge(nums2,Arrays.copyOfRange(nums1,k/2,nums1.length),length2,length1-k/2,k-k/2);
        }
        return result;
    }

    public static void main(String[] args) {
        Median median = new Median();
        int[] nums1 = {1,2,3,6};
        int[] nums2 = {4,4,7,9};
        System.out.println(median.solution(nums1,nums2));
    }
}
