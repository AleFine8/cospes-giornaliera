package org.cospessardegna.giornaliera.entities;
import jakarta.persistence.*;

@Entity
@Table(name="authorization_role")
@IdClass(AuthorizationRoleId.class)
public class AuthorizationRole {

    @Id
    @Column(name = "role_id")
    private Integer id;

    @Id
    @Column(name = "app_entity_id", nullable = false)
    private Integer appEntityId;

    @Id
    @Column(name = "permission_id", nullable = false)
    private Integer permissionId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id", nullable = false )
    private Role role;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "app_entity_id", nullable = false )
    private ApplicationEntity appEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "permission_id", nullable = false )
    private Permission permission;

}

