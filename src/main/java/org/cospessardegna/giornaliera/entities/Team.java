package org.cospessardegna.giornaliera.entities;

import jakarta.persistence.*;
@Entity
@Table(name="team")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "description", nullable = false, length = 500)
    private String description;
}
