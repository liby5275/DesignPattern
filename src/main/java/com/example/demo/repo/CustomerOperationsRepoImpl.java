package com.example.demo.repo;

import com.example.demo.aggregate.BaseAggregate;
import com.example.demo.rowMapper.CustomerRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerOperationsRepoImpl implements CustomerOperationsRepo {

    @Autowired
    private NamedParameterJdbcTemplate jdbc;

    String sql = "select * from CUSTOMER where SSN=:ssn or  PARENT_SSN=:ssn";

    @Override
    public List<BaseAggregate> fetchCustomer(int ssn) {

        MapSqlParameterSource source = new MapSqlParameterSource();
        source.addValue("ssn",ssn);
        List<BaseAggregate> resultList = jdbc.query(this.sql,source, CustomerRowMapper.FETCH_CUS_DETAILS);
        return resultList;
    }
}
