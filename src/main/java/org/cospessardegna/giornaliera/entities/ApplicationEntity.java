package org.cospessardegna.giornaliera.entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="app_entity")
public class ApplicationEntity {

    @Id
    @Column(name = "app_id")
    private Integer id;

    @Column(name = "desc", length = 100)
    private String description;

}
