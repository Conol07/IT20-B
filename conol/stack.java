/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it20b.conol;

import java.util.Stack;

/**
 *
 * @author genek
 */
public class stack {
    


    public static void main(String[] args) {
        // TODO code application logic here
    

        Stack<Integer> mystack = new Stack<>();
        
        // Push elements onto the stack
        mystack.push(1);
        mystack.push(2);
        mystack.push(3);

        System.out.println("Stack: " + mystack);

        // Pop and display the top element
        int topElement = mystack.pop();
        System.out.println("Popped: " + topElement);
        
        // Peek at the top element without removing it
        int peekedElement = mystack.peek();
        System.out.println("Peeked: " + peekedElement);

        // Check if the stack is empty
        boolean isEmpty = mystack.isEmpty();
        System.out.println("Is Stack Empty? " + isEmpty);

        // Get the size of the stack
        int stackSize = mystack.size();
        System.out.println("Stack Size: " + stackSize);
    }
}
    
