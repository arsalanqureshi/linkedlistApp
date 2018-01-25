/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistapp;

/**
 *
 * @author Arsalan
 */
public class Node {
    private int value;
    private Node previous;
    private Node next;

    public Node(int value){
        this .value = value;
        
    }
    
     public Node(int value, Node previous, Node next){
        this .value = value;
        this.previous = previous;
        this.next = next;
        
    }
     
    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * @return the previous
     */
    public Node getPrevious() {
        return previous;
    }

    /**
     * @param previous the previous to set
     */
    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    /**
     * @return the next
     */
    public Node getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(Node next) {
        this.next = next;
    }
    
    public boolean isTail(){
        return this.next == null;
    }
    
    
    
}
