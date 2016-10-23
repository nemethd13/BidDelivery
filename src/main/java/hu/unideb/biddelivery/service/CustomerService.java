package hu.unideb.biddelivery.service;

import java.util.List;

import hu.unideb.biddelivery.persistence.entities.Customer;


public interface CustomerService {

    List<Customer> findAllCustomers();
}
