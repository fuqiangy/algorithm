package cn.yfq.algorithm;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/**
 * 打乱一个没有重复元素的数组。
 *
 * 示例:
 *
 * 以数字集合 1, 2 和 3 初始化数组。
 * int[] nums = {1,2,3};
 * Solution solution = new Solution(nums);
 *
 * 打乱数组 [1,2,3] 并返回结果。任何 [1,2,3]的排列返回的概率应该相同。
 * solution.shuffle();
 *
 * 重设数组到它的初始状态[1,2,3]。
 * solution.reset();
 *
 * 随机返回数组[1,2,3]打乱后的结果。
 * solution.shuffle();
 */
public class UpsetArray {
    public int[] nums;

    public UpsetArray(int[] nums) {
        this.nums = nums;
    }
    public int[] shuffle(){
        int length = this.nums.length;
        Map<Double,Integer> treeMap = new TreeMap<>();
        int[] result = new int[length];
        //自定义映射规则，用数组下标对随机数取余，余数作为k,下标作为value,按k排序，排序后的value即为新数组的下标
        double rand = Math.random();
        for(int i = 0 ;i<length; i++) {
            double d = (i+100) % rand;
            treeMap.put(d,i);
            System.out.printf("%f--%d\n",d,i);
        }
        int i = 0;
        for (Double d:treeMap.keySet()) {
            result[i] = nums[treeMap.get(d)];
            System.out.println(treeMap.get(d));
            i++;
        }

        return result;
    }

    public int[] reset(){
        return nums;
    }

    public static void main(String[] args) {
        int[]  nums= {1,2,3,4};
        UpsetArray upsetArray = new UpsetArray(nums);
        System.out.println(Arrays.toString(upsetArray.shuffle()));
        System.out.println(Arrays.toString(upsetArray.reset()));
    }
}
