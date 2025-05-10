package org.cospessardegna.giornaliera.entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="activity_status")
public class ActivityStatus {

    @Id
    @Column(name = "statid")
    private Integer id;

    @Column(name = "desc", length = 100)
    private String description;

}
