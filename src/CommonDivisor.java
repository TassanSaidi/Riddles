public class CommonDivisor {


    public static String getGCD(String str1, String str2) {
        String gcd = "";


        // str1 = n*gcd and str2 = m*gcd , m, n are Integers
        gcd = str1.length() > str2.length() ? str2 : str1;
        String smallest =  str1.equals(gcd)? str1: str2;
        String largest = smallest.equals(str1)? str2: str1;
        if(str1.length()== str2.length()&& !str1.equals(str2)){
            return "";
        }
        int counter = 0;
        while (gcd.length() > 0) {


            if (isGcd(gcd + largest.substring(gcd.length()), smallest, gcd)) {
                if (largest.split(gcd).length==0 && smallest.split(gcd).length==0){
                    return gcd;
                }

            }
            counter++;
            gcd = gcd.substring(0, gcd.length() - 1);
        }

        return "";
    }


    public static boolean isGcd(String str1, String str2, String gcd) {
        if (str1.length() % gcd.length() == 0 && str2.length() % gcd.length() == 0 && str2.contains(gcd) && str1.contains(gcd)) {
            return true;
        }
        return false;
    }
}
