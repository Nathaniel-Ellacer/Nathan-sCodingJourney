package Algorithm;
import java.util.LinkedList;

public class MyLinkedList {
    public static void main(String[] args) {
        LinkedList<String> resonator = new LinkedList<>();

        resonator.add("Rover");
        resonator.add("Carlotta");
        resonator.add("Mortefi");
        resonator.add("Baizhi");
        resonator.add("Jinhsi");
        resonator.add("Changli");
        resonator.add("Yinlin");

        System.out.println("Resonators owned: " + resonator);
    }
}