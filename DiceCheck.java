/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicecheck;

import java.util.Scanner;

/**
 *
 * @author leandroestevez
 */
public class DiceCheck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Dice dice = new Dice();
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter the numbers: ");
        
        for(int i = 0; i < 6; i++) {
            int number = input.nextInt();
            dice.countInput(number);
        }
        
        dice.printValues();
        
    }
    
}
