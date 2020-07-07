/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicecheck;

/**
 * A dice checker to check the fairness of a dice.
 *
 * @author leandroestevez
 */
public class Dice {
    
    int[] times;
    
    /**
     * Constructs a dice object.
     */
    public Dice() {
        times = new int[7];
    }
    
    /**
     * Counts the number of times an input repeats.
     * @param number input from the dice.
     */
    public void countInput(int number) {
        
        switch(number) {
            case 1: times[1]++;
            break;
            case 2: times[2]++;
            break;
            case 3: times[3]++;
            break;
            case 4: times[4]++;
            break;
            case 5: times[5]++;
            break;
            case 6: times[6]++;
            break;
        }
        
    }
    
    /**
     * Print the number of times the inputs repeat.
     */
    public void printValues() {
        
        for(int i = 1; i < times.length; i++) {
            
            System.out.println(i + ":   " + times[i]);
            
        }
        
    }
    
}
