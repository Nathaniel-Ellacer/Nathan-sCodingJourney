import java.io.*;

public class ContactBook {
    private final String fileName = "contacts.txt";

    public void addContact(Contact contact) {
        // Appends to contacts.txt in "name,phone,email" format
        try (FileWriter fw = new FileWriter(fileName, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            
            out.println(contact.getName() + "," + contact.getPhone() + "," + contact.getEmail());
            System.out.println("Contact added successfully!");
            
        } catch (FileNotFoundException e) {
            System.out.println("Error: The file could not be found.");
        } catch (IOException e) {
            System.out.println("Error: An I/O error occurred while writing.");
        }
    }

    public void displayAllContacts() {
        // Reads and displays all contacts from the file
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("\n--- All Contacts ---");
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 3) {
                    System.out.println("Name: " + data[0] + ", Phone: " + data[1] + ", Email: " + data[2]);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: No existing contacts file found.");
        } catch (IOException e) {
            System.out.println("Error: An I/O error occurred while reading.");
        }
    }

    public Contact searchContact(String name) {
        // Searches by name and returns a Contact object or null
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 3 && data[0].equalsIgnoreCase(name)) {
                    return new Contact(data[0], data[1], data[2]);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (IOException e) {
            System.out.println("Error: An I/O error occurred during search.");
        }
        return null;
    }
}