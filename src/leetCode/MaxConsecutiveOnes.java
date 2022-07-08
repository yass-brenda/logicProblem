package leetCode;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        SolutionMaxNumber s = new SolutionMaxNumber();
        int array[]  = {1,1,1,0,1};
        System.out.println(s.findMaxConsecutiveOnes(array));
    }
}

class SolutionMaxNumber {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maximo = 0;
        int contador = 0;


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                contador++;
            } else {
                maximo = Math.max(maximo,contador);
                contador = 0;
            }

        }
        return Math.max(maximo,contador);

    }
}