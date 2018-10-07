package com.example.demo.com.example.demo.dto;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER")
public class CustomerOrDepndentDto {

    @Id
    private int ssn;
    private String name;
    private String address1;
    private String address2;
    private boolean isDependent;
    private int parentSsn;

    public int getParentSsn() {
        return parentSsn;
    }

    public void setParentSsn(int parentSsn) {
        this.parentSsn = parentSsn;
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

    public boolean getIsDependent() {
        return isDependent;
    }

    public void setIsDependent(boolean dependent) {
        isDependent = dependent;
    }
}
