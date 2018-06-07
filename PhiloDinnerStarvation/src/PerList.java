/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luong
 */
import java.util.concurrent.Semaphore;
public class PerList{
    
    
    NodePerson head;
    public PerList(){
        head = null;
    }
    
    public boolean isEmpty(){
        return (head == null);
        
    }
    
    public void addToTail(Person q){
        if (isEmpty()) head = new NodePerson(null,q);
        else{
            NodePerson p = new NodePerson(head,q);
            head.next = p;
        }
            
    }
}
