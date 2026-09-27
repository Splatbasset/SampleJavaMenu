import java.util.Scanner;

public class SampleMenu {
    
    public static void main(String[] args) throws Exception {
        //Variable to hold the input
        int input = 99;

        //Setup a scanner for user input
        Scanner sc = new Scanner(System.in);

        while(input != 0){
            //Call Print Menu
             printMenu();

            //Get user input
            try{
                input = sc.nextInt();
                }   
            catch(Exception e){
                //Catch when the user doesn't enter a int
                System.out.println("Please enter a number");
                sc.next();//reset the scanner
            }    
            //process the user input
            processInput(input);
        }

        //Close Scanner to free resources
        sc.close();
    }

    private static void printMenu(){
        //Print menu to screen 
        //add rows as need but only use numbers for options
        System.out.println("Welcome to a Sample Menu System");
        System.out.println("--------------------------------");
        System.out.println("Press 1 for Option 1");
        System.out.println("Press 2 for Option 2");
        System.out.println("Press 3 for Option 3");
        System.out.println("Press 0 to Exit");
    }
    

    private static void processInput(int in){
        switch (in) {
            case 1:
                System.out.println("Option one");//remove and call the processing method
                break;
            case 2:
                 System.out.println("Option two");//remove and call the processing method
                break;
            case 3:
                System.out.println("Option three");//remove and call the processing method
                break;
            case 0:
                System.out.println("Thank you and good bye");
                break;
            default:
                System.out.println("Invalid option");
        }
    }
}
