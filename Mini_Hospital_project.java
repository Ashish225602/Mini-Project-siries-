import java.util.*;

class Dcoder {
    static Scanner sc = new Scanner(System.in);  // Made static
    static int patientCounter = 1000; // Starting patient number
    
    public static void main(String args[]) {
        MainMenu();
        Actions();
    }

    public static void MainMenu() {
        System.out.println("1) New Case (if you are a new patient).\n2) Old Case\n3) Emergency");
    }

    public static void Actions() {
        System.out.println("Enter your choice:");
        int choice = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        switch (choice) {
            case 1:
                NewCaseFunction();
                break;
            case 2:
                OldCaseFunction();
                break;
            case 3:
                EmergencyFunction();
                break;
            default:
                System.out.println("Enter the right choice.");
        }
    }

    public static void NewCaseFunction() {
        patientCounter++; // Increment the patient number
        int patientNumber = patientCounter;
        
        System.out.println("Register yourself / patient");
        System.out.println("Enter the name of patient:");
        String name = sc.nextLine();

        System.out.println("Enter the age:");
        int age = sc.nextInt();

        System.out.println("Enter the mobile number:");
        long number = sc.nextLong();
        sc.nextLine(); // consume leftover newline

        System.out.println("Enter the problem or symptoms:");
        String patientIssue = sc.nextLine();

        System.out.println("Patient registration complete.\n Your Case number is "+ patientNumber+ "\n Please meet the doctor.");
    }
    
    public static void OldCaseFunction(){
      System.out.println("Enter the petient case number ");
      long petientNumber = sc.nextInt();
      
      
    }
    
    public static void EmergencyFunction(){
      System.out.println("Welcome \n This Service for Emergency only");
    }
}