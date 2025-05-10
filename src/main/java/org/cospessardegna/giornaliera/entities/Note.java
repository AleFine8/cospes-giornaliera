package org.cospessardegna.giornaliera.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="note")
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "entity_id", nullable = false)
    private Integer entityId;

    @Column(name = "entity_type_id", nullable = false)
    private Integer entityTypetId;

    @Column(name = "description", length = 50, nullable = false)
    private Integer description;

    @Column(name = "user_id", nullable = false)
    private Integer userId;

    @Column(name = "create_at", nullable = false)
    private LocalDateTime createAt;


}
