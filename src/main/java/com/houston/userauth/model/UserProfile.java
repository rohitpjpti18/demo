package com.houston.userauth.model;

public class UserProfile {
    private long userProfileId;
    private String userAbout;
    private User user;

    public UserProfile() {
        super();
    }

    public UserProfile(
            String userAbout,
            User user) {
        this.userAbout = userAbout;
        this.user = user;
    }

    public long getUserProfileId() {
        return userProfileId;
    }

    public void setUserProfileId(long userProfileId) {
        this.userProfileId = userProfileId;
    }

    public String getUserAbout() {
        return userAbout;
    }

    public void setUserAbout(String userAbout) {
        this.userAbout = userAbout;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
