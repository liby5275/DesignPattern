package com.example.demo.service;

import com.example.demo.com.example.demo.dto.CustomerOrDepndentDto;
import com.example.demo.com.example.demo.dto.CustomerResponseDto;

public interface CustomerOperationService {

    CustomerOrDepndentDto addCustomerOrDependent(CustomerOrDepndentDto request);

    CustomerResponseDto fetchCustomerDetails(int ssn);
}
