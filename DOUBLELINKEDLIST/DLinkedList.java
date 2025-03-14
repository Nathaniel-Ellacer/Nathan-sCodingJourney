package DOUBLELINKEDLIST;

public class DLinkedList {
    private DNode head; 
    private DNode tail; 

    public DLinkedList() {
        head = null;
        tail = null;
    }

    
    public void add(String carName) {
        DNode newNode = new DNode(carName, tail, null);

        if (tail != null) 
        {
            tail.setNext(newNode);
        } 
        else 
        {
            head = newNode; 
        }
        tail = newNode;
    }
    public void display() 
    {
        DNode current = head;

        while (current != null) 
        {
            System.out.println("Race Car: " + current.getElement());
            current = current.getNext();
        }
    }
}