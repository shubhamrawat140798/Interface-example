/*
A program having user interface like
4. accept first name and surname
5. display total name
6. exit
*/
import java.util.Scanner;
import java.util.Vector;

class Application {
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        Vector<Name> vector = new Vector<Name>();
        int option;
        do{
            System.out.println("Enter your Choice");
            System.out.println("Press 1 : Enter first name and last name");
            System.out.println("Press 2 : Print the number of names");
            System.out.println("Press 3 : Exit");
            option = sc.nextInt();
            if(option==1){
                System.out.println("Enter First Name");
                String firstname = sc.next();
                System.out.println("Enter Last Name");
                String surname = sc.next();
                Name name = new Name(firstname, surname);
                vector.add(name);
            } 
            if(option == 2){
                System.out.println("Total Names in Vector: "+vector.size());
               
            }
            if (option > 3 || option <1){
            	System.out.println("Wrong input");
            }
        }while (option != 3);
        System.out.println("Application Closed");
     }
}
class Name {
    String firstname, surname;
    Name(String firstname, String surname){
        this.firstname = firstname;
        this.surname = surname;
    }
}
