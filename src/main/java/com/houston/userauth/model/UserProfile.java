package com.houston.userauth.model;

import java.util.Arrays;
import java.util.Objects;

public class UserProfile {
    private long userProfileId;
    private String userAbout;
    private User user;
    private Byte[] userProfileImg;

    public UserProfile() {
        super();
    }

    public UserProfile(
            String userAbout,
            User user,
            Byte[] userProfileImg
    ) {
        this.userAbout = userAbout;
        this.user = user;
        this.userProfileImg = userProfileImg;
    }

    @Override
    public String toString() {
        return "UserProfile{" +
                "userProfileId=" + userProfileId +
                ", userAbout='" + userAbout + '\'' +
                ", user=" + user +
                ", userProfileImg=" + Arrays.toString(userProfileImg) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserProfile that = (UserProfile) o;
        return userProfileId == that.userProfileId && Objects.equals(userAbout, that.userAbout) && Objects.equals(user, that.user) && Arrays.equals(userProfileImg, that.userProfileImg);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(userProfileId, userAbout, user);
        result = 31 * result + Arrays.hashCode(userProfileImg);
        return result;
    }

    public Byte[] getUserProfileImg() {
        return userProfileImg;
    }

    public void setUserProfileImg(Byte[] userProfileImg) {
        this.userProfileImg = userProfileImg;
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
