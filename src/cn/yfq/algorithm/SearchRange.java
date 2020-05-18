package cn.yfq.algorithm;

/**
 * 查找有序nums 中target 出现的区间，不包含返回[-1,-1]
 */
public class SearchRange {

    // returns leftmost (or rightmost) index at which `target` should be
    // inserted in sorted array `nums` via binary search.
    private int extremeInsertionIndex(int[] nums, int target, boolean left) {
        int lo = 0;
        int hi = nums.length;

        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (nums[mid] > target || (left && target == nums[mid])) {
                hi = mid;
            }
            else {
                lo = mid+1;
            }
        }

        return lo;
    }

    public static int search(int[] nums,int target){
        int left = 0;
        int right = nums.length;
        int mid = 0;
        while (left<right){
            mid = (left+right)/2;
            if(nums[mid]>target){
                right = mid;
            }else {
                left = mid + 1;
            }
        }
        return left;
    }

    public int[] solution(int[] nums, int target){
        int[] result = {-1,-1};


        return result;
    }

    public static void main(String[] args) {
        int nums[] = {1,3,5,5,5,5,7,8};
        int index = search(nums, 5);
        System.out.println(index);
        System.out.println(nums[index-1]);
    }
}
