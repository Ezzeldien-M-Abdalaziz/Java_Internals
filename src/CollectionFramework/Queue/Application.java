package CollectionFramework.Queue;

import CollectionFramework.List.Guest;

import java.util.*;

public class Application {

    public static void main(String[] args) {

        Guest john = new Guest("john" , "Doe" , false);
        Guest bob = new Guest("bob" , "Doe" , false);
        Guest sonia = new Guest("sonia" , "Doe" , true);
        Guest siri = new Guest("siri" , "Doe" , true);



        //safe methods
        Queue<Guest> checkInQueue = new ArrayDeque<>();
        checkInQueue.offer(john);
        checkInQueue.offer(bob);  // false if full -> safer
        print(checkInQueue);

        Guest guest = checkInQueue.poll();  //see the head element and pop it
        print(checkInQueue);
        System.out.println(guest);

        Guest guest2 = checkInQueue.peek();   //only see the head element
        print(checkInQueue);
        System.out.println(guest2);


        //same methods but not safe "throws exceptions if something wrong"
        checkInQueue.add(sonia);  //throws exception if full
        print(checkInQueue);

        Guest guest3 = checkInQueue.remove();  //see the head element and pop it
        print(checkInQueue);
        System.out.println(guest3);

        Guest guest4 = checkInQueue.element();  //only see the head element
        print(checkInQueue);
        System.out.println(guest4);


    }



    public static void print (Queue<Guest> Queue) {
        System.out.format("%n--List Contents--%n");

        int x = 0;
        for (Guest guest : Queue) {
            System.out.format("%x : %s %s %n", x++, guest.toString() , x ==1 ? "(Head)" : "");
        }
    }


}
