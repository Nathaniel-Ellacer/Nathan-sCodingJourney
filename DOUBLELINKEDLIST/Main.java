package DOUBLELINKEDLIST;

public class Main {
    public static void main(String[] args) {
        DLinkedList raceCars = new DLinkedList();

        raceCars.add("Mercedes AMG Petronas F1 Team");
        raceCars.add("Scuderia Ferrari");
        raceCars.add("Red Bull Racing");
        raceCars.add("McLaren F1 Team");
        raceCars.add("Alpine F1 Team");

        
        System.out.println("List of Formula 1 Race Cars:");
        raceCars.display();
    }
}