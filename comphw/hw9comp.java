import java.util.ArrayList;

import javax.xml.namespace.QName;

import java.lang.Math;

public class hw9 {
    
    //Given an int n, use recursion to return the sum of the integers from 0 to n inclusive
    public static int problem1(int n){
        if(n == 0){

            return 0;
        }

        else{

            return problem1(n-1) + n;
        }
    }

    //Given an int n, use recursion to return n! (n factorial)
    public static int problem2(int n){
        if(n == 1){

            return 1;
        }

        else{

            return problem2(n-1) * n;
        }
    }

    //Given an ArrayList of integers, use recursion to return the sum of all its elements
    public static int problem3(ArrayList<Integer> arr, int i){ //where i is the arr size
        i--;

        if(i < 0){

            return 0;
        }

        else{
            
            return arr.get(i) + problem3(arr, i);
        }
    }

    //Given a String str, use recursion to return the reverse of str 
    public static String problem4(String str, int i){ //where i is the string length
        if(i == 0){

            return "";
        }

        else{

            return str.substring(i-1, i) + problem4(str, i-1);
        }
    }

    //Given an ArrayList of integers, use recursion to return the number of odd elements in the list
    public static int problem5(ArrayList<Integer> arr, int i){ //where i is the number of elements in the list
        if(i == 0){

            return 0;
        }
        
        else if(arr.get(i-1)%2 == 1){

            return problem5(arr, i-1) + 1;
        }
       
        else{

            return problem5(arr, i-1);
        }
    }

    //Given an int n, use recursion to return whether n consists of only consecutive digits (from left to right i.e. 12345)
    static int count = 0;
    public static void problem6(int n, int i){ //got stuck on this one, so it's incomplete
        i--;

        if(count == i-1){
            
            System.out.println("true");
        }
        if( i == 0){

        }

        if((n/(Math.pow(10, i)) % 10) + 1 == n/Math.pow(10, i-1) % 10 && i != 0){
        
            count++;
            problem6(n, i);
            
        }
    }

    //test all your code here
    public static void main(String[] args){
        
    }
}
