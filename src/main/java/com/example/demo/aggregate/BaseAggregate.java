package com.example.demo.aggregate;

public class BaseAggregate {

    private int ssn;
    private String name;
    private String address1;
    private String address2;
    private boolean isDependent;

    public BaseAggregate() {
        super();
    }

    public BaseAggregate(int ssn, String name, String address1, String address2, boolean isDependent) {
        this.ssn = ssn;
        this.name = name;
        this.address1 = address1;
        this.address2 = address2;
        this.isDependent = isDependent;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public boolean isDependent() {
        return isDependent;
    }

    public void setDependent(boolean dependent) {
        isDependent = dependent;
    }
}
