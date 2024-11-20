package ie.atu.week9;

public class CustomerApp {
    public static void main(String[] args) {
        Customer newCustomer = new Customer("Lance", "ATU", "12345", "10024", false);
        System.out.println(newCustomer.toString());

        PreferredCustomer preferredCustomer = new PreferredCustomer();
        preferredCustomer.setName("Lance");
        preferredCustomer.setAddress("ATU");
        preferredCustomer.setTelephoneNumber("12345");
        preferredCustomer.setCustomerNumber("10024");
        preferredCustomer.setMailingList(false);
        preferredCustomer.setLoyaltyPoints(500);
        System.out.println(preferredCustomer.toString());

        preferredCustomer.setLoyaltyPoints(500);
        System.out.println(preferredCustomer.toString());

        preferredCustomer.setLoyaltyPoints(500);
        System.out.println(preferredCustomer.toString());

        preferredCustomer.setLoyaltyPoints(500);
        System.out.println(preferredCustomer.toString());
    }


}
