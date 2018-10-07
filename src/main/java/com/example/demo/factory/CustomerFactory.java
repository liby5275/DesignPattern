package com.example.demo.factory;

import com.example.demo.aggregate.CustomerDetailsAggregate;
import com.example.demo.aggregate.DependentAggregate;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerFactory {

    public static CustomerDetailsAggregate getCustomerAggregateInstance(ResultSet rs)  {
        CustomerDetailsAggregate aggreagte;
        try {
             aggreagte = new CustomerDetailsAggregate(rs.getInt("SSN"), rs.getString("NAME"), rs.getString("ADDRESS1"),
                     rs.getString("ADDRESS2"), rs.getBoolean("IS_DEPENDENT"));
             return aggreagte;
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static DependentAggregate getDependentAggregate(ResultSet rs) {
        DependentAggregate aggregate;
        try {
            aggregate = new DependentAggregate(rs.getInt("SSN"), rs.getString("NAME"), rs.getString("ADDRESS1"),
                    rs.getString("ADDRESS2"), rs.getBoolean("IS_DEPENDENT"));
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
