import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String name, nationality, contact, age;
//        int age ;
        User user = new User();

        Scanner input = new Scanner(System.in);
        System.out.print("Input userName: ");
         name = input.next();
         user.setName(name);

        System.out.print("Input your age: ");
        //age = Integer.parseInt(input.next());
        age = input.next();
        user.setAge(age);

        System.out.print("Input your nationality: ");
        nationality = input.next();
        user.setNationality(nationality);

        System.out.print("Input your contact: ");
        contact = input.next();
        user.setContact(contact);

        user.result();


    }
}
