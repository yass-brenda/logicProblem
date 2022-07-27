package leetCode;

import java.util.HashMap;
import java.util.Map;


/** *
 * En este ejercicio no lo pude solucionar no supe usar
 * un booleano hayMas = i+1 < s.length(); y
 * preguntando si hay mas en el if*/


public class RomanToInteger13 {
    public static void main(String[] args) {
        SolutionRomanToInteger13 s = new SolutionRomanToInteger13();
        System.out.println(s.romanToInteger("MCMXCIV"));

    }

}

class SolutionRomanToInteger13{
    public int romanToInteger(String s) {
        Map<String,Integer> caracteresRomanos = new HashMap<String,Integer>();
        caracteresRomanos.put("I", 1);
        caracteresRomanos.put("IV", 4);
        caracteresRomanos.put("IX", 9);
        caracteresRomanos.put("V",5);
        caracteresRomanos.put("L",50);
        caracteresRomanos.put("D",500);
        caracteresRomanos.put("M",1000);
        caracteresRomanos.put("X",10);
        caracteresRomanos.put("XL", 40);
        caracteresRomanos.put("XC", 90);
        caracteresRomanos.put("C",100);
        caracteresRomanos.put("CD", 400);
        caracteresRomanos.put("CM", 900);


        String guardando = "";
        int valorInt = 0;
        boolean hayMas = false;

        for(int i = 0; i< s.length();i++){
            hayMas = i+1 < s.length();

            if ( hayMas && s.charAt(i) == 'I' && (s.charAt(i+1) == 'V' || s.charAt(i+1) == 'X')) {
                guardando = s.charAt(i) + String.valueOf(s.charAt(i+1));
                valorInt += caracteresRomanos.get(guardando);
                i++;
                continue;
            }

            if (hayMas && s.charAt(i) == 'X' && (s.charAt(i+1) == 'L' || s.charAt(i+1) == 'C')) {
                guardando = s.charAt(i) + String.valueOf(s.charAt(i+1));
                valorInt += caracteresRomanos.get(guardando);
                i++;
                continue;
            }
            if (hayMas && s.charAt(i) == 'C' && (s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M')) {
                guardando = String.valueOf(s.charAt(i)) + String.valueOf(s.charAt(i+1));
                valorInt += caracteresRomanos.get(guardando);
                i ++;
                continue;
            }

            valorInt += caracteresRomanos.get(String.valueOf(s.charAt(i)));

        }
        return  valorInt;

    }
}