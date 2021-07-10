package com.houston.userauth.entity;

import java.util.Date;

import javax.persistence.*;

import com.houston.userauth.model.User;

@Entity
@Table(name="USER")
public class UserEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="USER_ID")
    private Long userId;

    @Column(name="USER_NAME")
    private String userName;

    @Column(name="FIRST_NAME")
    private String firstName;

    @Column(name="LAST_NAME")
    private String lastName;

    @Column(name="EMAIL")
    private String email;

    @Column(name="PASSWORD")
    private String password;

    @Column(name="DATE_OF_BIRTH")
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

    public UserEntity() {
        super();
    }

    public UserEntity(User user){
        super();
        this.userId = user.getUserId();
        this.userName = user.getUserName();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.email = user.getEmail();
        this.password = user.getPassword();
        this.dateOfBirth = user.getDateOfBirth();
    }

    public UserEntity(
        Long userId, 
        String userName, 
        String firstName, 
        String lastName, 
        String email, 
        String password,
        Date dateOfBirth
    ) {
        super();
        this.userId = userId;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
    }


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}   
