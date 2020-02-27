package com.webcore.app.loan.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webcore.app.loan.main.model.BusinessDetails;

@Repository
public interface BusinessDetailsRepository extends CrudRepository<BusinessDetails, Integer>{

}
