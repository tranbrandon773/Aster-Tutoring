public class hw2 {

    

    /* 1. Write a method that does not require an object to be called and takes in 3 ints a, b, c and prints out 3a+5b-7c
        then call it inside the main method below; use whatever values you want when you call it */

    
    public static void number(int a, int b, int c){
        System.out.println(3*a+5*b-7*c);
        
    }
    
    


    // run all your code here
    public static void main(String[] args){

        // 2a) Create a new Car object with whatever parameters and name

        // 2b) Call and print all 3 getter methods to retrieve the object's model, mileage, and color

        // 2c)Set the object's mileage to another value of your choice then call and print the getMileage method again
        
        Car Nissan = new Car("Nissan Altima", 28, "Deep Blue Pearl");
        System.out.println(Nissan.getModel());
        System.out.println(Nissan.getMileage());
        System.out.println(Nissan.getColor());
        Nissan.setMileage(34);
        System.out.println(Nissan.getMileage());

    }

}

class Car{

    // 3a) Create a constructor that has paramaters model, mileage, and color

    // 3b) Write 3 methods that get a car object's model, mileage, and color respectively

    // 3c) Write a method that sets a car's mileage to another int value

    String model;
    int mileage;
    String color;

    public Car(String model, int mileage, String color) {
        this.model = model;
        this.mileage = mileage;
        this.color = color;
    }

    public static void main(String[] args){
     
        Car Ford = new Car("Ford Mustang", 21, "Ingot Silver");
        System.out.println(Ford.getModel());
        System.out.println(Ford.getMileage());
        System.out.println(Ford.getColor());
        Ford.setMileage(32);
        
    }

    public String getModel(){
        return this.model;
    }

    public int getMileage(){
        return this.mileage;
    }
    
    public String getColor(){
        return this.color;
    }

    public void setMileage(int num){
        this.mileage = num;
    }


}
