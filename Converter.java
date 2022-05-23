package com.company;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input the sequence of your springs in a binary form with 8 bits");
        String newString = scanner.nextLine();
        if (newString.length() > 8){
            System.out.println("you have inputted a wrong number");
        }
        int number = Integer.parseInt(newString, 2);
        System.out.println("The total value of your springs is " + number);

    }

}
