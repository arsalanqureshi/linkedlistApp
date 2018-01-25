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
public class LinkedList {
    
    private Node myNode = null;
    private int size = -1;
    
    LinkedList(){
        
    }
    
    
    public void add(int value){
        if(myNode == null){ // Mean adding first time
            myNode = new Node(value, null, null);
            size++;
           
        }
        else { // add node at tail
            
            Node lastNode = getTailElement();
            Node newNode = new Node(value, lastNode, null);
            lastNode.setNext(newNode);
            
        }
    }
    
    /**
     * Remove tail element
     */
    public void removeTailEmelent(){
        Node tailNode = getTailElement();
        Node secondLastNode = tailNode.getPrevious();
        
        if(secondLastNode != null){
            secondLastNode.setNext(null);
        }
        
        tailNode = null;
        
        
    }
    
    
    /**
     * Return null if last element not exist
     * @return 
     */    
    public Node getTailElement(){
       Node tempNode = myNode;
       
       do{
           if(tempNode!=null){
            if(tempNode.isTail()){ // mean last element
                break;
            } else{
                tempNode = tempNode.getNext();
            }
           }
       }
       while(tempNode !=null);
       return tempNode;
    }
    
    
    public void removeGreatThan(int targetValue) {
        Node currentNode = myNode;
       
        do {
            //System.out.println("---" + myNode);
//            printlist();
            if (currentNode != null) {
                if(currentNode.getValue() > targetValue){
                    Node pre = currentNode.getPrevious();
                    Node next = currentNode.getNext();
                    
                    //Coner cases
                    if(pre == null){ //mean head node
                        currentNode = null;
                        next.setPrevious(null); // make it head
                        currentNode = next; 
                        myNode = next;
                    }
                    else{
                        pre.setNext(next);
                        currentNode = pre;  
                    }
                    
                    
                }
                else{
                    currentNode = currentNode.getNext();
                }
            }
        } while (currentNode != null);

    }

   public void printlist(){
       Node tempNode = myNode;
       
       do{
           if(tempNode!=null){
               System.out.println(tempNode.getValue());
                tempNode = tempNode.getNext();
           }
       }
       while(tempNode !=null);
   }

    /**
     * @return the size
     */
    
    
   
    
    
}
