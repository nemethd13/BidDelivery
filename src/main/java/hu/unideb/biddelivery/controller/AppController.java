package hu.unideb.biddelivery.controller;

import java.util.List;

import hu.unideb.biddelivery.persistence.entities.Advertiser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import hu.unideb.biddelivery.service.AdvertiserService;

@RestController
@RequestMapping("/")
public class AppController {

    @Autowired
    AdvertiserService advertiserService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<List<Advertiser>> listCustomers() {
        List<Advertiser> advertisers = advertiserService.findAllCustomers();
        if(advertisers.isEmpty()){
            return new ResponseEntity<List<Advertiser>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Advertiser>>(advertisers, HttpStatus.OK);
    }

}
