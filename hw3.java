import java.util.Scanner;

public class hw3 {
    
    //Write a program that asks the user for a number, then check if it is within 1-100, else check if it is within 1-1000, else tell the user you can't find their number, then tell the user their number at the very end regardless of what conditions were met
    public static void numInBounds(){

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your number?");

        int num = scan.nextInt();

        scan.close();
    }
    //test all your code here
    public static void main(String [] args){

        Number num1 = new Number(1, 6);
        Number num2 = new Number(1, 4);

        Number num3 = addNums(num1, num2);

        System.out.println(num3.getInt());
        System.out.println(num3.getDec());

    }
}

/* Given the Number class below that has Number objects with an integer part and decimal part (ex. 1.23 will have integer part 1 and decimal part 23, and 3.2 will have integer part 3 and decimal part 20),
 write the prompted addInt, addDec, addNums, and equals */
class Number{

    private int integer, decimal;

    public Number(int integer, int decimal){

        this.integer = integer;
        this.decimal = decimal;
    }

    //I already gave you the getters, don't worry about them
    public int getInt(){

        return this.integer;
    }

    public int getDec(){

        return this.decimal;
    }

    /*Write two static methods, addInt and addDec, that have two parameters which are both Number objects, and adds the integer and decimal parts of them respectively
    hint: use the getters to retrieve the values of each object's integer and decimal parts*/

    public static int addInt(Number num1, Number num2){

        return num1.getInt() + num2.getInt();

    }

    public static int addDec(Number num1, Number num2){

        return num1.getDec() + num2.getDec();

    }

    //Inside the addNums method below, add two Number objects together, hint: use addInt and addDec to help you here (you can call a method inside another method)
    /*example outputs in pseudocode: 1.6 + 1.4 should have integer part 3 and decimal part 0, 1.65 + 1.4 should have integer part 3 and decimal part 5, 
    1.95 + 1.4 should have integer part 3 and decimal part 35, etc */
    public static Number addNums(Number num1, Number num2){

        //Number objects have integer parts and decimal parts
        //if we're adding two Number objects, our thinking should be to add the integer parts and decimal parts together

        int decPart = (addDec(num1, num2))%100;

        int intPart = addInt(num1, num2) + addDec(num1, num2)/100;

        return new Number(intPart, decPart);

    }

    //Use this toString method I wrote to help you test your code
    public String toString(){

        return "This number has integer part:" + this.getInt() + " and decimal part: " + this.getDec();
    }
    
    //Create a method equals that takes in another Number object as a parameter and tests if the two objects are equal 
    public boolean equals(Number other){

        //Number objects have 2 params; integer and decimal part
        //test if 2 objects are equal, test if integer and decimal parts are equal respectively

        //this refers to object that method is being called on 
        return (this.getInt() == other.getInt()) && (this.getDec() == other.getDec());
    }


}
