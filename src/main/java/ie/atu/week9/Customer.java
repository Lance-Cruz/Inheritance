package ie.atu.week9;

public class Customer extends Person {
    private String customerNumber;
    private boolean mailingList;

    public Customer() {
        super();
        this.customerNumber = "";
        this.mailingList = false;
    }

    public Customer(String name, String address, String telephoneNumber, String customerNumber, boolean mailingList) {
        super(name, address, telephoneNumber);
        this.customerNumber = customerNumber;
        this.mailingList = mailingList;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public boolean isMailingList() {
        return mailingList;
    }

    public void setMailingList(boolean mailingList) {
        this.mailingList = mailingList;
    }

    @Override
    public String toString() {
        return super.toString() + " " +
                "customerNumber=" + customerNumber +
                ", mailingList=" + mailingList + ' ';
    }
}
