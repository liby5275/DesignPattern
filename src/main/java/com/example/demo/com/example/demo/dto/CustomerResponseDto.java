package com.example.demo.com.example.demo.dto;

import java.util.List;

/*
 Composite pattern is used here. A combination of objects are treated as one object here
 */

public class CustomerResponseDto {

    private int ssn;
    private String name;
    private String address1;
    private String address2;
    private boolean isDependent;
    private int parentSsn;
    private List<CustomerResponseDto> dependents;


    public int getSsn() {
        return ssn;
    }

    public String getName() {
        return name;
    }

    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }

    public boolean isDependent() {
        return isDependent;
    }

    public int getParentSsn() {
        return parentSsn;
    }

    public List<CustomerResponseDto> getDependents() {
        return dependents;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public void setDependent(boolean dependent) {
        isDependent = dependent;
    }

    public void setParentSsn(int parentSsn) {
        this.parentSsn = parentSsn;
    }

    public void setDependents(List<CustomerResponseDto> dependents) {
        this.dependents = dependents;
    }
}
