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

    @Column(name="USER_PROFILE_IMG")
    private Byte[] userProfileImg;

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
            UserEntity user,
            Byte[] userProfileImg
    ) {
        super();
        this.userAbout = userAbout;
        this.user = user;
        this.userProfileImg = userProfileImg;
    }

    public Long getUserProfileId() {
        return userProfileId;
    }

    public void setUserProfileId(Long userProfileId) {
        this.userProfileId = userProfileId;
    }

    public String getUserAbout() {
        return userAbout;
    }

    public void setUserAbout(String userAbout) {
        this.userAbout = userAbout;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public Byte[] getUserProfileImg() {
        return userProfileImg;
    }

    public void setUserProfileImg(Byte[] userProfileImg) {
        this.userProfileImg = userProfileImg;
    }
}
