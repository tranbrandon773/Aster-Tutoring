import java.util.Scanner;


public class hw4 {
    
    //test all your code here
    public static void main(String[] args){
        problem6();
    }

    //Write a for loop that loops through the numbers 0-100 inclusive and prints out the multiples of two in this range
    public static void problem1(){
        for(int i = 0; i <= 100; i+=2){
            System.out.println(i);
        }
    }

    //Write a for loop that starts at 100 and decrements by 5 up until 5 and prints out the value of i each loop
    public static void problem2(){
        for(int i = 100; i >= 5; i-=5){
            System.out.println(i);
        }
    }

    /*Write a for loop that starts at i = 3 up until i = 729 and prints out the powers of three in this range
    (think about how you could increment i to print 3^n)*/
    public static void problem3(){
        for(int i = 3; i <= 729; i*=3){
            System.out.println(i);
        }
    }

    //Write a for loop that starts at i = 1000, and where i is divided by 2 each iteration then print out the value of i in each loop
    public static void problem4(){
        for(int i = 1000; i > 0; i/=2){
            System.out.println(i);
        }
    }

    /*Write a for loop using the variables i, max, and inc where i is the starting index, max is the value that i has to be less than or equal, 
    and inc is added to i each iteration*/
    public static void problem5(int a, int max, int inc){
        for(int i = a; i <= max; i+=inc){
            System.out.println(i);
        }
    }

    /*Write a program that asks the user for a starting index, bound, and a value to increment (make sure the increment value given is positive, if negative, make it positive) by then write a for loop using these inputs, 
    if the starting index is greater than the bound, then index should be decremented by the value given by the user,
    if the starting index is less than the bound, then index should be incremented*/
    public static void problem6(){
 
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a starting index");
        int index = scan.nextInt();
        System.out.println("Give a bound");
        int bound = scan.nextInt();
        System.out.println("Give a value to increment");
        int inc = Math.abs(scan.nextInt());
        
        if(index > bound){
            for(int i = index; i > bound; i-=inc){
                System.out.println(i);
            }
        }
        
        else if(index < bound){
            for(int i = index; i < bound; i+=inc){
                System.out.println(i);
            }
        }

        scan.close();
    }


}

