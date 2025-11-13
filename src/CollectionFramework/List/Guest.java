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


    public String getFirstName() {
        return FirstName;
    }
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }


    public static void main(String[] args) {

        Guest john = new Guest("John", "Doe", true);
        Guest jane = new Guest("Jane", "Doe", false);
        Guest jack = new Guest("Jack", "Doe", true);
        Guest alice = new Guest("Alice", "Doe", true);


        List<Guest> checkInList = new ArrayList<>(100);   //initial capacity of 100


    }

    public static void print (List<Guest> list) {
        System.out.format("%n--List Contents--%n");

        for (int x = 0 ; x<list.size() ; x++) {
            Guest guest = list.get(x);
            System.out.format("%x: %s %n", x, guest.toString());
        }
    }


}






















