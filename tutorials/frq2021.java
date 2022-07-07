public class frq2021 {
    
    public static int q1a(String guess, String word){

        int count = 0;

        for(int i = 0; i <= word.length() - guess.length(); i++){

            if (word.substring(i, i + guess.length()).equals(guess)){

                count++;
            }
        }

        int lenSq = guess.length() * guess.length();
        return count*lenSq;
    }

    public static String q1b(String guess1, String guess2, String word){
        

        if(q1a(guess1, word) > q1a(guess2, word)){

            return guess1;
        }

        else if(q1a(guess2, word) > q1a(guess1, word)){

            return guess2;
        }

        else if(guess1.compareTo(guess2) > 0){

            return guess1;
        }

        return guess2;
    }

    public static void main(String[] args){

       //System.out.println(q1("aabb", "aaaabb"));

        //String str = "aaaabb";
        //String guess = "aabb";
       // System.out.println(str.substring(2,6).equals(guess));
        //System.out.println(guess.substring(2,6));
    
    }
}
