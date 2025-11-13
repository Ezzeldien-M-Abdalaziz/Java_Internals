package CollectionFramework.Set;

import CollectionFramework.Room;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Application {

    public static void main(String[] args) {


        Room piccadily = new Room ("Piccadily" , "guest room" , 3 , 125);
        Room oxford = new Room ("oxford" , "suite" , 3 , 125);
        Room oxfordDuplicate = new Room ("oxford" , "suite" , 3 , 125);
        Room victoria = new Room ("victoria" , "guest room" , 3 , 125);

        Set<Room> rooms = new HashSet<>();
        rooms.add(piccadily);
        rooms.add(oxford);
        rooms.add(oxford);   //wouldnt be printed because hashset dont allow duplicates
        rooms.add(oxfordDuplicate);  //will be printed because diff object lthough the same data , can override equals in the room class to determine the uniqness

        rooms.stream()
                .map(r-> r.getName())
                .forEach(System.out::println);

        //set.of
    //Set.of -> It is not explicitly HashSet, LinkedHashSet, or TreeSet — it returns a private, implementation-specific, unmodifiable Set.
        Set<Room> rooms2 = Set.of(piccadily, oxford, oxfordDuplicate);
    // rooms2.add(victoria);    //cant do this

        //copy.of
        Set<Room> rooms3 = Set.copyOf(rooms);
        rooms3.stream()
                .map(r-> r.getName())
                .forEach(System.out::println);



    }
}
