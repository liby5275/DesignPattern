package com.example.demo.repo;

import com.example.demo.aggregate.BaseAggregate;
import com.example.demo.aggregate.CustomerDetailsAggregate;
import com.example.demo.com.example.demo.dto.CustomerOrDepndentDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerOperationsRepo {

    List<BaseAggregate> fetchCustomer(int ssn);
}
