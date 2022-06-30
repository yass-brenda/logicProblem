package leetCode;


public class RunningSumOf1dArray_1480 {
    public static void main(String[] args) {
    Solution s = new Solution();
    int arr[] = {1,2,3,4};
    System.out.println(s.runningSum(arr));


    }

}

class Solution {
    public int[] runningSum(int[] nums) {
        int lengthNums = nums.length; // 1
        int result[] = new int[lengthNums];
        int suma = 0;

        for(int i=0; i < nums.length;i++){
            if (i == 0){
                result[0] = nums[i];
                continue;
            }

            suma += result[i];
            result[i] = result[i-1] + nums[i];

        }
        return result;
    }
}