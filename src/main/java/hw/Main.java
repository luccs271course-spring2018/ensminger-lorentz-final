package hw;

import java.util.*;
import java.util.PriorityQueue;

public class Main {

  public static void main(final String[] args) {
    // Creates a priority queue that is typed string and integer
    PriorityQueue<Map.Entry<String, Integer>> storage =
        new PriorityQueue<>(1, new DescendingByPriority());
    PriorityQueue<Map.Entry<String, Integer>> filledStorage =
        new PriorityQueue<>(1, new DescendingByPriority());
    AtStore Store = new AtStore();
    AtHome Home = new AtHome();
    // TODO ask the user if they want to add or remove products to the list (Home or store)
    filledStorage = Home.fillQueue(storage);
    System.out.println("john was here");
    while (filledStorage.peek() != null) {
      Store.remove(filledStorage);
    }
    Store.printReceipt();
    // TODO add an option to run without a price field

    // IF ADD
    // TODO create a prioritized queue that will act as the main data structure

    // TODO create a hashmap that can hold the value of each items
    // TODO when adding items to the prioritized queue ask for the priority and add to the queue
    // then ask the price and add the value to the hashmap
    // TODO ask user if they have a next item to add

    // TODO ask user if they want to add or remove products to the list
    // IF REMOVE
    // TODO state how many objects are in the Queue
    // TODO peek(?) the first object and get the price from the hashmap
    // TODO ask the user if they want to purchase this item at this price this trip
    // IF YES
    // TODO add the price from the hashmap to the total for this trip
    // TODO remove the item from the queue (should be done with the poll method)
    // TODO peek (?) the next item and repeat from line 19
    // IF NO
    // TODO leave item in the queue and move onto the next item? (would break abstraction)

    // TODO ask user if they have all the items they need (IF items still in list)
    // TODO print you are buing XX items for YY dollars

    // TODO loop back to line 8

  }
}
