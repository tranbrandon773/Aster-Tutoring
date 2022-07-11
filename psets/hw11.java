import java.util.ArrayList;

public class hw11 {
    
    //Write the method areaOfPolygon that takes an array of (x,y) points (each coordinate pair is also an array) that are guaranteed to be in either clockwise or counter-clockwise order around a polygon, and returns the area of that polygon, as described here. For example (taken from that text), areaOfPolygon({{4,10}, {9,7}, {11,2}, {2,2}}) returns 45.5 (at least the result is almostEqual to 45.5).
    public static void areaOfPolygon(int[][] arr){

    }

    /*A polynomial can be represented as a array of its coefficients. For example, {2, 3, 0, 4} could represent the polynomial 2x^3 + 3x^2 + 4. With this in mind, write the method evalPolynomial that takes a list of coefficients and a value x and returns the value of that polynomial evaluated at that x value.
    For example, evalPolynomial({2,3,0,4}, 4) returns 180 (2*4^3 + 3*4^2 + 4 = 2*64 + 3*16 + 4 = 128 + 48 + 4 = 180). */
    public static void evalPolynomial(int[] coeffs, int x){


    }

    /*A polynomial can be represented as an array of its coefficients. For example, {2, 3, 0, 4} could represent the polynomial 2x^3 + 3x^2 + 4. With this in mind, write the method multiplyPolynomials which takes two integer arrays representing polynomials as just described, and returns an integer ArrayList  representing the polynomial which is the product of the two. For example, multiplyPolynomials({2,0,3}, {4,5}) represents the problem (2x^2 + 3)(4x + 5), and:
    (2x^2 + 3)(4x + 5) = 8x^3 + 10x^2 + 12x + 15
    And so this returns the ArrayList {8, 10, 12, 15}.*/
    public static void multiplyPolynomials(int[] p1, int[] p2){


    }
    
    //Write the method alternatingSum that takes an array of numbers and returns the alternating sum (where the sign alternates from positive to negative or vice versa). For example, alternatingSum({5,3,8,4}) returns 6 (that is, 5-3+8-4). If the list is empty, return 0.
    public static void alternatingSum(int[] arr){

    }

    /*Write the function smallestDifference that takes an array of integers and returns the smallest absolute difference between any two integers in the list. If the list is empty, return -1. For example:
    smallestDifference({19,2,83,6,27{}) should return 4 since the two closest numbers in that list are 2 and 6, and their difference is 4.*/
    public static void smallestDifference(int[] arr){

    }
    
    //Helper function; ignore this
    public static boolean almostEqual(double d1, double d2){

        int epsilon = Math.pow(10,-7);

        return (Math.abs(d2 - d1) < epsilon);   
    }
    
    public static void testAll(){

        testAreaOfPolygon();
        testEvalPolynomial();
        testMultiplyPolynomials();
        testAlternatingSum();
        testSmallestDifference();
    }

    public static void testAreaOfPolygon(){

        int[][] arr1 = {{4,10}, {9,7}, {11,2}, {2,2}};
        int[][] arr2 = {{9,7}, {11,2}, {2,2}, {4, 10}};
        int[][] arr3 = {{0, 0}, {0.5,1}, {1,0}};
        int[][] arr4 = {{0, 10}, {0.5,11}, {1,10}};
        int[][] arr5 = {{-0.5, 10}, {0,-11}, {0.5,10}};

        System.out.println("Testing areaOfPolygon()...");
        assert almostEqual(areaOfPolygon(arr1), 45.5);
        assert almostEqual(areaOfPolygon(arr2), 45.5);
        assert almostEqual(areaOfPolygon(arr3), 0.5);
        assert almostEqual(areaOfPolygon(arr4), 0.5);
        assert almostEqual(areaOfPolygon(arr5), 10.5);
        System.out.println("Passed!");
    }

    public static void testEvalPolynomial(){

        int[] arr1 = {2,3,0,4};
        int[] arr2 = {6};
        int[] arr3 = {6,-2,-20};
        int[] arr4 = {6,0,-8,0,-8,0};
        int[] arr5 = {6,0,-8,0,-8,0};
        int[] arr6 = {6,0,-8,0,-8,0};
        
        System.out.println("Testing evalPolynomial()...");
        assert evalPolynomial(arr1, 4) == 180;
        assert evalPolynomial(arr2, 42) == 6;
        assert evalPolynomial(arr3, -1) == -12;
        assert evalPolynomial(arr4, 2) == 112;
        assert evalPolynomial(arr5, 1) == -10;
        assert evalPolynomial(arr6, 0) == 0;
        System.out.println("Passed.");
    }

    public static void testMultiplyPolynomials(){

        int[] arr1 = {2};
        int[] arr2 = {3};
        int[] arr3 = {6};
        int[] arr4 = {2,-4};
        int[] arr5 = {3,5};
        int[] arr6 = {6,-2,-20};
        int[] arr7 = {2,0,-4};
        int[] arr8 = {3,0,2,0};
        int[] arr9 = {6,0,-8,0,-8,0};
        
        System.out.println("Testing multiplyPolynomials()...");
        assert Arrays.equals(multiplyPolynomials(arr1, arr2), arr3);
        assert Arrays.equals(multiplyPolynomials(arr4, arr5), arr6);
        assert Arrays.equals(multiplyPolynomials(arr7, arr8), arr9);
        System.out.println("Passed!");
    }
    
    public static void testAlternatingSum(){

        int[] arr1 = {5,3,8,4};
        int[] arr2 = {}; 
        int[] arr3 = {-1,-2,-3,-4,-5};
        int[] arr4 = {8,-9,-5,3,-3,2,0};

        System.out.println("Testing alternatingSum()...");
        assert alternatingSum(arr1) == 6;
        assert alternatingSum(arr2) == 0;
        assert alternatingSum(arr3) == -3;
        assert alternatingSum(arr4) == 4;
        System.out.println("Passed!");
    }

    public static void testSmallestDifference(){

        int[] arr1 = {19,2,83,6,27};
        int[] arr2 = {};
        int[] arr3 = {1,2,5,10,13,33,100};

        System.out.println("Testing smallestDifference()...");
        assert smallestDifference(arr1) == 4;
        assert smallestDifference(arr2) == -1;
        assert smallestDifference(arr3) == 1;
        System.out.print("Passed!");
    }

    public static void main(String[] args){

    }
}
