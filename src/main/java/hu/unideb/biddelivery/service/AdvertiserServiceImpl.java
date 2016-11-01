package hu.unideb.biddelivery.service;

import java.util.List;

import hu.unideb.biddelivery.persistence.entities.Advertiser;
import org.springframework.beans.factory.annotation.Autowired;

import hu.unideb.biddelivery.persistence.repositories.AdvertiserRepository;
import org.springframework.stereotype.Service;

@Service
public class AdvertiserServiceImpl implements AdvertiserService {

    @Autowired
    AdvertiserRepository advertiserRepository;

    public List<Advertiser> findAllCustomers() {
        return advertiserRepository.findAll();
    }



}
