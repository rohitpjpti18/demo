package com.houston.userauth.entity;

import java.time.LocalDateTime;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/*
 *
 * Author:- rohit.prajapati
 * 
 */
@Entity
@Table(name="INSTITUTE")
public class InstituteEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="INSTITUTE_ID")
    private String instituteId;

    @Column(name="INSTITUTE_NAME")
    private String instituteName;

    @Column(name="INSTITUTE_TYPE")
    private String instituteType;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userId", unique = true)
    private UserEntity instituteMasterAdmin;

    @Column(name="INSTITUTE_CAPACITY")
    private Long instituteCapacity;

    @Column(name="CREATED_ON")
    @Basic
    private LocalDateTime createdOn;
    
    public InstituteEntity(){}

    public InstituteEntity(String instituteId, String instituteName, String instituteType,
            UserEntity instituteMasterAdmin, Long instituteCapacity, LocalDateTime createdOn) {
        this.instituteId = instituteId;
        this.instituteName = instituteName;
        this.instituteType = instituteType;
        this.instituteMasterAdmin = instituteMasterAdmin;
        this.instituteCapacity = instituteCapacity;
        this.createdOn = createdOn;
    }

    public String getInstituteId() {
        return instituteId;
    }

    public void setInstituteId(String instituteId) {
        this.instituteId = instituteId;
    }

    public String getInstituteName() {
        return instituteName;
    }

    public void setInstituteName(String instituteName) {
        this.instituteName = instituteName;
    }

    public String getInstituteType() {
        return instituteType;
    }

    public void setInstituteType(String instituteType) {
        this.instituteType = instituteType;
    }

    public UserEntity getInstituteMasterAdmin() {
        return instituteMasterAdmin;
    }

    public void setInstituteMasterAdmin(UserEntity instituteMasterAdmin) {
        this.instituteMasterAdmin = instituteMasterAdmin;
    }

    public Long getInstituteCapacity() {
        return instituteCapacity;
    }

    public void setInstituteCapacity(Long instituteCapacity) {
        this.instituteCapacity = instituteCapacity;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }
}
