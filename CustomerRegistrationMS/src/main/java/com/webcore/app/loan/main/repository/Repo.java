package com.webcore.app.loan.main.repository;

import org.springframework.data.repository.CrudRepository;

import com.webcore.app.loan.main.model.CustomerDetails;

public interface Repo extends CrudRepository<CustomerDetails, Integer> {

}
