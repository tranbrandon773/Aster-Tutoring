public class lesson8 {

    public static void main(String[] args){

        Soda coke = new Soda(); //numSoda++;
        Soda pepsi = new Soda(); //numSoda++;
        Soda sprite = new Soda(); ////numSoda++;

        waterBottle test1 = new waterBottle();

        test1.hello();
        //test.hi(); - doesnt work bc waterBottle is parent class; does not inherit from child

        Dasani test2 = new Dasani();
        test2.hello();
        test2.hi();

        int num;
        
        waterBottle test3 = new Dasani(); //can declare it as waterBottle datatype b/c Dasani is child of that class

        test3.hello();

        waterBottle test4 = new someSubsidary(); //someSubsidary is subclass of Dasani, Dasani is subclass of waterBottle, someSubsidary is then subclass of waterBottle

        test4.hello(); /*looks for hello method in someSubsidary first, then Dasani since Dasani is direct parent, then waterBottle as last resort
                            ONLY WORKS IF METHOD EXISTS IN BOTH waterBottle and someSubsidary since test4 was created using both */
        
   
        A a = new A("A");

        B b = new B("A","B");

        C c = new C("A","C");

        D d = new D("A", "B", "D");

        a.test();
        b.test();
        c.test();
        d.test();
    }
}

class Soda{

    //public vs private; public allows methods to accessed/used
    //2 types of scope: global and local
    //ivars have global scope

    private String brand;
    private double price;
    private static int numSoda = 0; //static vars belong to the class, a static variable does not update/reset everytime an object is created

    //instances of a class, they create a new object of that class everytime its called
    public Soda(){

        numSoda++; //keeps a count of how many Soda objects are created
    } 

    public String getBrand(){ return this.brand;}

    public void setBrand(){}

}

//inheritance - a parent class and a child class, child class inherit parts of parent class or could call it super class & subclass
//constructors CANNOT be inherited
class waterBottle{

    public waterBottle(){}

    public void hello(){ System.out.print("hello waterBottle");}
}

class Dasani extends waterBottle{

    public Dasani(){}

    public void hi(){ System.out.println("hi");}

    //public void hello(){ System.out.println("hello Dasani");}

}

class someSubsidary extends Dasani{

    public someSubsidary(){}

    public void hi(){ System.out.println("hi");}

    //public void hello(){ System.out.println("hello someSubsidary");}

}

class A{

    private String someVar;

    public A(String someVar){

        this.someVar = someVar;
    }

    public void test(){

        System.out.println("test A");
    }
}

class B extends A{

    private String someVar2; //if you notice I don't create a someVar variable even though my constructor this class takes it in as a param, this is b/c it is essentially inherited from its super class 

    //subclass constructors always need to call the constructor of their super class with whatever parameters the super constructor takes, in this case someVar
    // but if any other params are included in the sub constructor that is not in the super constructor needs to be intialized in the sub construtor, which would be someVar2 here
    public B(String someVar, String someVar2){

        super(someVar);

        this.someVar2 = someVar2;
    }

    // you can call super.method inside of a subclass method granted that you want both methods to do the same exact thing
    public void test(){

        super.test(); //looks to A since B is a subclass of it
    }

}

class C extends A{

    private String someVar3;

    public C(String someVar, String someVar3){

        super(someVar);

        this.someVar3 = someVar3;
    }

    public void test(){

        super.test(); //looks to A since C is a subclass of it
    }


}

class D extends B{

    private String someVar4;

    public D(String someVar, String someVar2, String someVar4){

        super(someVar, someVar2);

        this.someVar4 = someVar4;
    }

    public void test(){
 
        super.test(); //since D is subclass of B, and B is subclass of A, it will try to look to B for test method then look to A
    }

}