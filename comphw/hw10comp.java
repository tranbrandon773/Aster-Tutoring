import java.util.ArrayList;

public class hw10{
    
    //Write the function isPalindromicNumber(n) that takes a non-negative int n and returns true if that number is palindromic and false otherwise, where a palindromic number is the same forwards as backwards. For example, these numbers are palindromic: 0, 1, 99, 12321, 123321, and these numbers are not: 1211, 112, 10010.
    public static boolean isPalindromicNumber(int n){
        String num = Integer.toString(n);
        String revNum = "";

        for(int i = 0; i < num.length(); i++){
            revNum = num.substring(i, i+1) + revNum;
        }
        
        if(num.equals(revNum)){
            return true;
        }

        else{
            return false;
        }
    }

    //Write the function nthPalindromicPrime(n) where a palindromic prime is a number that is both palindromic and prime. So nthPalindromicPrime(0) returns 2, and nthPalindromicPrime(10) returns 313.
    public static int nthPalindromicPrime(int n){ 

        int i = 0;
        int num = 1;
        
        while(i < n+1){
            int a = 0;
            num++;
            for(int div = 2; div <= num; div++){
                if(num % div == 0){
                    a++;
                }
            }
            if(a==1 && isPalindromicNumber(num)){
                i++;
            }
        }
        return num;
    }

    //Write the function longestDigitRun(n) that takes a possibly-negative int value n and returns the digit that has the longest consecutive run, or the smallest such digit if there is a tie. So, longestDigitRun(117773732) returns 7 (because there is a run of 3 consecutive 7"s), as does longestDigitRun(-677886).
    public static int longestDigitRun(int n){
        
        int oldDig = 999;
        int currDig;
        int consec = 0;
        n = Math.abs(n);
        ArrayList<Integer> digits = new ArrayList<Integer>();
        ArrayList<Integer> count = new ArrayList<Integer>();

        if(n/10 == 0){return n;}

        while (n > 0){
            currDig = n%10;
            if(currDig == oldDig){
                consec++;
            }
            else{   
                digits.add(oldDig);
                count.add(consec);
                consec = 0;
            }
            oldDig = currDig;
            n = n/10;
        }
        if(consec != 0){
            digits.add(oldDig);
            count.add(consec);
        }

        int greater = 0;
        for(int i = 0; i < count.size(); i++){
            if(count.get(i) > count.get(greater)){
                greater = i;
            }
        }
        
        int greaterEle = count.get(greater);
        count.set(greater, 0);
        int tieInstance = 0;
        for(int i = 0; i < count.size(); i++){
            if(count.get(i) > count.get(tieInstance)){
                tieInstance = i;
            }
            
        }
        if(greaterEle == count.get(tieInstance)){
            return Math.min(digits.get(greater), digits.get(tieInstance));
        }
        return digits.get(greater);
    }
    
    //Write the function sumOfSquaresOfDigits(n) which takes a non-negative integer and returns the sum of the squares of its digits. 
    public static int sumOfSquaresOfDigits(int n){
        
        int dig;

        if(n == 0){return 0;}

        else{
            dig = n%10;
            return dig*dig + sumOfSquaresOfDigits(n/10);
        }
    }

    //Write the function isSemiPrime(n) that takes a non-negative integer and returns true if it is a semi-prime, and false otherwise.
    //https://en.wikipedia.org/wiki/Semiprime
    public static boolean isSemiPrime(int n){
        int facA = n;
        int facB = n;
        int facFound = 0;

        if(n < 0){return false;}

        for(int i = 2; i < n; i++){
            if(n%i == 0 && n/i != facA){
                facA = i;
                facB = n/i;
                facFound++;
            }
        }
        if(facFound != 1){return false;}

        for(int i = 2; i < facA; i++){
            if(facA%i == 0){return false;}
        }

        for(int i = 2; i < facB; i++){
            if(facB%i == 0){return false;}
        }
        return true;
    }

    public static void testAll(){

        testIsPalindromicNumber();
        testNthPalindromicPrime();
        testLongestDigitRun();
        testSumOfSquaresOfDigits();
        testIsSemiPrime();
        
    }
    
    public static void testIsPalindromicNumber(){

        System.out.println("Testing isPalindromicNumber()...");
        assert isPalindromicNumber(0) == true;
        assert isPalindromicNumber(4) == true;
        assert isPalindromicNumber(10) == false;
        assert isPalindromicNumber(101) == true;
        assert isPalindromicNumber(1001) == true;
        assert isPalindromicNumber(10010) == false;
        System.out.println("Passed.");
    }

    public static void testNthPalindromicPrime(){

        System.out.println("Testing nthPalindromicPrime()...");
        assert nthPalindromicPrime(0) == 2;
        assert nthPalindromicPrime(4) == 11;
        assert nthPalindromicPrime(10) == 313;
        assert nthPalindromicPrime(15) == 757;
        assert nthPalindromicPrime(20) == 10301;
        System.out.println("Passed.");
    }

    public static void testLongestDigitRun(){

        System.out.println("Testing longestDigitRun()... ");
        assert(longestDigitRun(117773732) == 7);
        assert(longestDigitRun(-677886) == 7);
        assert(longestDigitRun(5544) == 4);
        assert(longestDigitRun(1) == 1);
        assert(longestDigitRun(0) == 0);
        assert(longestDigitRun(22222) == 2);
        assert(longestDigitRun(111222111) == 1);
        System.out.println("Passed.");
    }

    public static void testSumOfSquaresOfDigits(){

        System.out.println("Testing sumOfSquaresOfDigits()...");
        assert(sumOfSquaresOfDigits(5) == 25);   // 5^2 = 25
        assert(sumOfSquaresOfDigits(12) == 5);   // 1^2 + 2^2 = 1+4 = 5
        assert(sumOfSquaresOfDigits(234) == 29); //2^2 + 3^2 + 4^2 = 4+9+16 = 29
        System.out.println("Passed.");
    }

    public static void testIsSemiPrime(){

        System.out.println("Testing isSemiPrime()...");
        assert(isSemiPrime(14) == true);
        assert(isSemiPrime(65) == true);
        assert(isSemiPrime(18) == false);
        assert(isSemiPrime(1679) == true);
        assert(isSemiPrime(17) == false);
        assert(isSemiPrime(15112) == false);
        assert(isSemiPrime(-26) == false);
        System.out.println("Passed.");
    }

    //test all your code here
    public static void main (String[] args){

        testAll();
    }
}