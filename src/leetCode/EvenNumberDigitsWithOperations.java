package leetCode;

public class EvenNumberDigitsWithOperations {
    public static void main(String[] args) {
        SolutionEvenDigitWithOperations s = new SolutionEvenDigitWithOperations();
        int array[]  = {12,345,2,6,7896,989897,8};
        System.out.println(s.evenNumberperations(array));
    }
}

class SolutionEvenDigitWithOperations{

    public int evenNumberperations(int[] nums) {
        int contador =1;
        int number = 0;
        int numbereven = 0;
        for (int i =0; i < nums.length; i++){
            number = nums[i];
            while (number/10 !=0) {
                contador++;
                number= number/10;
            }

            if(contador %2==0 ){
                numbereven++;
            }
            contador = 1;
        }

        return numbereven;
    }
}