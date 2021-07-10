package com.houston.userauth.model;

import com.houston.userauth.entity.UserEntity;


public class Contact {
    private Long contactId;
    private User user;
    private String primaryPhoneNo;
    private String secondaryPhoneNo;
    private String emergencyPhoneNumber;
    private String emergencyPersonName;
    private String permanentAddress;
    private String currentAddress;
    private String country;
    private String state;
    private String district;
    private String pincode;

    public Contact() {
        super();
    }

    public Contact(
            User user,
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

    public Long getContactId() {
        return contactId;
    }

    public void setContactId(Long contactId) {
        this.contactId = contactId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
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
