package org.cospessardegna.giornaliera.entities;

import java.io.Serializable;
import java.util.Objects;
public class CustomerCostCenterId implements Serializable{

    private Integer costCenterId;
    private Integer customerId;

    public CustomerCostCenterId(){}
    public CustomerCostCenterId(Integer costCenterId, Integer customerId){
        this.costCenterId = costCenterId;
        this.customerId = customerId;

    }

    @Override
    public boolean equals(Object o){

        if( this == o)return true;
        if(!( o instanceof  CustomerCostCenterId)) return false;

        CustomerCostCenterId that= (CustomerCostCenterId) o;

        return Objects.equals(costCenterId, that.costCenterId)
                && Objects.equals(customerId, that.customerId);

    }

    public int hasCode(){
        return Objects.hash(costCenterId, customerId );
    }
}
