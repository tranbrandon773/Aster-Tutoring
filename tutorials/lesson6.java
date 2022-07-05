import java.lang.Math;

public class lesson6 {
    
    public static void printEle(int[] arr){

        for (int i = 0; i < arr.length; i++){

            System.out.println(arr[i]);
        }

    }

    //arrays - primitive type, similar to bools, doubles, ints
    //int var = some int, arrays = [int1, int2, int3,...]

    public static void main(String[] args){

        //datatype[] name = new datatype[length];
        //this way just creates an empty array with that length

        //datatype[] name = new datatype[]{var1, var2, var3,...}
        //this creates an array full of the variables with fixed length

        //arrays always have fixed length, but you can change the data inside

        int[] arr1 = new int[10];

        arr1[0] = 2;
        arr1[1] = 4;
        arr1[2] = 6;
        arr1[3] = 8;
        arr1[4] = 10;
        arr1[5] = 12;
        arr1[6] = 14;
        arr1[7] = 16;
        arr1[8] = 18;
        arr1[9] = 20;

        int[] arr2 = new int[]{1,2,3,4,5};
        //this array has index 0,1,2,3,4

        //arr have x length and x-1 indices,

        //System.out.println(arr2[0]);

        int[] arr3 = new int[20]; //fill this one with multiples of 3
            
        //arr3 = [3,6,9,12,...] 
        //        0,1,2,3,...
        for (int i = 0; i < arr3.length; i++){

            if (i == 0){

                arr3[i] = 3;
            }

            else{ 

                arr3[i] = arr3[i-1]+3;
            }
            
        }
        
        printEle(arr3);

        //multidimensional arrays
        //most common = 2D

        //row x cols, i x j, m x n size
        int[][] arr4 = new int[][]{{1,2,3,4,5},
                                  {6,7,8,9,10}};


        // i = 0, j =0-4 [0][0], [0][1], ....
        for (int i = 0; i < arr4.length; i++){

            for (int j = 0 ; j < arr4[0].length; j++){

                System.out.println(arr4[i][j]);
            }
        }
        

        //always check for length of each row aka number of cols
        int[][] arr5 = new int[][]{{1,2,3,4,5},
                                  {6,7,8,9,10,11,12}};


        // i = 0, j =0-4 [0][0], [0][1], ....
        for (int i = 0; i < arr5.length; i++){

            for (int j = 0 ; j < arr5[i].length; j++){

                System.out.println(arr5[i][j]);
            }
        }
        
        int[][][] arr6 = new int[10][10][10];
        
        for (int i = 0; i < arr6.length; i++){

            for (int j = 0 ; j < arr6[i].length; j++){

               for (int k = 0; k < arr6[i][j].length; k++){

                arr6[i][j][k] = (int)Math.random() * 100 + 1;

               }

            }
   
        }

        for (int i = 0; i < arr6.length; i++){

            for (int j = 0 ; j < arr6[i].length; j++){

               for (int k = 0; k < arr6[i][j].length; k++){

                System.out.println(arr6[i][j][k]);
                
               }

            }
   
        }

    }

}

