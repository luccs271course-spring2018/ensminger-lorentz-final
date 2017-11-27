package hw;

import java.util.*;

public class AtHome {

  public PriorityQueue<Map.Entry<String, Integer>> fillQueue(
      PriorityQueue<Map.Entry<String, Integer>> storage) {
    final String quit = "exit";

    Scanner input = new Scanner(System.in);

    /* while (input.hasNext()) {

      System.out.println("Would you like to add a new item? (yes/no)");
      if (input.nextLine().equalsIgnoreCase("yes")) {
        storage = addTo(storage);
      } else if (input.nextLine().equalsIgnoreCase("no")) {
        System.out.println("Enter exit to quit the addition part of the program");
      }

    }*/
    boolean done = false;
    System.out.println("Would you like to add a new item? (yes/no)");
    while (!done) {
      System.out.println("Another one? (yes/no)");
      if (input.nextLine().equalsIgnoreCase("yes")) {
        storage = addTo(storage);

      } else if (input.nextLine().equalsIgnoreCase("no")) {
        System.out.println("Enter exit to quit the addition part of the program");
        done = true;
      }

      System.out.println("hi");
      input.nextLine();
    }
    return storage;
    // IF ADD
    // TODO  DONE create a prioritized queue that will act as the main data structure
    // TODO create a hashmap that can hold the value of each items
    // TODO  DONE when adding items to the prioritized queue ask for the priority and add to the
    // queue then ask the price and add the value to the hashmap
    // TODO DONE ask user if they have a next item to add
    // TODO DONE ask user if they want to add or remove products to the list

  }

  public PriorityQueue<Map.Entry<String, Integer>> addTo(
      PriorityQueue<Map.Entry<String, Integer>> storage) {
    Scanner input = new Scanner(System.in);
    // takes in and stores the name of the product in a variable
    System.out.print("Enter the name of the product you need to purchase: ");
    String product = input.nextLine();
    // takes in and stores the value of the priority in a variable
    System.out.println(
        "Enter the priority that you need this product 1 (most important) 10 (least important)");
    Integer priority = input.nextInt();
    // makes a map.entry type object without that whole class, and then adds it to the queue
    storage.add(new AbstractMap.SimpleEntry<String, Integer>(product, priority));
    // returns the updated queue
    return storage;
  }
}
