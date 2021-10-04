package main.java;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter the information requested below: ");

        System.out.println("Name and Surname: ");
        String name = userInput.nextLine();

        System.out.println("Age: ");
        int age = userInput.nextInt();

        System.out.println("Gender :" );
        String gender = userInput.next();
        userInput.nextLine();

        System.out.println("Education : ");
        String education = userInput.nextLine();

        System.out.println("Email : ");
        String email = userInput.next();
        userInput.nextLine();

        System.out.println("Profession : ");
        String profession = userInput.nextLine();

        System.out.println("Current Employer : ");
        String company = userInput.nextLine();

        System.out.println(userPresentation(name, age, gender, education, email, profession, company));
    }

    public static String userPresentation(String name, int age, String gender, String education,
                                          String email, String profession, String company) {
        return "Hello, my name is " + name + " I'm " + age + " years old" + " my gender is " + gender +
                " I'm graduated in " + education + " my email address is " + email + " my profession is " + profession +
                ". I'm currently employed at: " + company + " .";
    }
}
