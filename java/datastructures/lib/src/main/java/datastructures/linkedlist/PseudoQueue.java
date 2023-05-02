package datastructures.linkedlist;

import java.util.EmptyStackException;

public class PseudoQueue {
  Stack<Integer> stack1 = new Stack<>();
  Stack<Integer> stack2 = new Stack<>();


  public void enqueue(int x) {
    stack1.push(x);
  }

  public Integer dequeue(){
      while(!stack1.isEmpty()){
        int x = stack1.pop();
        stack2.push(x);
      }
      int dequeuedInt = stack2.pop();
      while(!stack2.isEmpty()){
        int x = stack2.pop();
        stack1.push(x);
      }
      return dequeuedInt;
    }
}
