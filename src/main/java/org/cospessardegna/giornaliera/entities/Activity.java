package org.cospessardegna.giornaliera.entities;
import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
//name="activity" diciamo  a javaSpring qual è il nome della tabella nel nostro db
@Table(name="activity")
public class Activity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Integer id;

    //associa l'attributo description alla colonna 'desc' della nostra tabella
    @Column(name = "description", nullable = false, length = 500)
    private String description;

    @Column(name = "type_id")
    private Integer typeId;

    @Column(name = "date_time_start", nullable = false)
    private LocalDateTime dateTimeStart;

    @Column(name = "date_time_end", nullable = false)
    private LocalDateTime dateTimeEnd;

    @Column(name = "status_id")
    private Integer statusId;

    @Column(name = "cost_center_id")
    private Integer costCenterId;

    @Column(name = "read_only")
    private Boolean readOnly;

    //modo per fare le chiavi esterne
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "type_id", insertable = false, updatable = false )
    private ActivityType type;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "status_id", insertable = false,updatable = false)
    private ActivityStatus status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cost_center_id",insertable = false,updatable = false)
    private CostCenter costCenter;

}
