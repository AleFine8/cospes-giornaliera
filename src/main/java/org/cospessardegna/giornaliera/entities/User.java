package org.cospessardegna.giornaliera.entities;


import jakarta.persistence.*;

@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "first_name", length = 100)
    private String fistName;

    @Column(name = "last_name", length = 100)
    private String lastName;

    @Column(name = "fiscal_code", length = 16, nullable = false)
    private String fiscalCode;

    @Column(name = "email_address", length = 100, nullable = false)
    private String emailAddress;

    @Column(name = "phone_number", length = 20 )
    private String phoneNumber;

    @Column(name = "role_id")
    private Integer roleId;

    @Column(name = "status", nullable = false)
    private boolean status;

    @Column(name = "privacy_consent", nullable = false)
    private boolean privacyConsent;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id", insertable = false, updatable = false)
    private Role role;

}
