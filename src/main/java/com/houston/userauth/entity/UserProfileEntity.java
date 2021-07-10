package com.houston.userauth.entity;

import com.houston.userauth.model.UserProfile;

import javax.persistence.*;

@Entity
@Table(name="USER_PROFILE")
public class UserProfileEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="USER_PROFILE_ID")
    private Long userProfileId;

    @Column(name="USER_ABOUT")
    private String userAbout;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userId", unique = true)
    private UserEntity user;

    public UserProfileEntity() {
        super();
    }

    public UserProfileEntity(UserProfile userProfile){
        super();
        this.userAbout = userProfile.getUserAbout();
        this.user = new UserEntity(userProfile.getUser());
    }

    public UserProfileEntity(
            String userAbout,
            UserEntity user
    ) {
        super();
        this.userAbout = userAbout;
        this.user = user;
    }
}
