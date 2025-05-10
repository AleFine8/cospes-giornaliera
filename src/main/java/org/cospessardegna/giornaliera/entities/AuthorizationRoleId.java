package org.cospessardegna.giornaliera.entities;

import java.io.Serializable;
import java.util.Objects;
public class AuthorizationRoleId implements Serializable {

    private Integer roleId;
    private Integer appEntityId;
    private Integer permissionId;

    public AuthorizationRoleId(){}
    public AuthorizationRoleId(Integer roleId, Integer appEntityId, Integer permissionId){
        this.roleId= roleId;
        this.appEntityId = appEntityId;
        this. permissionId = permissionId;
    }

    @Override
    public boolean equals(Object o){

        if( this == o)return true;
        if(!( o instanceof AuthorizationRoleId)) return false;

        AuthorizationRoleId that= (AuthorizationRoleId) o;

        return Objects.equals(roleId, that.roleId)
                && Objects.equals(appEntityId, that.appEntityId)
                && Objects.equals(permissionId, that.permissionId);
    }

    public int hasCode(){
        return Objects.hash(roleId, appEntityId, permissionId );
    }


}
