package leetCode;

import java.util.Arrays;

public class BuildArrayFromPermutation1920 {
    public static void main(String[] args) {
        BuildArray b =new BuildArray();
        int[] a = {5,0,1,2,3,4};
        b.buildArray(a);
        System.out.println(Arrays.toString(b.buildArray(a)));

    }
}

class BuildArray {
    public int[] buildArray(int[] nums){
        int [] ans = new int[nums.length];
        for (int i=0; i < nums.length; i++){

            /**
             * Aqui toma las reglas de los parentesis primero toma
             * nums[i] por ejemplo nums[0] entonces el resultado seria [5]
             * queda nums[5] busca que valor representa nums[5] y devuelve  4
             * **/
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}