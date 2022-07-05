import java.util.Scanner;
import java.lang.Math;

public class hw1{
    public static void trapezoid(){ 
        Scanner scan = new Scanner(System.in);
        System.out.println("What is one base measurement for the trapezoid?");
        double b1 = scan.nextDouble();
        System.out.println("What is another base measurement for the trapezoid?");
        double b2 = scan.nextDouble();
        System.out.println("What is the height for the trapezoid?");
        double h = scan.nextDouble();
        double area = ((b1+b2)/2)*h;
        System.out.println("The area of the trapezoid is: " + area);
        scan.close();
    }

    public static void fabricYards(int length){
        Scanner scan = new Scanner(System.in);
        System.out.println("How long is the fabric in inches?");
        int lengthI = scan.nextInt();
        int yards = lengthI/36;
        int inches = lengthI%36;
        System.out.println("length(" + lengthI + ") = " + yards + " yards, " + inches + " inches");
        scan.close();
    }

    public static void nameBirthday(){
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan.nextLine();
        System.out.println("When is your birthday? (mm/dd/yyyy)");
        String birthday = scan.nextLine();
        System.out.println("Hi " + name + "! Your birthday is: " + birthday);
        scan.close();
    }

    public static void distance(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the x-coordinate of the first point");
        int x1 = scan.nextInt();
        System.out.println("Give the y-coordinate of the first point");
        int y1 = scan.nextInt();
        System.out.println("Give the x-coordinate of the second point");
        int x2 = scan.nextInt();
        System.out.println("Give the y-coordinate of the second point");
        int y2 = scan.nextInt();
        double distance = Math.pow(Math.pow(x2-x1,2)+Math.pow(y2-y1,2),0.5);
        System.out.println("the distance between the two points is " + distance);
    }

    public static void volumeOfSphere(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the radius of the sphere");
        double r = scan.nextDouble();
        double volume = Math.PI*4/3*Math.pow(r, 3);
        System.out.println("The volume of the sphere is: " + volume);
    }

    public static void main(String[] args){
        distance();
    }
}

