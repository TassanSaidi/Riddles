import java.util.*;

public class ex2 {


    public static void Main(String[] args){
        String str1 = "LEET";
        String str2 = "CODE";


        int counter = 0;
        HashMap<Integer, String> map = new HashMap<>();
        if(str1.length()<= str2.length()){
            for(int i=0; i<str1.length(); i++){
                if(str1.charAt(i)==str2.charAt(i)){
                    String temp = map.get(counter);
                    if (temp != null){
                        map.put(counter,temp.concat(String.valueOf(str1.charAt(i))));
                        if (str2.split(temp+str1.charAt(i)).length==0){
                            break;
                        }
                    }else {
                        map.put(counter, String.valueOf(str1.charAt(i)));
                    }

                }else {
                    counter++;
                    map.put(counter, String.valueOf(str1.charAt(i)));
                }
            }
        } else {


            for(int i=0; i<str2.length(); i++){
                if(str2.charAt(i)==str1.charAt(i)){
                    String temp = map.get(counter);
                    if (temp!= null){
                        map.put(counter,temp +str2.charAt(i));
                        if(str1.split(temp +str2.charAt(i)).length==0){
                            break;
                        }
                    }else {
                        map.put(counter, String.valueOf(str2.charAt(i)));
                    }
                }else {
                    counter++;
                    map.put(counter, String.valueOf(+str2.charAt(i)));
                }
            }

        }


        List<String> list = map.values().stream().toList();
        String largest = "";
        for (int i=0; i< list.size();i++){

            for(int j=0 ; j<list.size();j++){
                if (list.get(j).length()>=largest.length() && list.get(j).length()>= list.get(i).length() ){
                    largest = list.get(j);
                }
            }
        }
        if (str1.split(largest).length ==str2.split(largest).length &&str1.contains(largest) && str2.contains(largest)){
            System.out.println(largest);
        }else {
            System.out.println("");
            System.out.println("Array: "+ list);
        }


    }
}
