package SINGLYLINKEDLIST;

public class Main {
    public static void main(String[] args) {
        
        SLinkedList linkedList = new SLinkedList();

        System.out.println("Adding resonator to the list:");
        linkedList.addFirst("Rover");
        linkedList.addFirst("Phoebe");
        linkedList.addLast("Brant");
        linkedList.addLast("Roccia");

       
        linkedList.display();
        System.out.println();

        System.out.println("Removing the first resonator: "+ linkedList.removeFirst() + "\n");

        System.out.println("List after removing the first resonator:");

        linkedList.display();
        System.out.println();

        System.out.println("Current size of the list: " + linkedList.getSize()+ "\n");

        System.out.println("Removing the first resonator: " + linkedList.removeFirst()+ "\n");

        System.out.println("Final state of the list:");

        linkedList.display();
        System.out.println();
        System.out.println("Final size of the list: " + linkedList.getSize()+ "\n");
    }
}
