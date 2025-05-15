package org.cospessardegna.giornaliera.controller;


import org.cospessardegna.giornaliera.entities.Shift;
import org.cospessardegna.giornaliera.service.ShiftService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/api/shift")
public class ShiftController {
    private final ShiftService shiftService;

    public ShiftController(ShiftService shiftService) {
        this.shiftService = shiftService;
    }

    @GetMapping
    public List<Shift> getAll(){
        return shiftService.findAll();
    }

    @GetMapping ("/{id}")
    public Shift getById(@PathVariable Integer id){
        return shiftService.findById(id).orElseThrow();
    }

    @PostMapping
    public Shift create(@RequestBody Shift shift){
        return shiftService.save(shift);
    }

    @DeleteMapping ("/{id}")
    public void deleteById(@PathVariable Integer id){
        shiftService.deleteById(id);
    }

}
