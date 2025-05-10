package org.cospessardegna.giornaliera.entities;
import jakarta.persistence.*;

@Entity
@Table(name="permission")
public class Permission {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "description", nullable = false, length = 100)
    private String description;

    @Column(name = "code")
    private Integer code;

}
