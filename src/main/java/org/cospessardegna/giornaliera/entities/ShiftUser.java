package org.cospessardegna.giornaliera.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "shift_user")
@IdClass(ShiftUserId.class)
public class ShiftUser {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shift_id", insertable = false,updatable = false)
    private Shift shift;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", insertable = false,updatable = false)
    private User user;
}
