public class lesson9{

    public static void main(String[] args){

        //recursion
        //a method calling itself a bunch times

        /* if(base case) //refers to the condition where u want your method to stop
         * 
         * else{ recursive call } aka calling the method on itself again 
         */

        System.out.print(multiply(5,4));
        System.out.print(division(15,60));
        System.out.print(fib(5));
    }

    //multiply a by b, repeated addition, add a b times 
    public static int multiply(int a, int b){

        if(b==0){

            return 0;
        }

        else{

            return multiply(a,b-1) + a;

        }

        //a = 5, b = 4
        // multiply(5,4) + 5,                   5
        // multiply(5,3) + 5,                   5
        // multiply(5,2) + 5,                   5
        // multiply(5, 1) + 5,                  5 
        // multiply(5, 0)                       0 = 20
    }

    //b divided by a, b-a, num  
    public static int division(int a, int b){

        if(b==0){

            return 0;

        }

        else{

            return division(a,b-a) + 1;

            // a = 15, b = 60
            // division(15, 60) + 1
            // division(15, 45) + 1
            // division(15, 30) + 1
            // division(15, 15) + 1
            // division(15,0)     0 = 4



        }
    }

    //1,1,2,3,5,8,13,21
    //returns nth fib term
    public static int fib(int n){

        if(n < 2){

            return n;
        }

        else{

            return fib(n-1) + fib(n-2);
        }
    }
}