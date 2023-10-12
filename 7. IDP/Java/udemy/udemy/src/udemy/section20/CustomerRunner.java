package udemy.section20;

public class CustomerRunner {
    public static void main(String[] args) {
        Address homeAddress = new Address("1","seoul","555");
        Customer customer = new Customer("TEST", homeAddress);

        Address workAddress = new Address("2","seoul","2555");
        customer.setWorkAddress(workAddress);
        System.out.println(customer);
    }
}
