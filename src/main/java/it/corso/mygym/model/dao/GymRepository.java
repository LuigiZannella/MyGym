package it.corso.mygym.model.dao;

import it.corso.mygym.model.Gym;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GymRepository extends JpaRepository <Gym, Long > {
}
