package org.example.domain;

public class Customer {
    private String name;
    private String firstname;
    private Address address;
    private Integer accountId;

    public Customer() {
    }

    public Customer(String name, String firstname, Address address, Integer accountId) {
        this.name = name;
        this.firstname = firstname;
        this.address = address;
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", firstname='" + firstname + '\'' +
                ", address=" + address +
                ", accountId=" + accountId +
                '}';
    }
}
