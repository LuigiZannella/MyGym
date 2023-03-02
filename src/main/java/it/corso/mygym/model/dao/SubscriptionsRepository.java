package it.corso.mygym.model.dao;

import it.corso.mygym.model.Subscriptions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubscriptionsRepository extends JpaRepository <Subscriptions, Long> {

    List<Subscriptions> findBySoldTrue();

    // TODO: find by active subscription

    List<Subscriptions> findByValidateSubscriptionsAndSoldTrue();
}
