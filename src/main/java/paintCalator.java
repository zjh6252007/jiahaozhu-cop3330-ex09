/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 jiahao zhu
 */
public class paintCalator {
    public static void main(String[] args) {
        final int coverNumber = 350;
        int squareFeet = 800; // change the square feet here
        double paintGallons = (double)squareFeet/coverNumber;
        System.out.println("You will need to purchase " + Math.ceil(paintGallons) + " gallons of paint to cover " + squareFeet +" square feet.");
    }
}
