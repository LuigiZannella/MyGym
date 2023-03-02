package it.corso.mygym.model.dao;

import it.corso.mygym.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository <User, Long> {

    List<User> findByActivateTrue();


    List<User> findByActivateTrueAndSubscriptionsActive();

    // TODO: find by activeFlag=true AND have an active subscription --> @query

    List<User> findByEmail(String Email);
}
