import java.util.Scanner;

public class hw6 {
    
    //Write a method that takes in an int array and iterates through it, adding the number at the current index to a sum if the number is even
    public static void problem1(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i]%2 == 0){
                sum = sum + arr[i];
                
            }
        }
        System.out.println(sum);
    }

    //Write a method that takes in a double array and iterates through it, integerizing every element (make sure each element stays in its original index)
    public static void problem2(double[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println((int)arr[i]);
        }
    }
    //Write a method that takes in a String array and iterates through it, keeping a count of how many elements are equal as well as printing it
    public static void problem3(String[] arr){
        int equalEle = 0;
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
            for (int j = i+1; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    equalEle++;
                }
            }
        }
        System.out.println(equalEle);
    }

    /*Write a method that asks a user for ints numRows, numCols and creates a numRows x numCols 2D array then fills the array backwards (start at end index),
     assigning the element at the current index to the product of the current row and col*/
    public static void problem4(){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many rows?");
        int numRows = scan.nextInt();
        System.out.println("How many columns?");
        int numCols = scan.nextInt();
        int[][] arr = new int[numRows][numCols];
        for (int i = numRows-1; i >= 0; i--){
            for (int j = numCols-1; j >= 0; j--){
                arr[i][j] = (i+1)*(j+1);
                System.out.println(arr[i][j]);
            }
        }
    }

    /*Given an empty String array with unknown size, iterate through the array and assign an element to each index where:
    arr[i] == "FizzBuzz" if i is divisible by 3 and 5.
    arr[i] == "Fizz" if i is divisible by 3.
    arr[i] == "Buzz" if i is divisible by 5.
    arr[i] == i (as a string) if none of the above conditions are true.*/
    public static void problem5(String[] arr){
        for (int i = 0; i < arr.length; i++){
            if (i%3 == 0 && i%5 == 0 && i >= 3 && i >= 5){
                arr[i] = "Fizzbuzz";
                System.out.println(arr[i]);
            }
            else if (i%3 == 0 && i >= 3){
                arr[i] = "Fizz";
                System.out.println(arr[i]);
            }
            else if (i%5 == 0 && i >= 5){
                arr[i] = "Buzz";
                System.out.println(arr[i]);
            }
            else{
                arr[i] = "i";
                System.out.println(arr[i]);
            }
        }
    }

    //test all your code here
    public static void main(String[] args){
        
    }
}
