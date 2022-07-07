public class hw10{
    //hello
    //Write the function isPalindromicNumber(n) that takes a non-negative int n and returns true if that number is palindromic and false otherwise, where a palindromic number is the same forwards as backwards. For example, these numbers are palindromic: 0, 1, 99, 12321, 123321, and these numbers are not: 1211, 112, 10010.
    public static boolean isPalindromicNumber(int n){

        return true;
    }

    //Write the function nthPalindromicPrime(n) where a palindromic prime is a number that is both palindromic and prime. So nthPalindromicPrime(0) returns 2, and nthPalindromicPrime(10) returns 313.
    public static int nthPalindromicPrime(int n){

        return 42;
    }

    //Write the function longestDigitRun(n) that takes a possibly-negative int value n and returns the digit that has the longest consecutive run, or the smallest such digit if there is a tie. So, longestDigitRun(117773732) returns 7 (because there is a run of 3 consecutive 7"s), as does longestDigitRun(-677886).
    public static int longestDigitRun(int n){

        return 42;
    }
    
    //Write the function sumOfSquaresOfDigits(n) which takes a non-negative integer and returns the sum of the squares of its digits. 
    public static int sumOfSquaresOfDigits(int n){

        return 42;
    }

    //Write the function isSemiPrime(n) that takes a non-negative integer and returns true if it is a semi-prime, and false otherwise.
    //https://en.wikipedia.org/wiki/Semiprime
    public static boolean isSemiPrime(int n){

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