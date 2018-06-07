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
public class EatThread1 extends Thread{
    Semaphore Fork1 = new Semaphore(1);
    Semaphore Fork5 = new Semaphore(1);
    
    public void run(){
        
    }
    
}
