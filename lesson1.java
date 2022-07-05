import java.util.Scanner;
import java.lang.Math;

public class lesson1{

    /*Asks a user for a movie title, its runtime in minutes, and 3 ratings
    * then returns the movie title + runtime in hour & minutes, and the average rating
    */
    public static void movie(){

        Scanner scan = new Scanner(System.in);

        System.out.println("What is the movie title?");

        String title = scan.nextLine();

        System.out.println("What is the runtime in minutes?");

        int time = scan.nextInt();

        System.out.println("What is the 1st rating?");

        int r1 = scan.nextInt();

        System.out.println("What is the 2nd rating?");

        int r2 = scan.nextInt();

        System.out.println("What is the 3rd rating?");

        int r3 = scan.nextInt();

        int avg = (r1+r2+r3)/3;

        int min = time%60;

        int hours = time/60;

        System.out.println("The title movie is: " + title + ", the runtime is: " + hours + " hour(s) " + 
                            min + " minutes, " + "The average rating is: " + avg);

        scan.close();
    }

    /*Asks a user for temperature in Fahrenheit and returns the temperature in celsius*/
    public static void convertTemp(){

        Scanner scan = new Scanner(System.in);

        System.out.println("What is the temperature in Fahrenheit?");

        double tempf = scan.nextDouble();

        /*conversion = (tempf - 32) * 5/9 */
        double tempc = (tempf - 32) * 5/9;

        System.out.println("The temperature in celsius is: " + tempc + " degrees");

        scan.close();
    }
    
    /*Asks a user for an int num and an integer n, then return the nth digit of the num, 
    assuming the first digit is all the way to the right*/
    public static void nthDigit(){

        Scanner scan = new Scanner(System.in);

        System.out.println("Input an integer");

        int num = scan.nextInt();

        System.out.println("Input the nth number of the digit you want");

        double n = scan.nextDouble();

        double index = Math.pow(10,n-1);

        int realNum = num/(int)index;

        int digit = realNum%10;

        System.out.println("The " + n + "th digit is: " + digit);

        scan.close();
    }
    
    public static void main(String[] args){

        movie();
        convertTemp();
        nthDigit();
    }
}