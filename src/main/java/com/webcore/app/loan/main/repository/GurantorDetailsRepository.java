package com.webcore.app.loan.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webcore.app.loan.main.model.GuarantorDetails;

@Repository
public interface GurantorDetailsRepository extends CrudRepository<GuarantorDetails, Integer> {

}
