package org.cospessardegna.giornaliera.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="clocking")
public class Clocking {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "direction", nullable = false, length = 1)
    private Character direction;

    @Column(name = "clocking_time", nullable = false)
    private LocalDateTime clockingTime;

    @Column(name = "user_id")
    private Integer userId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", updatable = false, insertable = false )
    private User user;

}
