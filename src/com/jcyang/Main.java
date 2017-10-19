package com.jcyang;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
Resume resume = new Resume();
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter first name: ");
        Name name = resume.getName();
        name.setFirstName(scanner.nextLine());
        System.out.println("Enter middle initial: ");
       name.setMiddleInitial(scanner.nextLine());
        System.out.println("Enter last name: ");
       name.setLastName(scanner.nextLine());
        System.out.println("Enter email: ");
        name.setEmail(scanner.nextLine());

    }
}
