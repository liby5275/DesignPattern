package com.example.demo.repo;

import com.example.demo.com.example.demo.dto.CustomerOrDepndentDto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasicCRUDRepo extends CrudRepository<CustomerOrDepndentDto,Integer> {
}
