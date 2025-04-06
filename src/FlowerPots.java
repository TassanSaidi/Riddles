import java.util.Arrays;
import java.util.List;

public class FlowerPots {

    public static Boolean canPlaceFlowers(int[] flowerbed, int n) {
        boolean result = false;
        int counter =0;
        //flowerbed = [1,0,0,0,1], n = 1
        // Need to find the amount of 0s with a zero before and after
        List<Integer> flowerBedList = Arrays.stream(flowerbed).boxed().toList();
        for(int i=0; i<flowerbed.length; i++){
            if(i==0){
                // 0010001
                if(i+1!=flowerbed.length){
                    if(flowerBedList.get(i)==0 && flowerBedList.get(i+1)==0){
                        counter++;
                        i++;
                    }
                }else {
                    if(flowerBedList.get(i)==0){
                        counter++;
                        i++;
                    }
                }

            }else {
                if (i==flowerBedList.size()-1){
                    if (flowerBedList.get(i)==0 && flowerBedList.get(i-1)==0){
                        counter++;
                        i++;
                    }
                }else {
                    if (flowerBedList.get(i)==0 && flowerBedList.get(i-1)==0 && flowerBedList.get(i+1)==0){
                        counter++;
                        i++;
                    }
                }

            }
        }


        return counter>=n;
    }
}
