public class hw8{

    //test all your code here
    

//Create a super class called Animal where its constructor takes in parameters weight and age
//Then, create three void methods eat(), sleep(), walk() that print "Sleeping..." so on and so on 
//Also create two void method growUp() and gainWeight(int num) that increments age by 1 and weight by num

class Animal{
    private int weight;
    private int age;

    public Animal(int weight, int age){
        this.weight = weight;
        this.age = age;
    }

    public void eat(){System.out.println("Eating...");}

    public void sleep(){System.out.println("Sleeping...");}

    public void walk(){System.out.println("Walking...");}

    public void growUp(){age++;}

    public void gainWeight(int num){weight+=num;}

}

//Create 3 subclasses Cow, Chicken, and Pig where their constructors have parameters age, weight, and name
//Create a void method eat() for each of these classes that prints "Eating {food}..." where cows eat hay, chickens eat seeds and pigs eat carrots
//Create two void methods growUp() and gainWeight(int num) that serves the same function as the same methods found in the Animal class for each of these classes

class Cow extends Animal{
    private String name;

    public Cow(int weight, int age, String name){
        super(weight, age);
        this.name = name;
    }

    public void eat(){System.out.println("Eating hay...");}

    public void growUp(){super.growUp();}

    public void gainWeight(){super.gainWeight();}
}

class Chicken extends Animal{
    private String name;

    public Chicken(int weight, int age, String name){
        super(weight, age);
        this.name = name;
    }

    public void eat(){System.out.println("Eating seeds...");}

    public void growUp(){super.growUp();}

    public void gainWeight(){super.gainWeight();}
}

class Pig extends Animal{
    private String name;

    public Pig(int weight, int age, String name){
        super(weight, age);
        this.name = name;
    }

    public void eat(){System.out.println("Eating carrots...");}

    public void growUp(){super.growUp();}

    public void gainWeight(){super.gainWeight();}
}

//Create 2 classes Rooster and Hen which are subclasses of the Chicken class where their constructors take in the same variables as their super class
//Create a void method crow() for the Rooster class that prints "Crowing..." and a layEgg() that prints "Laying egg..."

class Rooster extends Chicken(){
    public Rooster(int weight, int age, String name){
        super(weight, age, name);
    }

    public void crow(){System.out.println("Crowing...");}
}

class Hen extends Chicken(){
    public Hen(int weight, int age, String name){
        super(weight, age, name);
    }

    public void layEgg(){System.out.println("Laying egg...");}
}
