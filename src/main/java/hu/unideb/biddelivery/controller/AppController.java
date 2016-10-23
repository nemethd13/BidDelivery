package hu.unideb.biddelivery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import hu.unideb.biddelivery.persistence.entities.Customer;
import hu.unideb.biddelivery.service.CustomerService;

@RestController
@RequestMapping("/")
public class AppController {

    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<List<Customer>> listCustomers() {
        List<Customer> customers = customerService.findAllCustomers();
        if(customers.isEmpty()){
            return new ResponseEntity<List<Customer>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Customer>>(customers, HttpStatus.OK);
    }

}
