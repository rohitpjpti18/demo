package com.houston.userauth.model;

import com.houston.userauth.entity.UserRoleEntity;

import javax.persistence.*;

public class UserRole {
    private Long userRoleId;
    private int userRoleLevel;
    private String userRoleName;
    private UserRoleType userRoleType;

    public UserRole(
            Long userRoleId,
            int userRoleLevel,
            String userRoleName,
            UserRoleType userRoleType
    ) {
        this.userRoleId = userRoleId;
        this.userRoleLevel = userRoleLevel;
        this.userRoleName = userRoleName;
        this.userRoleType = userRoleType;
    }

    public UserRole(UserRoleEntity userRoleEntity){
        this.userRoleId = userRoleEntity.getUserRoleId();
        this.userRoleLevel = userRoleEntity.getUserRoleLevel();
        this.userRoleName = userRoleEntity.getUserRoleName();
        this.userRoleType = userRoleEntity.getUserRoleType();
    }

    public Long getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(Long userRoleId) {
        this.userRoleId = userRoleId;
    }

    public int getUserRoleLevel() {
        return userRoleLevel;
    }

    public void setUserRoleLevel(int userRoleLevel) {
        this.userRoleLevel = userRoleLevel;
    }

    public String getUserRoleName() {
        return userRoleName;
    }

    public void setUserRoleName(String userRoleName) {
        this.userRoleName = userRoleName;
    }

    public UserRoleType getUserRoleType() {
        return userRoleType;
    }

    public void setUserRoleType(UserRoleType userRoleType) {
        this.userRoleType = userRoleType;
    }
}
