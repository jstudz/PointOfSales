/*
    This class is used to create customers for the database strategy. Each Customer
    should have their own unique customerID to keep them apart from each other.
*/
package pointofsales;

public class Customer {
    private String firstName;
    private String lastName;
    private String customerID;

    public Customer(String firstName, String lastName, String customerID) {
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

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }
    
    
    
}
