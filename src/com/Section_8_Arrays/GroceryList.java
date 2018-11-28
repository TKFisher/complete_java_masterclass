package com.Section_8_Arrays;


import java.util.ArrayList;

public class GroceryList
{

    /**
     * // How to create a primitive integer array and pass values to it:
     * private int[] myNumbers = new int[50];
     * myNumbers[5] = 4;
     */

    // There is no need to specify an array number like in the regular array above.
    // The ArrayList class handles this for us.
    private static ArrayList<String> groceryList = new ArrayList<String>();

    public static void main(String[] args)
    {
        addGroceryItem("milk");
        printGroceryList();
    }


    // extra 1:  creates an array of the array, grocerylist, above.
    public ArrayList<String> getGroceryList()
    {
        return groceryList;
    }

    public static void addGroceryItem(String item)
    {
        // we can pass values to the ArrayList this way:
        groceryList.add(item);
    }

    public static void printGroceryList()
    {
        System.out.println("You have " + groceryList.size() + " items in your grocery list.");
        for (int i = 0; i < groceryList.size(); i++)
        {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    // (1)
    // "position" is the element/position we want to modify with the "newItem".
    private void modifyGroceryItem(int position,String newItem)
    {
        groceryList.set(position,newItem);
        System.out.println("Grocery Item " + (position + 1) + " has been modified");
    }

    // (2)
    public void modifyGroceryItem(String currentItem,String newItem)
    {
        int position = findItem_2(currentItem);
        if (position >= 0)
        {
            modifyGroceryItem(position,newItem);
        }
    }

    // (1)
    private void removeGroceryItem(int position)
    {
        // first we will retrieve the item to be removed:

        //...no longer need:  String theItem = groceryList.get(position);
        groceryList.remove(position);

        // So by getting the index position and storing the position as a string we can then
        // call the position to be removed.
        // Milk = position 0
        // Cheese = position 1
        // Bread = position 2
    }

    // (2)
    public void removeGroceryItem(String item)
    {
        int position = findItem_2(item);
        if (position >= 0)
        {
            removeGroceryItem(position);
        }
    }

    // (1)
    public String findItem_1(String searchItem)
    {
        boolean exists = groceryList.contains(searchItem);
        if (exists)
        {
            int position = groceryList.indexOf(searchItem);
            return groceryList.get(position);
        }
        return null;
    }

    // (2)
    private int findItem_2(String searchItem)
    {
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem)
    {
        int position = findItem_2(searchItem);
        if (position >= 0)
        {
            return true;
        }
        return false;

    }


}
