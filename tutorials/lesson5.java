public class lesson5 {
    
    public static void hasConsecutiveDigits(int num){

        int currDig;
        int oldDig = 999;

        while(num > 0){

            currDig = num%10;

            if (currDig == oldDig){

                System.out.print("consecutive digits");
                break;
            }

            oldDig = currDig;
            num/=10;

        }
    }

    public static void digitCount(int num){
    
        int count = 0;

        while (num > 0){

            num/=10; 
            count++;
            
        }

        System.out.println(count);
    }
    
    public static void main(String[] args){

        //for loop - counting
        for(int i = 0; i < 10; i++){

        }

        //while loop - creating your own counter variable

        /*int  x = 5;

        while (x > 0){

            System.out.println("x = " + x);
            x--; 
        }*/

        //while loop - using  a boolean condition

        /*int y = 0;

        boolean notGreaterThan10 = true;

        //while notGreaterThan10 == true
        while (notGreaterThan10){

            if (y < 10){

                System.out.println("y = " + y);
                y++;

            }

            else if (y >= 10){

                notGreaterThan10 = false;
                System.out.print("else if condition");
            }

        }*/

        //digit count - count the digits of a given integer number
        // we dont know how many digits initially, so use a while loop bc for loop needs to know certain number of times to run     
        // %10, will give us the last digit, /10 will mske the number one less digit long

        /*

        System.out.println(count);*/
 
       /*boolean aLessThanB = true;
        boolean bGreaterThan100 = true;

        int a = 0;
        int b = 0;

        while(aLessThanB && bGreaterThan100){

            if (a < b && b > 100){

                aLessThanB = false;
                bGreaterThan100 = false;
            }
            
            a+=5;
            b+=6;
        }

        System.out.println(a);
        System.out.println(b);*/

        //nested for loops - for loop inside a for loop; inner for loop always runs first

        //10 iterations, running 10 iterations in ther inner for loop - 100 times

        /*int count = 0;

        for (int i = 0; i < 10; i++){

            for (int j = 0; j < 10; j++){
            
                System.out.println("i = " + i + " j = " + j);
                

            }
        }*/

        // i = 0, j = 0, j = 1, j = 2,..., j = 9;
        // i = 1, j = 0, j = 1, j = 2,..., j = 9;
        // i = 2, j = 0, j = 1, j = 2,..., j = 9;
        // i = 3, j = 0, j = 1, j = 2,..., j = 9;
        // i = 4, j = 0, j = 1, j = 2,..., j = 9;

        /* Write a nested for loop, where the first (outer) for loop starts at i = 5, until i <= 100, increments by +5
        // and the second (inner) for loop starts at j = 100, until j >= 0, decrements by 5

        //100 - 5 -5 -5 -5 == 100/5 = 20, keep into account >=, so 21
        // starts 5, so really <=100-5, so 19 times ran, but <=, so 20 

        /int count = 0;

        for (int i = 5; i <=100; i+=5){

            for (int j = 100; j>=0;j-=5){
                
                System.out.println("i = " + i + " j = " + j);

            }
        }*/

    }
}
