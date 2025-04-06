import java.util.*;

public class Candies {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        Optional<Integer> max =  Arrays.stream(candies).boxed().max(Integer::compareTo);
        List<Boolean> results = new ArrayList<>();
        if(max.isPresent()){
            for (int c:candies){
                if (c +extraCandies >= max.get()){
                    results.add(true);
                }else {
                    results.add(false);
                }
            }
        }
        return  results;
    }
}
