package ExpressionStacks;
import java.util.LinkedList;

// Stack implementation using LinkedList
class Stack<E> {
    private LinkedList<E> elements;

    public Stack() {
        elements = new LinkedList<>();
    }

    public void push(E element) {
        elements.addLast(element);
    }

    public E pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return elements.removeLast();
    }

    public E peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return elements.getLast();
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }
}