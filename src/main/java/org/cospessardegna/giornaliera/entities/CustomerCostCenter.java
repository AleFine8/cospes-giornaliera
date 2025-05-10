package org.cospessardegna.giornaliera.entities;

import jakarta.persistence.*;

@Entity
@Table(name="customer_cost_center")
@IdClass(CustomerCostCenterId.class)
public class CustomerCostCenter {

    @Id
    @Column(name = "cost_center_id")
    private Integer costCenterId;

    @Id
    @Column(name = "customer_id")
    private Integer customerId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cost_center_id")
    private CostCenter costCenter;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id" )
    private Customer customer;

}
