package CollectionFramework.List;

import CollectionFramework.Room;

import java.util.ArrayList;
import java.util.List;

public class Guest {
    private String FirstName;
    private String LastName;

    private Boolean loyaltyProgramMember;

    private List<Room> preferredRooms  = new ArrayList<>();

    public Guest(String FirstName, String LastName, Boolean loyaltyProgramMember) {
        super();
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.loyaltyProgramMember = loyaltyProgramMember;

    }

    public String toString() {
        return FirstName + " " + LastName;
    }

    public void setLoyaltyProgramMember(Boolean loyaltyProgramMember) {
        this.loyaltyProgramMember = loyaltyProgramMember;
    }

    public boolean getLoyaltyProgramMember() {
        return this.loyaltyProgramMember;
    }

    public List<Room> getPreferredRooms() {
        return preferredRooms;
    }



    public static void main(String[] args) {

        Guest john = new Guest("John", "Doe", true);
        Guest jane = new Guest("Jane", "Doe", true);
        Guest jack = new Guest("Jack", "Doe", false);
        Guest alice = new Guest("Alice", "Doe", false);
        Guest bob = new Guest("Bob", "Doe", true);
        Guest charlie = new Guest("Charlie", "Doe", true);


        List<Guest> checkInList = new ArrayList<>(100);   //initial capacity of 100
        checkInList.add(jack);
        checkInList.add(alice);
        print(checkInList);

        //add( index, obj ) , addFirst()
        checkInList.addFirst(john);   //could be addFirst()
        print(checkInList);

        //get()
        checkInList.get(2).setLoyaltyProgramMember(true);

        //addAll()
        checkInList.addAll(1,List.of(bob , charlie));
        print(checkInList);

        //addLast
        checkInList.addLast(jane);
        print(checkInList);

        //remove
        checkInList.remove(2);
        print(checkInList);

        //size
        System.out.println(checkInList.size());

        //indexOf
        System.out.println(checkInList.indexOf(john));

    }

    public static void print (List<Guest> list) {
        System.out.format("%n--List Contents--%n");

        for (int x = 0 ; x<list.size() ; x++) {
            Guest guest = list.get(x);
            System.out.format("%x: %s %n", x, guest.toString());
        }
    }


}






















