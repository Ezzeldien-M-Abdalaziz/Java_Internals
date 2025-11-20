package CollectionFramework.Map;

import CollectionFramework.List.Guest;
import CollectionFramework.Room;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Application {

    public static void main(String[] args) {

        Room Piccadilly = new Room("Piccadilly" , "Guest Room" , 3 , 125);
        Room oxford = new Room("Oxford" , "suite" , 5 , 200);

        Guest guest = new Guest("john" , "Guest" , false);
        Guest guest2 = new Guest("maria" , "Guest" , true);

        Map<Room , Guest> assignments = new HashMap<>();

        assignments.put(Piccadilly, guest);
        assignments.put(oxford, guest2);

        System.out.println("Assignment for Piccadilly: " + assignments.get(Piccadilly));
        System.out.println("Assignment for Oxford: " + assignments.get(new Room("Oxford" , "suite" , 5 , 200)));  //won't work because hashMap uses equals()
        System.out.println("Assignment for Oxford: " + assignments.get(oxford));


        //iterating
//        Set<Map.Entry<Room , Guest>> cv = assignments.entrySet();

        for (Map.Entry<Room , Guest> entry : assignments.entrySet()) {   //entrySet is A collection , so we can use stream with instead of for loop
            Room r = entry.getKey();
            Guest g = entry.getValue();
            System.out.println("Room: " + r.getName() + " Guest: " + g);
        }


    }
}
