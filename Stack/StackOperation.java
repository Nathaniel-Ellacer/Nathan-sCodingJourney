package Stack;

import java.util.Scanner;

public class StackOperation {
    private int[] stack;
    private int top;
    private int capacity;

    public StackOperation(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1; 
    }

    public void push(int value) {
        if (top >= capacity - 1) {
            System.out.println("Stack Overflow");
        } else {
            stack[++top] = value;
            System.out.println("Stack after push: " + displayStack());
        }
    }

    public void pop() {
        if (top < 0) {
            System.out.println("Stack is empty");
        } else {
            int poppedValue = stack[top--];
            System.out.println("Popped value: " + poppedValue);
            System.out.println("Stack after pop: " + displayStack());
        }
    }

    public void top() {
        if (top < 0) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top value: " + stack[top]);
        }
    }

    public void size() {
        System.out.println("Size of stack: " + (top + 1));
    }

    public void empty() {
        System.out.println("Is stack empty? " + (top < 0));
    }

    public String displayStack() {
        if (top < 0) {
            return "Stack is empty";
        }
        String result = ""; 
        for (int i = 0; i <= top; i++) {
            result += stack[i] + " "; 
        }
        return result.trim(); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many elements can the stack handle? ");
        int capacity = scanner.nextInt();
        StackOperation stack = new StackOperation (capacity); 

        while (true) {
            System.out.println("\nMENU");
            System.out.println("1. PUSH");
            System.out.println("2. POP");
            System.out.println("3. TOP");
            System.out.println("4. SIZE");
            System.out.println("5. EMPTY");
            System.out.println("6. DISPLAY STACK");
            System.out.println("7. EXIT");

            System.out.print("Enter option [1..7]: ");
            int menuOption = scanner.nextInt();

            switch (menuOption) {
                case 1:
                    System.out.print("Enter an integer to push: ");
                    int value = scanner.nextInt();
                    System.out.println("");
                    stack.push(value);
                    break;

                case 2:
                System.out.println("");
                    stack.pop();
                    break;

                case 3:
                System.out.println("");
                    stack.top();
                    break;

                case 4:
                System.out.println("");
                    stack.size();
                    break;

                case 5:
                System.out.println("");
                    stack.empty();
                    break;

                case 6:
                    System.out.println("Stack contents: " + stack.displayStack());
                    break;

                case 7:
                    System.out.println("Terminating the program - Ellacer, Nathaniel Ashley E.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}