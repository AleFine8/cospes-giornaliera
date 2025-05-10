package org.cospessardegna.giornaliera.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="activity_type")
public class ActivityType {

    @Id
    @Column(name = "act_id")
    private Integer id;

    @Column(name = "desc", length = 100)
    private String desc;

}
