public class lesson2{

    /* to write a method:
     public static/notstaticreturntype name(params){}*/

    // static = no obj, nonstatic = obj 

    public static void hello(){

        System.out.println("Hello!");
    }

    public static void main(String[] args){ 

        Dog Fido = new Dog("Fido", 9);

        System.out.println(Fido.getAge());

        Fido.setAge(10);

        System.out.println(Fido.getAge());

        hello();

        Dog Moxy = new Dog("Moxy", "Border Collie");

        System.out.println(Moxy.getBreed());

        Moxy.setBreed("Black Lab");

        System.out.println(Moxy.getBreed());
    }
}

class Dog{

    // instance variables (ivar(s)); belong to the class, store data for constructor(s)
    String name;
    int age;
    String breed;
 
    // constructor
    public Dog(String name, int age){
 
         this.name = name; 
         this.age = age;
    }
 
    public Dog(String name, String breed){
 
         this.name = name;
         this.breed = breed;
    }
 
    // getters 
    public int getAge(){
        
         return this.age;
    }
 
    public String getBreed(){
 
         return this.breed;
    }
 
    // setters 
    public void setAge(int num){
 
         this.age = num;
    }
 
    public void setBreed(String breed){
 
         this.breed = breed;
    }
}
