import java.util.*;

public class InputCollecter {

    public static String mandatryUserInput (String prompt){
        while(true){
            System.out.println(prompt);
            Scanner in = new Scanner(System.in);
            String input = in.nextLine();
            if(input.isEmpty()){
                System.out.println("You must enter this field.");
                continue;
            }
            if(input.matches("[0-9a-zA-Z\\-\\s]+")){
                return input;
            }else{
                System.out.println("You must enter alphanumeric characters");
                continue;
            }
        }
    }

    public static String getUserInput (String prompt) {
        while (true){
                System.out.println(prompt);
                Scanner in = new Scanner(System.in);
                String input = in.nextLine();
                if(input.matches("[0-9a-zA-Z\\-\\s]+")){
                return input;
                }
                if(input.isEmpty()){
                    return input;

                }else{
                    System.out.println("You must enter alphanumeric characters");
                    continue;
            }
        }
    }
}

