import java.util.ArrayList;

public class hw9 {
    
    //Given an int n, use recursion to return the sum of the integers from 0 to n inclusive
    public static int problem1(int n){

        if(n==0){

            return 0;
        }

        else{

            return problem1(n/10) + n%10;
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
    public static int problem3(ArrayList<Integer> arr){

        if(arr.size() == 1){

            return arr.get(0);
        }

        else{

            int lastEle = arr.get(arr.size()-1);
            arr.remove(arr.size()-1);
            return problem3(arr) + lastEle;
        }
    }

    //Given a String str, use recursion to return the reverse of str 
    public static String problem4(String str){

        if(str.length() == 0){

            return "";
        }
        
        else{

            return problem4(str.substring(1, str.length())) + str.substring(0, 1);
        }
    }

    //Given an ArrayList of integers, use recursion to return the number of odd elements in the list
    public static int problem5(ArrayList<Integer> arr){

        if (arr.size() == 0){

            return 0;
        }

        else if ((arr.get(arr.size()-1))%2 == 1){

            arr.remove(arr.size()-1);
            return problem5(arr) + 1;

        }

        else{

            arr.remove(arr.size()-1);
            return problem5(arr);
        }
    }
    
    //Given an int n, use recursion to return whether n consists of only consecutive digits (from left to right i.e. 12345)
    public static boolean problem6(int n, int oldDig){

        int currDig = n%10;

        if(n==0){

            return true;

        }

        if (oldDig <= currDig){

            return false;
        }

        else{

            return problem6(n/10, currDig);
        } 
    }

    //test all your code here
    public static void main(String[] args){
        
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for(int i = 1; i<=6; i++){

            arr.add(i);
        }

       // System.out.println(arr.toString());
       // System.out.println(problem5(arr));

       //String str = "hello";

        //System.out.println(problem4(str));

        //System.out.println(problem6(54321, 999));
    }
}
