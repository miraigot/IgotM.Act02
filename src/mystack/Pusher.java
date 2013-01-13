/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mystack;
/**
 *
 * @author student
 */
public class Pusher extends Thread implements Runnable{

    private MyStack stack;
    private int num;
    private int id;

    public Pusher(int id, MyStack S){
        this.stack = S;
        this.id = id;
    }
    public void run(){

        for(int i = 0; i<10; i++){
            stack.push(i);
            System.out.println("\n"+id + " Pushing:  " + i + "..." );
        }
   }

}
