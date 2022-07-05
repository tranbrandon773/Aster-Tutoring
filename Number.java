//A Number object with two parameters: an integer part and decimal part (ex. 1.23 will have integer part 1 and decimal part 23, and 3.2 will have integer part 3 and decimal part 20  )
public class Number {

    private int integer;
    private int decimal;

    public Number(int integer, int decimal){

        this.integer = integer;
        this.decimal = decimal;
    }
    
    public int getInt(){

        return this.integer;
    }

    public int getDec(){

        return this.decimal;
    }

    public static int addDec(Number num1, Number num2){

        return num1.getDec() + num2.getDec();

    }

    public static int addInt(Number num1, Number num2){

        return num1.getInt() + num2.getInt();
    }

    public static Number addNums(Number num1, Number num2){

        int decSum = addDec(num1, num2);

        int intSum = addInt(num1, num2);

        int intPart, decPart;

        if (decSum == 100){ 

            intPart = 1 + intSum; 
            decPart = 0;
        }
        
        else{

            decPart = decSum%100;
            intPart = decSum/100 + intSum;
        }

        return new Number(intPart, decPart);

    }
    public static void main(String[] args){

        Number num1 = new Number(11,65);

        Number num2 = new Number(4,40); 

        
        Number num3 = addNums(num1, num2);

        System.out.println(num3.getInt());
        System.out.println(num3.getDec());
    }
    
}
