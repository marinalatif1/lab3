import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> myBuddies;

    public AddressBook(){
        this.myBuddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy) {
        if (buddy != null) {
            this.myBuddies.add(buddy);
        }
    }

    public void removeBuddy(int index) {
        if (index >= 0 && index < this.myBuddies.size()) {
            this.myBuddies.remove(index);
        }

    }

    public static void main(String[] args) {

        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);

        //I have successfully uploaded my project onto GitHub to collaborate with other developers.

    }


}
	