package org.cospessardegna.giornaliera.entities;

import jakarta.persistence.*;

@Entity
@Table(name="customer_category")
public class CustomerCategory {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "description", length = 100)
    private String description;
}
