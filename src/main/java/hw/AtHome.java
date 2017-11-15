package hw;

import java.utils.*;

public class AtHome {

  public Object[] fillQueue(PriorityQueue<Map.entry<String,Integer>> storage, HashMap<String, Integer> price) {
    final String quit = "exit";
    //bad bad hack
    Object[] holding = new Object[2];
    Scanner input = new Scanner(System.in());
    while(!input.nextLine().equalsIgnoreCase(quit))
    {
      System.out.println("Would you like to add a new item? (yes/no)");
      if(input.nextLine().equalsIgnoreCase("yes")){
        holding = addTo(storage, price);
      }
      else if(input.nextLine().equalsIgnoreCasr("no")){
        System.out.println("Enter exit to quit the addition part of the program");
      }
      //put this here to avoid infinite loop may not be nessecary
      input.nextLine();


      //Don't think I need lines 24-29 because I am just passing an array back up the levels
      /*
      holding[0] = storage;
      holding[1] = price;
      */
      //returns the updated queue

      return holding;
    }

    //IF ADD
    //TODO  DONE create a prioritized queue that will act as the main data structure
    //TODO  DONE create a hashmap that can hold the value of each items
    //TODO  DONE when adding items to the prioritized queue ask for the priority and add to the queue then ask the price and add the value to the hashmap
    //TODO DONE ask user if they have a next item to add
    //TODO DONE ask user if they want to add or remove products to the list

  }

  public Object[] addTo(PriorityQueue<Map.entry<String,Integer>> storage){
    //takes in and stores the name of the product in a variable
    Object[] modify = new Object[2];
    System.out.print("Enter the name of the product you need to purchase: ");
    String product = input.nextLine();
    //takes in and stores the value of the priority in a variable
    System.out.print("Enter the priority that you need this product 1 (most important) 10 (least important)");
    Integer priority = input.nextInt();
    System.out.print("Enter the price of this item: ");
    Integer value = input.nextInt();
    //makes a map.entry type object without that whole class, and then adds it to the queue
    storage.add(new AbstractMap.SimpleEntry<String, Integer>(product, priority));
    price.put(product, value);
    modify[0] = storage;
    modify[1] = price;
    //TODO decide if the Object[] is passed in and parseed each time or if it can be returned somehow else
    //returns the updated queue
    return modify;
  }

}
