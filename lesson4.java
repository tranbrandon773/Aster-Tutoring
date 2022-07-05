import java.lang.Math;

public class lesson4 {
    
    //iteration = looping
    //keeps repeating essentially
    public static void main(String[] args){

        //for loop - iterative counter
        // ++ - increment by one
        
        for (int i = 0; i < 10; i++){

            // i = 0
            System.out.println(i);
            // i = 0
            // 0
            // 1
            // 2
            // 3
            // 4
            // 5
            // 6
            // 7
            // 8 
            // 9 
            
            //i++, i=1
        }

        int num = 2;

        for (int i = 1; i <= 5; i++){

            //i = 1
            System.out.println(Math.pow(num, i));
            // 2^1
            // 2^2
            // 2^3
            // 2^4
            // 2^5

        }

        for (int i = 10; i >= 0; i--){

            //i = 10
            System.out.println(Math.pow(num, i));
            // 10
            // 9
            // 8
            // 7
            // 6
            // 5
            // 4
            // 3
            // 2
            // 1
            // 0
        }

        //0 > 0
        for (int i = 999; i > 0; i/=3){

            // i = 12
            System.out.println(i);
            // i = 12
            // 999
            // 333
            // 111
            // 37
            // 12
            // 4
            // 1

            //i/3, i = 0
        }

        //nested for loop
        /*for (int i = 0; i < 10; i++){

            for (int j = 0; j < 10; j++){


                System.out.println("I: " + i);
                System.out.println("j: " + j);
            }

        }*/

    }

}
