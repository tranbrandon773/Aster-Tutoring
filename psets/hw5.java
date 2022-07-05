//Trace the code in each codeTrace method and keep a note of what you get as the expected output 
public class hw5{ 

    //run in main method for answer
    public static void codeTrace1(){
        
        int i = 1;
        int j = 20;
        int k = 31;

        while (i < j){

            k += (i/j);

            i += 2;

            j--;
        }

        System.out.println("i = " + i + " j = " + j + " k = " + k);
    }

    //run in main method for answer
    public static void codeTrace2(){

        int n = 5;

        while(n > 0){

            System.out.println("n = " + n );

            n--;
        }
    }

    //run in main method for answer
    public static void codeTrace3(){

        int n = 0;

        int sum = 0;

        while(n <= 6){

            n++;

            sum += n;
        }

        System.out.println("sum = " + sum);
    }

    //run in main method for answer
    public static void codeTrace4(){

        int n = 5;

        while (n > 0){

            n--;

            System.out.println("n = " + n );
        }
    }

    //Using a while loop, write a program that prints the factors of a given integer num
    //hint; a factor is a defined as a number or algebraic expression that divides another number or expression evenly (with no remainder)
    public static void factorsOfNum(int num){

    }
    
    //Write a program that prints out a pair of factors of num each time it finds a pair
    //hint; think about how you would want to check/increment for the two individual factors 
    public static void factorPairsOfNum(int num){

    }
    
    //uncomment methods as you go to test them
    public static void main(String[] args){

        //codeTrace1();
        //codeTrace2();
        //codeTrace3();
        //codeTrace4();
        //factorsOfNum();
        //factorPairsOfNum();
    }   
}
