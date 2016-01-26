public class Customer {

    private String socialSecurityNumber;

    private String name;

    private String email;
    
    public Customer(String ssn, String name, String email) {
        this.socialSecurityNumber = ssn;
        this.name = name;
        this.email = email;
    }
    
    public String getCustomerInfo() {
        return this.name;
    }
}
