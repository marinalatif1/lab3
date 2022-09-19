import java.util.*;
public class AddressBook {


    private ArrayList<BuddyInfo> myBuddies = new ArrayList<>();

    public void addBuddy(BuddyInfo buddy) {
        myBuddies.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy) {
       myBuddies.remove(buddy);
    }
    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);


    }

}


	