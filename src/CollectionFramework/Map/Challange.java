package CollectionFramework.Map;

import CollectionFramework.List.Guest;
import CollectionFramework.Room;

import java.util.HashMap;
import java.util.Map;

public class Challange {

    private Map<Room, Guest> bookings = new HashMap<>();

    public boolean book(Room room, Guest guest) {
       return  bookings.putIfAbsent(room, guest) == null;
    }

    public double totalRevenue() {
       return bookings.keySet().stream().mapToDouble(Room::getPrice).sum(); //For each Room instance in the stream, call getPrice()
    }
}

