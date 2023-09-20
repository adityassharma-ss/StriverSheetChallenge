import java.util.*;

public class MaxStack {
    public static void main(String[] args) {
        MaxStack ms = new MaxStack();
        ms.push(5);
        ms.push(1);
        ms.push(5);
        System.out.println(ms.top()); // 5
        System.out.println(ms.popMax()); // 5
        System.out.println(ms.top()); // 1
        System.out.println(ms.peekMax()); // 5
        System.out.println(ms.pop()); // 1
        System.out.println(ms.top()); // 5
    }

    private Stack<Integer> stack;
    private Stack<Integer> maxStack;

    public MaxStack() {
        stack = new Stack<>();
        maxStack = new Stack<>();
    }

    public void push(int x) {
        int max = maxStack.isEmpty() ? x : maxStack.peek();
        maxStack.push(max > x ? max : x);
        stack.push(x);
    }

    public int pop() {
        maxStack.pop();
        return stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int peekMax() {
        return maxStack.peek();
    }

    public int popMax() {
        int max = peekMax();
        Stack<Integer> buffer = new Stack<>();
        while (top() != max) {
            buffer.push(pop());
        }
        pop();
        while (!buffer.isEmpty()) {
            push(buffer.pop());
        }
        return max;
    }
}
