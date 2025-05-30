package org.cospessardegna.giornaliera.entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cost_center_status")
public class CostCenterStatus {

    @Id
    @Column(name = "id") //toDo: rimuovere autoIncrement dal db
    private Integer id;

    @Column(name = "description", length = 100)
    private String description;
}
