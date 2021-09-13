
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Rachel Cameron
 */

import java.util.Scanner;

public class exercise08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many people?");
        int people = input.nextInt();
        System.out.println("How many pizzas do you have?");
        int pizza = input.nextInt();
        System.out.println("How many slices per pizza?");
        int slices = input.nextInt();
        int slicesamount = slices * pizza;
        int slicesperperson = slicesamount/people;
        int leftovers = slicesamount % people;
        System.out.printf("%d people with %d pizzas (%d slices)\nEach person gets %d pieces of pizza.\nThere are %d leftover pieces.", people, pizza, slicesamount, slicesperperson, leftovers);
    }
}