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
        if (firstName == null || firstName.length() <= 0) {
            System.out.println("First Name cannot be empty");
        } else {
            this.firstName = firstName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.length() <= 0) {
            System.out.println("Last Name cannot be empty");
        } else {
            this.lastName = lastName;
        }
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        if (customerID == null || customerID.length() <= 0) {
            System.out.println("Customer ID cannot be empty");
        } else {
            this.customerID = customerID;
        }
    }
    
    
    
}
