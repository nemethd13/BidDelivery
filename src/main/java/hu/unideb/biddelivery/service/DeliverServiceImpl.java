package hu.unideb.biddelivery.service;


import hu.unideb.biddelivery.persistence.entities.Deliver;
import hu.unideb.biddelivery.persistence.repositories.DeliverRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DeliverServiceImpl implements DeliverService {

    @Autowired
    DeliverRepository deliverRepository;

    public List<Deliver> findAllDeliver() {
        return deliverRepository.findAll();
    }
}
