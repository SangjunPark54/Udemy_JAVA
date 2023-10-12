package udemy.section20;

public class Customer {
    //state
    private String name;
    private Address homeAddress;
    private Address workAddress;

    public Customer(String name, Address homeAddress) {
        this.name = name;
        this.homeAddress = homeAddress;
    }
    //creating
    //필수라면 생성자에 추가

    public void setWorkAddress(Address workAddress) {
        this.workAddress = workAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getWorkAddress() {
        return workAddress;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public String toString() {
        return String.format("name - [%s] home address - [%s] work address - [%s]",
                name, homeAddress, workAddress);
    }
}
