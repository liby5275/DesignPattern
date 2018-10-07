package com.example.demo.aggregate;

import java.util.List;

public class CustomerDetailsAggregate extends BaseAggregate {

    public CustomerDetailsAggregate() {
        super();
    }


    private int dependentCount;

    public int getDependentCount() {
        return dependentCount;
    }

    public void setDependentCount(int dependentCount) {
        this.dependentCount = dependentCount;
    }

    public CustomerDetailsAggregate(int ssn, String name, String address1, String address2, boolean isDependent) {
        super(ssn,name,address1,address2,isDependent);

    }


}
