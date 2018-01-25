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
public class TryLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LinkedList list = new LinkedList();
        
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(3);
         list.add(1);
         list.add(3);
         
        
        
     
       
//        System.out.println("Last Element: " + list.getTailElement().getValue());
//        
//        
//        list.removeTailEmelent();
//        System.out.println("Last Element: " + list.getTailElement().getValue());
        
        list.removeGreatThan(2);
        
        System.out.println("-- result");
        list.printlist();
        
        
    }
    
}
