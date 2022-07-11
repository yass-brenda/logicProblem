package leetCode;

import java.util.Arrays;

public class SquareOfStored {
    public static void main(String[] args) {
        SolutionSquareofStore s = new SolutionSquareofStore();
        int array[]  = {-7,-3,2,3,11};
        System.out.println(s.squaredOfStored(array));
    }
}

class SolutionSquareofStore{
    public int[] squaredOfStored(int[] nums) {
        int squaredNumber = 0;
        int length = nums.length;
        int[] arraySquared = new int[length];

        for (int i =0; i< nums.length;i++){
            squaredNumber = (int)Math.pow(nums[i],2);
            arraySquared[i] = squaredNumber;
        }
        Arrays.sort(arraySquared);
        return  arraySquared;
    }
}