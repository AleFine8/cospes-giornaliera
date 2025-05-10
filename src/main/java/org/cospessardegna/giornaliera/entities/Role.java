package org.cospessardegna.giornaliera.entities;
import jakarta.persistence.*;

@Entity
@Table(name="role")
public class Role {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 100)
    private String description;

}
