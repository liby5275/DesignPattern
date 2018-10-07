package com.example.demo.aggregate;

public class DependentAggregate extends BaseAggregate {
    int parentSsn;

    public int getParentSsn() {
        return parentSsn;
    }

    public void setParentSsn(int parentSsn) {
        this.parentSsn = parentSsn;
    }

    public DependentAggregate(int ssn, String name, String address1, String address2, boolean isDependent) {
        super(ssn,name,address1,address2,isDependent);

    }
}
