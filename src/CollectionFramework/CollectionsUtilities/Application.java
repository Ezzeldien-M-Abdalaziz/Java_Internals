package CollectionFramework.CollectionsUtilities;

import CollectionFramework.Room;

import java.util.*;

public class Application {

    public static void main(String[] args) {


        Room piccadily = new Room("Piccadily", "guest room", 3, 164);
        Room oxford = new Room("oxford", "suite", 3, 120);
        Room victoria = new Room("victoria", "guest room", 3, 125);
        Room chanzilizah = new Room("chanzilizah", "guest room", 3, 125);


        List<Room> rooms = new ArrayList<>(List.of(piccadily, oxford, victoria , chanzilizah));

//        rooms.sort(Comparator.naturalOrder());    //Collections.sort works because the room class implements the Comparable interface

        //custome comparator
//          rooms.sort(Room.PRICE_COMPARATOR);

          //in reverse
//        rooms.sort(Room.PRICE_COMPARATOR.reversed());

        //algorithms also
        int result = Collections.binarySearch(rooms,oxford,Room.PRICE_COMPARATOR);
        System.out.printf("The best room price is %d \n", result);

        System.out.println("min " + Collections.min(rooms, Room.PRICE_COMPARATOR).getName());
        System.out.println("max " + Collections.max(rooms, Room.PRICE_COMPARATOR).getName());




        rooms.stream().forEach(r -> System.out.format("%-15s %15s %10f %4s %n", r.getName() , r.getType() , r.getRate() , r.getPrice()));

    }

}
