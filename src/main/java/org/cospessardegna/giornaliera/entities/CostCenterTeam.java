package org.cospessardegna.giornaliera.entities;
import jakarta.persistence.*;


@Entity
@Table(name="cost_center_team")
@IdClass(CostCenterTeamId.class)
public class CostCenterTeam {

    @Id
    @Column(name = "cost_center_id")
    private Integer costCenterId;

    @Id
    @Column(name = "team_id")
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team_id", insertable = false, updatable = false)
    private Team team;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cost_center_id", insertable = false, updatable = false)
    private CostCenter costCenter;


}
