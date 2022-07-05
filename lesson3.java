public class lesson3{


    public static int divThreeVars(int a, int b, int c){

        if(c != 0 ){

            return (a + b)/c;

        }

        else{

            System.out.print("C is zero, diff number please");
            return 0;
        }
        
    }

    public static void main(String[] args){

        // booleans and conditionals

        // True or False

        // x,y -> x && y, x || y, !x !True, !y !False, 

        // conditionals: if, if else, else if

        // Input a number, if it's 1-10 inclusive print "Number is within range", if not 1-10 inclusive, print "Number too large" if number is >10
        /* int num = 0;

        if(1 <= num && num <= 10){

            System.out.println("Number is within range");

        }

        else if(num > 10){

            System.out.println("Number is too large");

        }

        else if(num < 1){

            System.out.println("Number is too small");
        }

        else{

            System.out.println("Conditions not met");


        }

        System.out.println("test");*/

        boolean x = true;
        boolean y =  false;

        // || - either of them are true

        //short-circuit evaluation (only works with || really)
        if ((x || y) || (x&&y)){
        // True || False || False -> True || False -> True

            System.out.println("Short circuit eval!");


        }

        // if num is < 1 or > 100, 1 > num > 100, && does not work logically
        //short circuit eval will check condition 1 first, if true then skips rest

        int num = 100;
        if ((num < 1) || (num > 100)){

            System.out.print("Short circuit eval!");

        }

        /*nested if statements
        
        if (condition){
            
            if(condition2){

                
            }

            else if(condition3){


            }

            else{


            }
        }
            */


    }
}