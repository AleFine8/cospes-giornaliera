package org.cospessardegna.giornaliera.entities;

import jakarta.persistence.*;

@Entity
@Table(name="customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "category_id")
    private Integer categoryId;

    @Column(name = "business_name", length = 100, nullable = false)
    private String businessName;

    @Column(name = "fiscal_code", length = 16, nullable = false)
    private String fiscalCode;

    @Column(name = "vat_code", length = 20, nullable = false)
    private String vatCode;

    @Column(name = "status")
    private boolean status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", insertable = false, updatable = false)
    private CustomerCategory category;

}
