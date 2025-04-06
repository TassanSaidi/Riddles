import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
//
//        System.out.println("Hello world!");
//
//        String word1 = "abc";
//        String word2 = "pqr";
//
//
//        ArrayList<String> wordArr = new ArrayList<>();
//
//        for(int a =0; a< word1.length(); a++){
//            wordArr.add(String.valueOf(word1.charAt(a)));
//        }
//        ArrayList<String> word2Arr = new ArrayList<>();
//        for(int a =0; a< word2.length(); a++){
//            word2Arr.add(String.valueOf(word2.charAt(a)));
//        }
//        StringBuilder output = new StringBuilder();
//        if(word1.length()==word2.length() || word1.length()<word2.length()){
//            for (int i=0; i<word1.length(); i++){
//                output.append(wordArr.remove(0)).append(word2Arr.remove(0));
//            }
//        }
//        if(word1.length()>word2.length()){
//            for (int i=0; i <word2.length(); i++){
//                output.append(wordArr.remove(0)).append(word2Arr.remove(0));
//            }
//        }
//
//        wordArr.forEach(i-> output.append(i));
//        word2Arr.forEach(i-> output.append(i));
//
//        System.out.println(output);

       // System.out.println("GCD: "+ CommonDivisor.getGCD("ABCABC","ABC"));
       int [] flowerbed = {1,0,0,0,1};
       int n = 2;
       System.out.println("Possible: ".concat(String.valueOf(FlowerPots.canPlaceFlowers(flowerbed, n))));

    }
}