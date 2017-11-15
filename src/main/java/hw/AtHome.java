package hw;

import java.utils.*;

public class AtHome {

  public PriorityQueue<Map.entry<String,Integer>> fillQueue(PriorityQueue<Map.entry<String,Integer>> storage) {
    final String quit = "exit";
    Scanner input = new Scanner(System.in());
    while(!input.nextLine().equalsIgnoreCase(quit))
    {
      System.out.println("Would you like to add a new item? (yes/no)");
      if(input.nextLine().equalsIgnoreCase("yes")){
        storage = addTo(storage);
      }
      else if(input.nextLine().equalsIgnoreCasr("no")){
        System.out.println("Enter exit to quit the addition part of the program");
      }
      //put this here to avoid infinite loop may not be nessecary
      input.nextLine();
      //returns the updated queue
      return storage;
    }

    //IF ADD
    //TODO  DONE create a prioritized queue that will act as the main data structure
    //TODO create a hashmap that can hold the value of each items
    //TODO  DONE when adding items to the prioritized queue ask for the priority and add to the queue then ask the price and add the value to the hashmap
    //TODO DONE ask user if they have a next item to add
    //TODO DONE ask user if they want to add or remove products to the list

  }

  public PriorityQueue<Map.entry<String,Integer>> addTo(PriorityQueue<Map.entry<String,Integer>> storage){
    //takes in and stores the name of the product in a variable
    System.out.print("Enter the name of the product you need to purchase: ");
    String product = input.nextLine();
    //takes in and stores the value of the priority in a variable
    System.out.println("Enter the priority that you need this product 1 (most important) 10 (least important)");
    Integer priority = input.nextInt();
    //makes a map.entry type object without that whole class, and then adds it to the queue
    storage.add(new AbstractMap.SimpleEntry<String, Integer>(product,priority));
    //returns the updated queue
    return storage;
  }
}
