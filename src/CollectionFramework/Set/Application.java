package CollectionFramework.Set;

import CollectionFramework.Room;

import java.util.*;

public class Application {

    public static void main(String[] args) {

                                /* HashSet */
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


                                            /* TreeSet */


        List<Integer> numbers = Arrays.asList(100,500,200,400 , 300 , 150);
        NavigableSet<Integer> numberTree = new TreeSet<>(numbers);

        System.out.println("in asending order by default");
        numberTree.stream()
                .forEach(System.out::println);

        System.out.println("in asending order by descending");
        numberTree.descendingSet()
                .stream()
                .forEach(System.out::println);

        System.out.println("in asending order and lower than 400");
        numberTree.headSet(400)
                .stream()
                .forEach(System.out::println);

        System.out.println("in asending order and bigger or equal to 400");
        numberTree.tailSet(400)
                .stream()
                .forEach(System.out::println);

        System.out.println("in asending order between 150 and 500");
        numberTree.subSet(150 , 500)
                .stream()
                .forEach(System.out::println);
        System.out.println("-------------------");

        System.out.println( "number just lower than 300 -> " +  numberTree.lower(300));
        System.out.println("number just higher than 300 -> " +numberTree.higher(300));



    }
}
