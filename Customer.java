

public class Customer {

    private long id;
    
    private String firstName;
    private String lastName;

    private Address address;
    private Phone phone;

    public Customer(String firstName, String lastName, Address a, Phone p) {
        this.firstName = firstName;
        this.lastName = lastName;
        address = a;
        phone = p;
    }

}