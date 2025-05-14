package org.cospessardegna.giornaliera.repository;

import org.cospessardegna.giornaliera.entities.Shift;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ShiftRepository extends JpaRepository<Shift,Integer> {

}
