package DSA;

import java.util.Scanner;

class StackOperations {

    // store elements of stack
    private int[] stack;
    // represent top of stack
    private int top;
    // total capacity of the stack
    private int capacity;
    
    // constructor
    StackOperations(int size) {
        // initialize the stack variables
        stack = new int[size];
        capacity = size;
        top = -1;
    }

    // push elements to the top of stack
    public void push() {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value for push:");
        int x = sc.nextInt();
        // insert element on top of stack
        stack[++top] = x;
    }

    // pop elements from top of stack
    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return;
        }
        // pop element from top of stack
        System.out.println("The popped element is: " + stack[top--]);
    }

    // display elements of stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.println("The elements are: " + stack[i]);
        }
    }

    // check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    
}
