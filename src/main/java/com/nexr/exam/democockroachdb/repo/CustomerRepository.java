package com.nexr.exam.democockroachdb.repo;

import com.nexr.exam.democockroachdb.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
