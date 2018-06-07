/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luong
 */
public class NodePerson {
    NodePerson next;
    Person person;
    public NodePerson(){}
    public NodePerson(NodePerson next, Person person){
        this.next  = next;
        this.person = person;
    }
    
}
