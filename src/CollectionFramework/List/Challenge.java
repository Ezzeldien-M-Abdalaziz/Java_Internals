package CollectionFramework.List;

import CollectionFramework.Room;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Challenge {

    private List<Guest> checkInList = new ArrayList<>(100);

    private static List<Guest> filterByFavouriteRoom(List<Guest> guests , Room room) {

        List<Guest> filteredGuests = new ArrayList<>();

        // you have to end the stream with a collect to be able to assign it to another collection variable -> .collect(Collectors.toList())
        filteredGuests = guests.stream()
                .filter( guest -> guest.getPreferredRooms().indexOf(room) == 0).collect(Collectors.toList());

        return filteredGuests;
    }


    public void checkIn(Guest guest) {

        checkInList.add(guest);

        List<Guest> loyalGuests = new ArrayList<>();

        for (Guest g : checkInList) {
            if(g.getLoyaltyProgramMember()) {
                loyalGuests.add(g);
                checkInList.remove(g);
            }
        }

        for (Guest g : loyalGuests) {
            loyalGuests.addFirst(g);
        }

    }


    public void swapPosition(Guest guest1 , Guest guest2){
        if(!checkInList.contains(guest1) || !checkInList.contains(guest2)){
            System.out.println("not in list");
        }

        int indexOfGuest1 = checkInList.indexOf(guest1);
        int indexOfGuest2 = checkInList.indexOf(guest2);

        checkInList.set(indexOfGuest1, guest2);
        checkInList.set(indexOfGuest2, guest1);


    }

    public List<Guest> getCheckInList() {
        return List.copyOf(checkInList);
    }






    public static void main(String[] args) {

    }
}




























