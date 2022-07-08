package leetCode;

public class EvenNumberDigits {
    public static void main(String[] args) {
        SolutionEvenDigit s = new SolutionEvenDigit();
        int array[]  = {555,901,482,1771};
        System.out.println(s.evenMaxDigit(array));
    }
}

class SolutionEvenDigit{
    public int evenMaxDigit(int[] nums) {
         String numberToString;
         int lengthString = 0;
         int contador = 0;
        for (int i = 0; i < nums.length; i++){
            numberToString = String.valueOf(nums[i]);
            lengthString = numberToString.length();
            if( lengthString % 2 == 0){
                contador++;
            }

        }
        return contador;

    }
}