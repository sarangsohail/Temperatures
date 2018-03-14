## Game Objective:
Write a program that prints the temperature closest to 0 among input data. If two numbers are equally close to zero, positive integer has to be considered closest to zero (for instance, if the temperatures are -5 and 5, then display 5).
Your program must read the data from the standard input and write the result on the standard output.
Input
Line 1: N, the number of temperatures to analyze

Line 2: A string with the N temperatures expressed as integers ranging from -273 to 5526


# Solution:
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
