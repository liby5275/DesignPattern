package com.example.demo.builder;

import com.example.demo.aggregate.BaseAggregate;
import com.example.demo.com.example.demo.dto.CustomerResponseDto;


import java.util.List;

public interface CustomerOperationsBuildeRInterface {

    CustomerResponseDto buildCustomerDetails (List<BaseAggregate> aggregate, int ssn);
}
