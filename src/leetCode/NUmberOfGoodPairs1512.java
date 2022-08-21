package leetCode;

public class NUmberOfGoodPairs1512 {
    public static void main(String[] args) {
        SolutionNumberOfGoodPairs s = new SolutionNumberOfGoodPairs();
        int[] array = {1,1,1,1};
        System.out.println(s.numIdenticalPairs(array));
    }
}

class SolutionNumberOfGoodPairs{
    public int numIdenticalPairs(int[] nums){
        int contador = 0;
        int resultado = 0;
        for(int i=0; i < nums.length-1; i++){
            for (int j = i+1; j < nums.length;j++){
                if(nums[i] == nums[j] && i < j){
                    contador++;
                }
            }
        }

        return contador;
    }
}