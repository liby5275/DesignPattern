package com.example.demo.rowMapper;

import com.example.demo.aggregate.BaseAggregate;
import com.example.demo.factory.CustomerFactory;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;

public class CustomerRowMapper {

    /* Here we are using the Factory Design pattern
    Factory will get the proper instance based on the input
     */


    public static final RowMapper<BaseAggregate> FETCH_CUS_DETAILS =  (ResultSet rs, int count) -> {

        /*if(rs.getBoolean("IS_DEPENDENT")) {
        return CustomerFactory.getDependentAggregate(rs);
        }

        try {
            return CustomerFactory.getCustomerAggregateInstance(rs);
        }catch(Exception e) {
            e.printStackTrace();
        }
        return null;*/
        try {
            return CustomerFactory.getCustomerAggregateInstance(rs);
        }catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    };
}
