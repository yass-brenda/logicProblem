package leetCode;


public class MaximumNumberofWordsFoundinSentences {
    public static void main(String[] args) {
        SolutionMaximunNumberOfWord s = new SolutionMaximunNumberOfWord();
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(s.mostWordsFound(sentences));
    }
}

class SolutionMaximunNumberOfWord{
    public int mostWordsFound(String[] sentences) {
        String palabra;
        int contador= 1;
        int mayor = 0;
        for(int i =0; i< sentences.length;i++){
            palabra = sentences[i];
            for(int j=0; j < palabra.length();j++){
                if(String.valueOf(palabra.charAt(j)).equals(" ")){
                    contador++;
                }
            }

            if (contador >= mayor){
                mayor = contador;
            } else {
                mayor = mayor;
            }
            contador = 1;
        }

        return mayor;
    }
}