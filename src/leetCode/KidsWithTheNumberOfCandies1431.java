package leetCode;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheNumberOfCandies1431 {
    public static void main(String[] args) {
        SolutionKidsWithNumbre k = new SolutionKidsWithNumbre();
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(k.kidsWithCandies(candies,extraCandies));

    }
}

class SolutionKidsWithNumbre{
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> resultado = new ArrayList<>();
        int mayor = candies[0] ;
        for (int i=1; i < candies.length;i++){
            if(mayor >= candies[i]){
                mayor = mayor;
            } else {
                mayor= candies[i];
            }
        }
        System.out.println(mayor);
        for (int i =0; i < candies.length;i++){
            if ((candies[i]+extraCandies)>= mayor){
                resultado.add(true);
            } else {
                resultado.add(false);
            }
        }

        return resultado;
    }
}