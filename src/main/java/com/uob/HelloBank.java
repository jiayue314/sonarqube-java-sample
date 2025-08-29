package com.uob;

public class HelloBank {
    public static void main(String[] args) {
        String username = null;
        int length = username.length();
        System.out.println("Welcome to UOB!");
        System.out.println("Welcome to UOBx!");
        
        String password = "Password";
        
        if (authenticate(password)) {
            System.out.println("User authenticated successfully.");
        } else {
            System.out.println("Authentication failed.");
        }
    }

    private static boolean authenticate(String password) {
        return "Password".equals(password);
    }
}
