package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        System.out.print("What is your first name? ");
        Scanner kbInput = new Scanner(System.in);
        String fName = kbInput.next();
        System.out.print("What is your last name? ");
        kbInput = new Scanner(System.in);
        String lName = kbInput.next();
        System.out.println("Your full name is " + fName + " " + lName + ".");


    }
}
