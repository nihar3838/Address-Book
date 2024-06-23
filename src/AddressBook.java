public class AddressBook {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private int zipCode;
    private long phoneNumber;
    private String email;
    AddressBook(String firstName,String lastName, String address,String city, String state,int zipCode, long phoneNumber, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Address Book program.");
        AddressBook contact1 = new AddressBook("Nihar", "Khot", "Kamothe",
                "Navi Mumbai","Maharashtra", 410209,8291064760L, "niharkhot123@gmail.com");
    }
}