package cn.yfq.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 求数组中任意三个数想加为0 的集合
 */
public class ThreeNumberSum {
    public void solution(int[] nums){
        Arrays.sort(nums);//DualPivotQuicksort
        int length  = nums.length;
        //
        List<int[]> list = new ArrayList<>();

        int L = 0, R = length-1;
        while(R-L>=2){
            if(-nums[L] > nums[R]){
                for(int j =length-1; j>1;j--){
                    if(nums[j-1]>0 && nums[R] + nums[j-1] + nums[L] == 0){
                        int[] temp ={nums[R],nums[j-1],nums[L]};
                        list.add(temp);
                        System.out.println(Arrays.toString(temp));
                    }
                    L++;
                }
            }else {
                for(int i=0;i<length-1;i++){
                    if(nums[i+1]<0 && nums[R] + nums[i+1] + nums[L] == 0){
                        int[] temp ={nums[R],nums[i+1],nums[L]};
                        list.add(temp);
                        System.out.println(Arrays.toString(temp));
                    }
                    R--;
                }
            }
        }

    }

    public static void main(String[] args) {
        ThreeNumberSum threeNumberSum = new ThreeNumberSum();
        int [] nums = {1,-4,2,3,-6};
        int [] nums2 = {0,0,0};
        threeNumberSum.solution(nums2);
    }



}
