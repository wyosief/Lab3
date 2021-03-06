
import java.util.*;

public class AddressBook {
    private ArrayList<BuddyInfo> buddies;

    public AddressBook() {

        buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy) {
        if (buddy != null) {
            buddies.add(buddy);
        }
    }

    public BuddyInfo removeBuddy(int index) {

        if(index >= 0 && index < buddies.size()) {
            return buddies.remove(index);
        }
        return null;

    }

    public void printAddressBook() {
        if(buddies.size() != 0) {
            for (BuddyInfo aBuddy : buddies) {
                System.out.println("Buddy: " + aBuddy.getName());
            }
        }
        else {
            System.out.println("Address book is empty");
        }



    }

    public static void main(String[] args){
        System.out.println("Address book");
        BuddyInfo buddy1 = new BuddyInfo("Lola", "123 Happy Crescent", "613 256 4321");
        BuddyInfo buddy2 = new BuddyInfo("Shawn", "456 California Avenue", "613 279 8963");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy1);
        addressBook.addBuddy(buddy2);
        addressBook.printAddressBook();
        addressBook.removeBuddy(0);

    }


}
