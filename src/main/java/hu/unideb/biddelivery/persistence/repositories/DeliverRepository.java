package hu.unideb.biddelivery.persistence.repositories;

import hu.unideb.biddelivery.persistence.entities.Deliver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliverRepository extends JpaRepository<Deliver, Long> {

}
