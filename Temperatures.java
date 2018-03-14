import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
       
        int n = in.nextInt(); in.nextLine(); // the number of temperatures to analyse + go to the next number
        
        int targetNumber = 0;
              
        if (n == targetNumber) {
            
            System.out.println(targetNumber);   
         
        } else {
                int closestNumber = Integer.MAX_VALUE;
            
            for (int i = 0; i < n; i++) {
                
                int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
                
                if (Math.abs(t) <  Math.abs(closestNumber) || t == Math.abs(closestNumber)){
                    closestNumber = t;
                }           

            }        
            System.out.println(closestNumber);
        }
    }
}