package com.houston.userauth.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="CONTACT_ENTITY")
public class ContactEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CONTACT_ID")
    private Long contactId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="userId", unique=true)
    private UserEntity user;

    @Column(name="PRIMARY_PHONE_NUMBER")
    private String primaryPhoneNo;

    @Column(name="SECONDARY_PHONE_NUMBER")
    private String secondaryPhoneNo;

    @Column(name="EMERGENCY_PHONE_NUMBER")
    private String emergencyPhoneNumber;

    @Column(name="EMERGENCY_PERSON_NAME")
    private String emergencyPersonName;

    @Column(name="PERMANENT_ADDRESS")
    private String permanentAddress;

    @Column(name="CURRENT_ADDRESS")
    private String currentAddress;

    @Column(name="COUNTRY")
    private String country;

    @Column(name="STATE")
    private String state;

    @Column(name="DISTRICT")
    private String district;

    @Column(name="PINCODE")
    private String pincode;

    public ContactEntity() {
        super();
    }

    public ContactEntity(
            UserEntity user,
            String primaryPhoneNo,
            String secondaryPhoneNo,
            String emergencyPhoneNumber,
            String emergencyPersonName,
            String permanentAddress,
            String currentAddress,
            String country,
            String state,
            String district,
            String pincode
    ) {
        super();
        this.user = user;
        this.primaryPhoneNo = primaryPhoneNo;
        this.secondaryPhoneNo = secondaryPhoneNo;
        this.emergencyPhoneNumber = emergencyPhoneNumber;
        this.emergencyPersonName = emergencyPersonName;
        this.permanentAddress = permanentAddress;
        this.currentAddress = currentAddress;
        this.country = country;
        this.state = state;
        this.district = district;
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "ContactEntity{" +
                "contactId=" + contactId +
                ", user=" + user +
                ", primaryPhoneNo='" + primaryPhoneNo + '\'' +
                ", secondaryPhoneNo='" + secondaryPhoneNo + '\'' +
                ", emergencyPhoneNumber='" + emergencyPhoneNumber + '\'' +
                ", emergencyPersonName='" + emergencyPersonName + '\'' +
                ", permanentAddress='" + permanentAddress + '\'' +
                ", currentAddress='" + currentAddress + '\'' +
                ", country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", district='" + district + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactEntity that = (ContactEntity) o;
        return Objects.equals(contactId, that.contactId) && Objects.equals(user, that.user) && Objects.equals(primaryPhoneNo, that.primaryPhoneNo) && Objects.equals(secondaryPhoneNo, that.secondaryPhoneNo) && Objects.equals(emergencyPhoneNumber, that.emergencyPhoneNumber) && Objects.equals(emergencyPersonName, that.emergencyPersonName) && Objects.equals(permanentAddress, that.permanentAddress) && Objects.equals(currentAddress, that.currentAddress) && Objects.equals(country, that.country) && Objects.equals(state, that.state) && Objects.equals(district, that.district) && Objects.equals(pincode, that.pincode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contactId, user, primaryPhoneNo, secondaryPhoneNo, emergencyPhoneNumber, emergencyPersonName, permanentAddress, currentAddress, country, state, district, pincode);
    }

    public Long getContactId() {
        return contactId;
    }

    public void setContactId(Long contactId) {
        this.contactId = contactId;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public String getPrimaryPhoneNo() {
        return primaryPhoneNo;
    }

    public void setPrimaryPhoneNo(String primaryPhoneNo) {
        this.primaryPhoneNo = primaryPhoneNo;
    }

    public String getSecondaryPhoneNo() {
        return secondaryPhoneNo;
    }

    public void setSecondaryPhoneNo(String secondaryPhoneNo) {
        this.secondaryPhoneNo = secondaryPhoneNo;
    }

    public String getEmergencyPhoneNumber() {
        return emergencyPhoneNumber;
    }

    public void setEmergencyPhoneNumber(String emergencyPhoneNumber) {
        this.emergencyPhoneNumber = emergencyPhoneNumber;
    }

    public String getEmergencyPersonName() {
        return emergencyPersonName;
    }

    public void setEmergencyPersonName(String emergencyPersonName) {
        this.emergencyPersonName = emergencyPersonName;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
}
