import java.lang.Math;
import java.util.ArrayList;

public class lesson7 {

    //ArrayLists = dynamic, use methods

    //some methods: .add(), .set(), .get(), .remove(),...

    public static boolean isPrime(int num){
        
        int factor = num;

        if (num == 0 || num == 1){

            return false;
        }

        while(factor > 1){

            if (num%factor == 0 && factor != num){

                return false;
            }
            
            factor--;
        }

        return true;

    }
    public static void main(String[] args){

        //creating an ArrayList

        //List<datatype> name = new ArrayList<>();

        //ints -> Integer, doubles -> Double
        //can only store objs in arraylist
       ArrayList<Integer> arr = new ArrayList<Integer>();

        //where we add the powers of two up until 2^10 inclusive

        for (int i = 1; i <= 10; i++){

            arr.add((int)Math.pow(2,i));
        }

        /*setting element
        // [2, 4, 8, 16, 32, 64, 128, 256, 512, 1024]
        System.out.println(arr.toString());

        arr.set(2,999);

        System.out.println(arr.toString());*/

        
        /*removing element
        //[2, 4, 8, 16, 32, 64, 128, 256, 512, 1024]

        System.out.println(arr.toString());

        arr.remove(5);

        System.out.println(arr.toString());*/
        
        /*clear array

        arr.clear();

        System.out.println(arr.toString());*/

       /*for (int i = 0; i < arr.size(); i++){

            int x = arr.get(i);

            System.out.println(x);
        }*/

        /*for each loop - used w/ ArrayLists, accesses each element
        //read as "for each element in ArrayList" and goes from i = 0 to i < arr.size()

        for (int num : arr){

            System.out.println(num);

        }*/

       /* finding the nth number of something

       ArrayList<Integer> evens = new ArrayList<Integer>();

       int found = 0;

       int guess = 0;

       int n = 10;

       while(found <= n){

        if (guess%2 == 0){

            found++;
            evens.add(guess);
        }

        guess++;

       }*/

       // find the nth prime number

       int found = 0;

       int guess = 0;

       int n = 10;

       while(found <= n){

        if (isPrime(guess)){

            found++;
        }

        guess++;
    }

    System.out.println(guess);
    
}
}   

class Tree{

    private String type;

    private int age;

    public Tree(String type, int age){

        this.type = type;
        this.age = age;
    }

    public String getType(){

        return this.type;
    }

    public int getAge(){

        return this.age;
    }

    public String toString(){

        return "Tree is type " + this.getType() + " and is " + this.getAge() + " years old";
    }

    /*public static void main(String[] args){

        ArrayList<Tree> trees = new ArrayList<Tree>();
        
        trees.add(new Tree("Birch", 15));

        trees.add(new Tree("Oak", 2));

        trees.add(new Tree("Redwood", 7));

        trees.add(new Tree("Palm", 30));

        System.out.println(trees.toString());

        ArrayList<Tree> youngTrees = new ArrayList<Tree>();

        for (Tree tree : trees){

            if(tree.getAge() <= 10){

                youngTrees.add(tree);
  
            }
        }

        for (Tree tree : youngTrees){

            System.out.println(tree.toString());
        }

    }*/
}