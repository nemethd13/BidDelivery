package hu.unideb.biddelivery.persistence.repositories;

import hu.unideb.biddelivery.persistence.entities.Advertiser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdvertiserRepository extends JpaRepository<Advertiser, Long>  {

}
