package pointofsales;

public class Customer {
    private String firstName;
    private String lastName;
    private int customerID;

    public Customer(String firstName, String lastName, int customerID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerID = customerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    
}
