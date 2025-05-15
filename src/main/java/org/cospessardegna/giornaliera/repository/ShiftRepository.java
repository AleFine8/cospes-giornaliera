package org.cospessardegna.giornaliera.repository;

import org.cospessardegna.giornaliera.entities.Shift;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDateTime;


public interface ShiftRepository extends JpaRepository<Shift,Integer> {

}
