package hu.unideb.biddelivery.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hu.unideb.biddelivery.persistence.entities.Customer;

@Repository
public interface CustomerRepository  extends JpaRepository<Customer, Long>  {

}
