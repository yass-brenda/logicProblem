package leetCode;

import java.util.Arrays;

public class ShuffleTheArray1470 {
    public static void main(String[] args) {
    SolutionShuffle s = new SolutionShuffle();
    int[] array = {1,2,3,4};
        System.out.println(Arrays.toString(s.shuffle(array,2)));
    }
}
class SolutionShuffle{
    public int[] shuffle(int[] nums,int n){
        int [] newArray = new int[nums.length];
        int contador = 0;
        int media = n;

        for(int i=0; i<n;i++){
            newArray[contador] = nums[i];
            newArray[contador+1] = nums[media];
            media++;
            contador+=2;
        }
        return newArray;
    }
}