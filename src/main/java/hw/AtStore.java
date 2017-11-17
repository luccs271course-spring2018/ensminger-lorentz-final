package hw;

import java.util.*;

public class AtStore {
private Map<String, Double> prices = new HashMap<String, Double>;


public void remove(PriorityQueue Q){
    final String done = "done";
    Scanner scanner = new Scanner(System.in);
    while(!scanner.next().equalsIgnoreCase(done))){
        System.out.println("Would you liked to remove the next item?");
        System.out.println("Yes/No");
        if(scanner.nextLine.equalsIgnoreCase("yes")){
            map.entry<String, Integer> temp = Q.poll;
            String item = temp.getKey();
            System.out.println("what is the price of this item?");
            double price = scanner.nextLine();
            prices.put(item, price);
            prices.calculateTotal();
        }
        if(scanner.nextLine().equalsIgnoreCase("no"){
            
        }
    }
}
public double calulateTotal(){
    Iterator<Entry<String, Double>> iter = prices.entrySet().iterator();
    double total = 0;
    while(iter.hasNext()){
        final Entry<String, Double> entry= iter.next();
        total = total + entry.getValue();
    }
    return total;
}
//TOdo ask if user is ready to start trip
//TODO prompt user what item they picked up then ask for the price
//TODO place both the item as the 
//TODO iterte through the map and total the shopping trip
