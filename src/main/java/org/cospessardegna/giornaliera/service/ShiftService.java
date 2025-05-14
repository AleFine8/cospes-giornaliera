package org.cospessardegna.giornaliera.service;

import jakarta.persistence.Entity;
import org.cospessardegna.giornaliera.entities.Shift;
import org.cospessardegna.giornaliera.repository.ShiftRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ShiftService {
    private final ShiftRepository shiftRepository;

    public ShiftService(ShiftRepository shiftRepository){
        this.shiftRepository= shiftRepository;
    }

    public List<Shift> findAll(){
        return shiftRepository.findAll();
    }

    public Optional<Shift> findById(Integer id){
        return shiftRepository.findById(id);
    }

    public Shift save(Shift shift){
        return shiftRepository.save(shift);
    }

    public void deleteById (Integer id){
        shiftRepository.deleteById(id);
    }
}
