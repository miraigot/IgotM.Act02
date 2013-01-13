/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mystack;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author student
 */
public class MyStack {
private List<Integer> stack;
private static int top;

public MyStack(int intSize){

            stack = new ArrayList<Integer>(intSize);
            top = -1;
}
    public static void main(String[] args) {

            MyStack s = new MyStack(20);
            List<Thread> threads = new ArrayList<Thread>();

            for(int i =0; i<=1; i++){
                Runnable push = new Pusher(i, s);
                Thread worker = new Thread(push);

                worker.setName(String.valueOf(i));
                worker.start();
                threads.add(worker);
            }
            
            Runnable pop = new Popper(0, s);
            Thread worker = new Thread(pop);
            worker.setName(String.valueOf(0));
            worker.start();
            threads.add(worker);
             
    }
    public int getTop(){
        return top;
    }

    public synchronized void pop(){
        if(!stack.isEmpty())
            stack.remove(top--);
    }
    
    public synchronized void push(int num){
        if(top<stack.size()){
            stack.add(num);
            top ++;
        }
    }

}
