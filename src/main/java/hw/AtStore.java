package hw;

import java.util.*;

public class AtStore {

  public Map<String, Double> prices = new HashMap<String, Double>();

  public void remove(PriorityQueue<Map.Entry<String, Integer>> Q) {
    final String done = "done";
    double cost = 0;
    Scanner scanner = new Scanner(System.in);

    while (!scanner.nextLine().equalsIgnoreCase(done)) {

      System.out.println("Would you liked to remove the next item ?");
      System.out.println("Yes/No");
      String input = scanner.nextLine();
      if (input.equalsIgnoreCase("yes")) {
        if (Q.peek() != null) {
          Map.Entry<String, Integer> temp = Q.poll();
          String item = temp.getKey();
          System.out.println("what is the price of " + item + " ?");
          double price = scanner.nextDouble();
          prices.put(item, price);
          cost = calculateTotal();
          System.out.println(cost);
        } else {
          System.out.println("The list is already empty");
          System.out.println("Your trip is finsihed");
          System.out.println("The total is " + cost);
          printReceipt();
        }
      } else if (input.equalsIgnoreCase("no")) {
        System.out.println("Your trip is finsihed");
        cost = calculateTotal();
        Q.clear();
        System.out.println("The total is " + cost);

        printReceipt();
      } else if (input.equalsIgnoreCase("quit")) {
        break;
      }
    }
  }

  public double calculateTotal() {
    Iterator<Map.Entry<String, Double>> iter = prices.entrySet().iterator();
    double total = 0;
    while (iter.hasNext()) {
      final Map.Entry<String, Double> entry = iter.next();
      total = total + entry.getValue();
    }
    return total;
  }

  public void printReceipt() {
    System.out.println("Here is a receipt for your trip:");
    for (String n : prices.keySet()) {
      String item = n.toString();
      Double price = prices.get(n);
      System.out.println(item + "   " + price);
    }
  }
  // TOdo ask if user is ready to start trip
  // TODO prompt user what item they picked up then ask for the price
  // TODO place both the item as the
  // TODO iterte through the map and total the shopping trip
  // TODO receipt print method
}
