package hu.unideb.biddelivery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import hu.unideb.biddelivery.persistence.entities.Customer;
import hu.unideb.biddelivery.persistence.repositories.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public List<Customer> findAllCustomers() {
        return customerRepository.findAll();
    }



}
