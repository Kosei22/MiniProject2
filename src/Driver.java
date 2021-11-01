import java.util.Objects;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContactList list = new ContactList();
        menu();
        int menuInput = sc.nextInt();

        while (true) {
            if (menuInput == 2) {
                String nameInput = InputCollecter.mandatryUserInput("Enter name:");
                String mobileInput = InputCollecter.mandatryUserInput("Enter mobile:");
                String workInput = InputCollecter.getUserInput("Enter work:");
                String homeInput = InputCollecter.getUserInput("Enter home:");
                String cityInput = InputCollecter.getUserInput("Enter city:");
                System.out.println("Successfully added a new contact!");
                list.addContact(new Contact(nameInput, mobileInput, workInput, homeInput, cityInput));
            }if (menuInput == 1) {
                list.printContacts();
            }if(menuInput == 3){
                list.printContacts();
                list.remove();
            } if(menuInput == 4){
                list.printContacts();
                list.update();
            } if (menuInput == 5) {
                System.out.println("Bye!");
                break;
            } if(menuInput > 5) {
                System.out.println("Invalid Input. Enter number between 1 and 5.");
            }
            menu();
            menuInput = sc.nextInt();
        }
    }

        public static void menu(){
        System.out.println("+===  Contact  App  ===+");
        System.out.println("| 1. List all Contacts |");
        System.out.println("| 2. Add new Contact   |");
        System.out.println("| 3. Remove Contact    |");
        System.out.println("| 4. Update Contact    |");
        System.out.println("| 5. Quit              |");
        System.out.println("+======================+");
        System.out.println("Enter your option:");
    }
}