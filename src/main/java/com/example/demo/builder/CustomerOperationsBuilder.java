package com.example.demo.builder;

import com.example.demo.aggregate.BaseAggregate;
import com.example.demo.aggregate.CustomerDetailsAggregate;
import com.example.demo.com.example.demo.dto.CustomerResponseDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/*
Design pattern Builder pattern is implemented here
 */
@Component
public class CustomerOperationsBuilder implements  CustomerOperationsBuildeRInterface {

    @Override
    public CustomerResponseDto buildCustomerDetails(List<BaseAggregate> aggregateList, int ssn) {
        CustomerResponseDto result = new CustomerResponseDto();
        List<CustomerResponseDto> dependents = new ArrayList<CustomerResponseDto>();
        for(BaseAggregate entry : aggregateList){
            if(entry.isDependent()) {
                dependents.add(getDependentDetails(entry,ssn));
            } else {
                result.setSsn(entry.getSsn());
                result.setAddress1(entry.getAddress1());
                result.setAddress2(entry.getAddress2());
                result.setName(entry.getName());
            }

        }

        result.setDependents(dependents);
        result.setDependent(false);
        return result;
    }



    private CustomerResponseDto getDependentDetails(BaseAggregate entry, int ssn) {
        CustomerResponseDto dependent = new CustomerResponseDto();
        dependent.setSsn(entry.getSsn());
        dependent.setAddress1(entry.getAddress1());
        dependent.setAddress2(entry.getAddress2());
        dependent.setName(entry.getName());
        dependent.setDependent(true);
        dependent.setParentSsn(ssn);
        return dependent;
    }

}
