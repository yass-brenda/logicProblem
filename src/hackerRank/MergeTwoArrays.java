package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class MergeTwoArrays {
    public static void main(String[] args) {
        MergeArray m = new MergeArray();
        List<Integer> a = Arrays.asList(1,2,3);
        List<Integer> b = Arrays.asList(2,5,5);
        Arrays.asList(1,1,1,1,2,3,3);
        Arrays.asList(2,5,5,6,7,8,9);
        System.out.println(MergeArray.mergeArrays(a,b));



    }
}

class MergeArray {
    public static List<Integer> mergeArrays(List<Integer> a, List<Integer>b){
        int longitudTotal = a.size() + b.size();
        List<Integer> c = new ArrayList<>();
        int num1 = 0;
        int num2 = 0;
        for (int i=0; i < a.size(); i++){
            num1 = a.get(i);
            num1 = b.get(i);

            // 1 a b


        }



        return c;

    }
}