public class BuddyInfo {
    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    String name;
    String address;
    String phoneNumber;

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Lola", "123 Happy Street", "613 567 892");
        System.out.println("Hello " + buddy.getName() + "!");
    }
}