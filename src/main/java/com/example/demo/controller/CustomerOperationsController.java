package com.example.demo.controller;

import com.example.demo.aggregate.CustomerDetailsAggregate;
import com.example.demo.com.example.demo.dto.CustomerOrDepndentDto;
import com.example.demo.com.example.demo.dto.CustomerResponseDto;
import com.example.demo.service.CustomerOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class CustomerOperationsController {

    @Autowired
    private CustomerOperationService service;

    @RequestMapping(value ="/customer", method = RequestMethod.POST)
    public CustomerOrDepndentDto addCustomerOrDependent(@RequestBody CustomerOrDepndentDto request) {

        return service.addCustomerOrDependent(request);

    }

    @RequestMapping(value = "/customer/{ssn}", method = RequestMethod.GET)
    public CustomerResponseDto fetchCustomer(@PathVariable int ssn) {

        CustomerResponseDto result = service.fetchCustomerDetails(ssn);
        return result;
    }
}
