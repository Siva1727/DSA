import java.util.LinkedList;
import java.util.Queue;


class StackUsingQueue {
   Queue<Integer> qu = new LinkedList<>();

    public void push(int x) {
        qu.add(x);
        int size = qu.size();
        for (int i = 0; i < size - 1; i++) {
            qu.add(qu.remove()); // Move front element to the back
        }
    }

    public int pop() {
        if (qu.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return qu.remove();
    }

    public int peek() {
        if (qu.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return qu.peek();
    }

    public boolean isEmpty() {
        return qu.isEmpty();
    }
}

public class stack_using_queue{
    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek()); // Should print 30
        System.out.println("Popped element: " + stack.pop()); // Should print 30
        System.out.println("Top element after pop: " + stack.peek()); // Should print 20
        System.out.println("Stack is empty? " + stack.isEmpty()); // Should print false
    }
}
