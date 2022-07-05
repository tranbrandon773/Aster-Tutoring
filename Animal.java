public class Animal {
    
    private int weight, age;

    public Animal(int weight, int age){

        this.weight = weight;
        this.age = age;
    }

    public void eat(){

        System.out.println("Eating...");
    }

    public void sleep(){

        System.out.println("Sleeping...");
    }

    public void walk(){

        System.out.println("Walking...");
    }

    public void growUp(){

        this.age++;
    }
    
    public void gainWeight(int num){

        this.weight+=num;
    }

    /*public static void main(String[] args){

        Animal Macy = new Cow(200, 20, "Macy");

        Macy.eat();

        Macy.growUp();

        Macy.gainWeight(30);

        Animal Jodie = new Hen(25, 3, "Jodie");

        Jodie.eat();

        Jodie.growUp();

        Rooster Jack = new Rooster(27, 4, "Jack");

        Jack.crow();

    }*/

}

class Cow extends Animal{

    private String name;

    public Cow(int weight, int age, String name){

        super(weight, age);

        this.name = name;
    }

    public void eat(){

        System.out.println("Eating hay...");
    }

    public void growUp(){

        super.growUp();
    }

    public void gainWeight(int num){

        super.gainWeight(num);
    }

}

class Chicken extends Animal{

    private String name;

    public Chicken(int weight, int age, String name){

        super(weight, age);

        this.name = name;
    }

    public void eat(){

        System.out.println("Eating seeds...");
    }

    public void growUp(){

        super.growUp();
    }

    public void gainWeight(int num){

        super.gainWeight(num);
    }
}

class Pig extends Animal{

    private String name;

    public Pig(int weight, int age, String name){

        super(weight, age);

        this.name = name;
    }

    public void eat(){

        System.out.println("Eating carrots...");
    }

    public void growUp(){

        super.growUp();
    }

    public void gainWeight(int num){

        super.gainWeight(num);
    }
}

class Rooster extends Chicken{

    public Rooster(int weight, int age, String name){

        super(weight, age, name);
    }

    public void crow(){

        System.out.println("Crowing...");
    }
}

class Hen extends Chicken{

    public Hen(int weight, int age, String name){

        super(weight, age, name);
    }

    public void layEgg(){

        System.out.println("Laying egg...");
    }
}