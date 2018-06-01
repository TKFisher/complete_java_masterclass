package com.Section_9;

import com.Section_9.GroceryList;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryListMain {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    // extra 1:  how to copy an array into a method and then display the contents of the array.
    private static void processArrayList() {
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());
        System.out.println(newArray);

        // OR:  the same as the above except we are copying the array
        //      at the time we are declaring (anotherArray) and initializing (new) the array.
        ArrayList<String> anotherArray = new ArrayList<String>(groceryList.getGroceryList());
        System.out.println(anotherArray);

        // OR:  take the contents of the array list and convert that back to a regular array.
        // step 1: initialize array to correct size.
        String[] myArray = new String[groceryList.getGroceryList().size()];
        // step 2:  return array.
        myArray = groceryList.getGroceryList().toArray(myArray);
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To get grocery list.");
        System.out.println("\t 7 - To quit the application.");
    }

    public static void addItem() {
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        //System.out.print("Enter item number: ");
        //int itemNo = scanner.nextInt();

        System.out.print("Current item name: ");
        String itemNo = scanner.nextLine();
        //scanner.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo, newItem);
    }

    public static void removeItem() {
//        System.out.print("Enter item number: ");
//        int itemNo = scanner.nextInt();
        System.out.print("Enter item name: ");
        String itemNo = scanner.nextLine();
//        scanner.nextLine();
        //note:  if you remove an item number value not in the list you will get an out of bound error.
//        groceryList.removeGroceryItem(itemNo - 1);
        groceryList.removeGroceryItem(itemNo);

    }

    public static void searchForItem() {
        System.out.print("Item to search for: ");
        String searchItem = scanner.nextLine();
        if (groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem + " in  our grocery list");
        } else {
            System.out.println(searchItem + " is not in the shopping list");
        }
    }
}



