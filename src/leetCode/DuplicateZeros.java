package leetCode;

import java.util.Arrays;

public class DuplicateZeros {
    public static void main(String[] args) {
        SolutionDuplicateZeros s = new SolutionDuplicateZeros();
        int array[]  = {1,0,2,3}; //1,0,0,2,3,0,0,4
        s.duplicateZero(array);
        int n= 8;
        s.pruebs(n);
        System.out.println(n);
        System.out.println(Arrays.toString(array));

    }
}

class SolutionDuplicateZeros{

    public void pruebs(int n){
        n = 10;
    }
    public void duplicateZero(int[] arr) {
        for(int i=0; i < arr.length;i++){
            if(arr[i] == 0){
                for(int j = arr.length-1; i < j; j--){
                    arr[j] = arr[j - 1];
                }
                i++;
            }
        }

    }
}