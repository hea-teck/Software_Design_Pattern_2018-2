package hansung.designpatterns.templatemethod.barista;

import java.io.*;


public class DutchCoffeeWithHook extends CaffeineBeverageWithHook{

    public void water(){
        System.out.println("Extract coffee liquid for a long time using cold water");
    }

    public void brew() {
        System.out.println("Aging in a day or two at low temperatures");
    }

    public void addCondiments() {
        System.out.println("Adding Soy Milk");
    }

    public boolean customerWantsCondiments() {

        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        // get the user's response
        String answer = null;

        System.out.print("Would you like soy milk with your dutchcoffee (y/n)? ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.err.println("IO error trying to read your answer");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}
