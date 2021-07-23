package com.houston.userauth.entity;

import com.houston.userauth.model.UserRole;
import com.houston.userauth.model.UserRoleType;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name="USER_ROLE")
public class UserRoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userRoleId;

    @Column(name="USER_ROLE_LEVEL")
    private int userRoleLevel;

    @Column(name="USER_ROLE_NAME", unique = true)
    private String userRoleName;

    @Column(name="USER_ROLE_TYPE")
    @Enumerated(value=EnumType.STRING)
    private UserRoleType userRoleType;

    public UserRoleEntity() {
    }

    public UserRoleEntity(
            Long userRoleId,
            int userRoleLevel,
            String userRoleName,
            UserRoleType userRoleTye
    ) {
        this.userRoleId = userRoleId;
        this.userRoleLevel = userRoleLevel;
        this.userRoleName = userRoleName;
        this.userRoleType = userRoleTye;
    }

    public UserRoleEntity(UserRole userRole){
        this.userRoleId = userRole.getUserRoleId();
        this.userRoleLevel = userRole.getUserRoleLevel();
        this.userRoleName = userRole.getUserRoleName();
        this.userRoleType = userRole.getUserRoleType();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserRoleEntity that = (UserRoleEntity) o;
        return userRoleLevel == that.userRoleLevel && userRoleName == that.userRoleName && Objects.equals(userRoleId, that.userRoleId) && userRoleType == that.userRoleType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userRoleId, userRoleLevel, userRoleName, userRoleType);
    }

    @Override
    public String toString() {
        return "UserRoleEntity{" +
                "userRoleId=" + userRoleId +
                ", userRoleLevel=" + userRoleLevel +
                ", userRoleName=" + userRoleName +
                ", userRoleTye=" + userRoleType +
                '}';
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
