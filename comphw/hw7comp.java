import java.util.ArrayList;

public class hw7 {
    
    //Write a method that takes in a double array and adds every element that can be rounded (decimal value of 0.5 or greater) to an ArrayList then returns the String format of that ArrayList 
    public static void problem1(double[] arr){
        ArrayList<Double> canRound = new ArrayList<Double>();
        for (int i = 0; i < arr.length; i++){

            if (arr[i]%1 >= 0.5){
                
                canRound.add(arr[i]);
            }
        }
        System.out.println(canRound.toString());
    }

    //Write a method that takes two Strings of equal length and adds them to an ArrayList alternately then returns the String format of that ArrayList
    //Ex. String str1 = 'abc', String str2 = 'def', problem2(str1, str2) = [a,d,b,e,c,f]
    public static void problem2(String str1, String str2){
        ArrayList<String> arr = new ArrayList<String>();
        for (int i = 0; i < str1.length(); i++){
            arr.add(str1.substring(i, i+1));
            arr.add(str2.substring(i, i+1));
        }
        System.out.println(arr.toString());
    }

    //Write a method that takes in a ArrayList of Strings as well as some String char and removes each each element that begins with char then returns the String format of the ArrayList holding all removed elements
    public static void problem3(ArrayList<String> arr, String ch){
        ArrayList<String> removedEle = new ArrayList<String>();
        for (String ele : arr){
            if (ele.substring(0,1).equals(ch)){
                arr.remove(ele);
                removedEle.add(ele);
            }
        }
        System.out.println(removedEle.toString());
    }

    //Write a method that takes in an ArrayList of ints and returns the reverse of that ArrayList
    public static void problem4(ArrayList<Integer> ints){
        ArrayList<Integer> reverse = new ArrayList<Integer>();
        for (int num : ints){
            reverse.add(0, num);
        }
        System.out.println(reverse.toString());
    }
   

    
    //Using iteration, write a method that takes in two integer ArrayLists and returns true if they are equal
    public static void problem5(ArrayList<Integer> arr1, ArrayList<Integer> arr2){
        int equalEle = 0;
        for (int i = 0; i < arr1.size(); i++){
            if (arr1.get(i) == arr2.get(i) && arr1.size() == arr2.size()){
                equalEle++;
            }
        }
        if (equalEle == arr1.size()){
            System.out.println("true");
        }
    }
    
    /*Write a method that takes in an ArrayList of Strings and an integer num and trims the ArrayList down to only num elements then returns the String format of the trimmed ArrayList
    Ex. arr = [1,2,3,4,5,6,7,8,9,10], len = 6, trimArr = [1,2,3,4,5,6]
    hint: use a while loop */ 
    public static void problem6(ArrayList<String> arr, int num){
        ArrayList<String> trimArr = new ArrayList<String>();
        int i = 0;
        while (i < num){
            trimArr.add(arr.get(i));
            i++;
        }
        System.out.println(trimArr.toString());
        
    }

    //test all your code here
    public static void main(String[] args){
       
    }
       
}