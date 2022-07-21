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

    public static int[][] resize(int[][] array2D){

        int numNonZeroRows = numNonZeroRows(array2D);

        int[][] smaller = new int [numNonZeroRows][array2D[0].length];

        int index = 0;

        //loop thru all rows, check if row is all nonzero, if all nonzero append to new array, 
        for(int row = 0; row < array2D.length; row++){

            if (isNonZeroRow(array2D, row)){

                for(int col = 0; col < array2D[row].length; col++){

                    smaller[index][col] = array2D[row][col];
                }
                
                index++;

            }
        }
        return smaller;
    }
 
    public static void main(String[] args){

       //System.out.println(q1("aabb", "aaaabb"));

        //String str = "aaaabb";
        //String guess = "aabb";
       // System.out.println(str.substring(2,6).equals(guess));
        //System.out.println(guess.substring(2,6));
    
    }
}

class combinedTable{ //0.5pt

    private SingleTable tab1; //1 pt
    private SingleTable tab2;

    public combinedTable(SingleTable table1, SingleTable table2){ //0.5 pt

        tab1 = table1; //1 pt
        tab2 = table2;

    }

    public boolean canSeat(int num){ //1 pt
 
        if (num <= tab1.getNumSeats() + tab2.getNumSeats() - 2){ //1pt
            
            return true; //1 pt

        }

        return false;
    }

    public double getDesirability(){ //1pt 

        if(tab1.getHeight() == tab2.getHeight()){

            return (tab1.getViewQuality() == tab2.getViewQuality())/2; //1pt
        }

        return (tab1.getViewQuality() == tab2.getViewQuality())/2 - 10; //1pt
    }
    
}
