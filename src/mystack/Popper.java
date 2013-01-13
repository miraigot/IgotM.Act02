/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mystack;

public class Popper extends Thread implements Runnable{

    MyStack stack;
    int top;
    int id;

    public Popper(int id, MyStack S){
        this.stack = S;
        this.id = id;
    }
    public void run(){
        while(stack.getTop()>=0)
            stack.pop();
            System.out.println("\n "+id + "Popping... " + (stack.getTop() + 1));

    }


}
