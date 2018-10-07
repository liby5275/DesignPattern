package com.example.demo.service;

import com.example.demo.aggregate.BaseAggregate;
import com.example.demo.aggregate.CustomerDetailsAggregate;
import com.example.demo.builder.CustomerOperationsBuildeRInterface;
import com.example.demo.com.example.demo.dto.CustomerOrDepndentDto;
import com.example.demo.com.example.demo.dto.CustomerResponseDto;
import com.example.demo.repo.BasicCRUDRepo;
import com.example.demo.repo.CustomerOperationsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerOperationsServiceImpl implements CustomerOperationService {


    @Autowired
    private BasicCRUDRepo repo;

    @Autowired
    private CustomerOperationsRepo repoCust;

    @Autowired
    private CustomerOperationsBuildeRInterface builder;

    @Override
    public CustomerOrDepndentDto addCustomerOrDependent(CustomerOrDepndentDto request) {

        return repo.save(request);

    }


    @Override
    public CustomerResponseDto fetchCustomerDetails(int ssn) {
        List<BaseAggregate> aggrgate = repoCust.fetchCustomer(ssn);
        return builder.buildCustomerDetails(aggrgate,ssn);

    }
}
