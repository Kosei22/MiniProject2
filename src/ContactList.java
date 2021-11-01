
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class ContactList {

    ArrayList<Contact> contactList;

    public ContactList() {
        contactList = new ArrayList<Contact>();
    }

    public void addContact(Contact newContact) {
        contactList.add(newContact);
    }

    public void printContacts() {
        for (int i = 0; i < contactList.size(); i++)
            System.out.println(i + ". " + contactList.get(i));
    }

    public void remove() {
        while(true){
        Scanner rem = new Scanner(System.in);
        System.out.println("Enter the index of the contact to remove:");
        int del = rem.nextInt();
        if(del < contactList.size()){
            for (int i = 0; i < contactList.size(); i++) {
                if (del == i) {
                    System.out.println("Successfully removed " + contactList.get(i).getName());
                    contactList.remove(i);
                    }
                }
            break;
            }else {
            System.out.println("Invalid Input Enter number between 0 and " + (contactList.size()-1) + ".");
            }
        }
    }

        public void update () {
            while (true){
            Scanner up = new Scanner(System.in);
            System.out.println("Enter the index of the contact to update:");
            int newDate = up.nextInt();
            if(newDate < contactList.size()){
            String nameInput = InputCollecter.getUserInput("Enter name:");
            String mobileInput = InputCollecter.getUserInput("Enter mobile:");
            String workInput = InputCollecter.getUserInput("Enter work:");
            String homeInput = InputCollecter.getUserInput("Enter home:");
            String cityInput = InputCollecter.getUserInput("Enter city:");
            System.out.println("Successfully update a contact!");
            for (int i = 0; i < contactList.size(); i++) {
                if (i == newDate) {
                    contactList.remove(i);
                    contactList.add(new Contact(nameInput, mobileInput, workInput, homeInput, cityInput));
                }
                }
            break;
            }else {
                System.out.println("Invalid Input Enter number between 0 and " + (contactList.size()-1) + ".");
            }
        }
    }
}