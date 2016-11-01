package hu.unideb.biddelivery.service;

import hu.unideb.biddelivery.persistence.entities.Deliver;

import java.util.List;

public interface DeliverService {

    List<Deliver> findAllDeliver();
}
