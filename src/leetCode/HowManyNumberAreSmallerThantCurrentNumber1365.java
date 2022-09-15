package leetCode;

import java.util.Arrays;

public class HowManyNumberAreSmallerThantCurrentNumber1365 {
    public static void main(String[] args) {
    SolutionHowManyNumberAreSmallerThantCurrentNumber s = new SolutionHowManyNumberAreSmallerThantCurrentNumber();
    int[] array = {7,7,7,7,7};
    System.out.println(Arrays.toString(s.smallerNumbersThanCurrent(array)));


    }
}

class SolutionHowManyNumberAreSmallerThantCurrentNumber{
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int numberActal = 0;
        int[] resultArray = new int[nums.length];
        int contador=0;

        for(int i =0; i < nums.length;i++){
           numberActal = nums[i];
            for(int j = 0; j <nums.length;j++){
                if(nums[j] != numberActal && nums[j] < numberActal){
                    contador++;
                }
            }
            resultArray[i] = contador;
            contador = 0 ;
       }

       return resultArray;
    }
}