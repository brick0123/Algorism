package code.stack;

import java.util.Stack;

public class MinStack {

    final Stack<Integer> min = new Stack<>();
    final Stack<Integer> stack = new Stack<>();

    public MinStack() {

    }

    public void push(int val) {
        if (min.isEmpty() || val <= min.peek()) {
            min.push(val);
        }
        stack.push(val);
    }

    public void pop() {
        int val = stack.pop();
        if (val == min.peek()) {
            min.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
