package com.example.fooddelivery;

public class UserDetails {

    private String userName;
    private String userPwd;
    private String userEmail;
    private String userPhone;
    private String userRetype;

    public UserDetails(String userName, String userPwd, String userEmail, String userPhone) {
        this.userName = userName;
        this.userPwd = userPwd;
        this.userEmail = userEmail;
        this.userPhone = userPhone;
        this.userRetype = userRetype;
        System.out.printf(userEmail);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserRetype() {
        return userRetype;
    }

    public void setUserRetype(String userRetype) {
        this.userRetype = userRetype;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "userName='" + userName + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userRetype='" + userRetype + '\'' +
                '}';
    }
}