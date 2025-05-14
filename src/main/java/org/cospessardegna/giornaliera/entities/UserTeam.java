package org.cospessardegna.giornaliera.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "user_team")
@IdClass(UserTeamId.class)
public class UserTeam {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team_id", insertable = false,updatable = false)
    private Team team;
}