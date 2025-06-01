package org.javaproject;

import java.util.Scanner;

public class SistemaLogin {
    public static void Login() {
        Scanner scanner = new Scanner(System.in);
        String user;
        int password;

        System.out.println("User:");
        user = scanner.nextLine();

        System.out.println("Password:");
        password = scanner.nextInt();

        if (user.equals("admin") && password == 1234) {
            System.out.println("Sucess. Login sucessful!");
        } else {
            System.out.println("Error. User or password incorrect, try again!");
        }
    }

    public static void main(String[] args) {
        System.out.println("=====================================");
        System.out.println("Login screen");
        Login();
        System.out.println("=====================================");
    }
}
