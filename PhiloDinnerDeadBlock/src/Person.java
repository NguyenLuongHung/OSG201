/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luong
 */


public class Person {
    String state = "";
    boolean leftFork = false;
    boolean rightFork = false;
    
    public Person(String state){
        this.state = state;
    }
    
    public void setState(String state){
        this.state = state;
    }
    public void setLeftFork(boolean a){
        this.leftFork = a;
    }
    public void setRightFork(boolean a){
        this.rightFork = a;
    }
    
}
