package SINGLYLINKEDLIST;

public class SLinkedList {

    protected Node head;
    protected Node tail;
    protected long size;

    public SLinkedList()
    {
        head = null;
        tail = null;
        size = 0;
    }

    public void addFirst(String element)
    {
        Node newNode = new Node(element, head);
        head= newNode;

        if(size== 0)
        {
            tail = head;
        }
        size++;

    }

    public void addLast(String element)
    {
        Node newNode = new Node(element, null);

        if (size == 0)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }

    public String removeFirst()
    {
        if (head == null) return null;

        Node t = head;
        head = head.getNext();

        t.setNext(null);
        size--;

        if (size == 0)
        {
            tail = null;
        }
        return t.getElement();
    }

    public void display()
    {
        Node current = head;

        while (current != null)
        {
            System.out.print(current.getElement() + " --->");
            current = current.getNext();
        }
        System.out.println("null");
    }
    public long getSize()
    {
        return size;
    }
}
