package org.cospessardegna.giornaliera.entities;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="cost_center")
public class CostCenter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cost_id")
    private Integer Id;

    @Column(name = "cost_center_name", nullable = false, length = 100)
    private String costCenterName;

    @Column(name = "desc", length = 100)
    private String description;

    @Column(name = "status_id")
    private Integer statusId;

    @Column(name ="max_hours")
    private Integer maxHours;

    @Column(name ="max_budg")
    private Integer maxBudget;

    @Column(name = "expiration_date")
    private LocalDateTime expirationDate;

    @Column(name = "creation_date")
    private LocalDateTime creationDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "status_id", nullable = false )
    private CostCenterStatus status;

}
