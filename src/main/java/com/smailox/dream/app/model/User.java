package com.smailox.dream.app.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private long id;

    @Column
    private String userId;

    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String username;
    @Column
    private String password;
    @Column
    private String mail;
    @Column
    private String profileImageUrl;
    @Column
    private Date lastLoginDate;
    @Column
    private Date lastLoginDateDisplay;
    @Column
    private Date joinDate;
    @Column
    private String roles; //ROLE_USERS {read edit} ROLE_ADMIN {delete}
    @Column
    private String authorities;
    @Column
    private boolean isActive;
    @Column
    private boolean isNotLocked;

    public User() {
    }

    public User(long id, String userId, String firstName, String lastName, String password, String mail, String profileImageUrl, Date lastLoginDate, Date lastLoginDateDisplay, Date joinDate, String roles, String authorities, boolean isActive, boolean isNotLocked) {
        this.id = id;
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username =username;
        this.password = password;
        this.mail = mail;
        this.profileImageUrl = profileImageUrl;
        this.lastLoginDate = lastLoginDate;
        this.lastLoginDateDisplay = lastLoginDateDisplay;
        this.joinDate = joinDate;
        this.roles = roles;
        this.authorities = authorities;
        this.isActive = isActive;
        this.isNotLocked = isNotLocked;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public Date getLastLoginDateDisplay() {
        return lastLoginDateDisplay;
    }

    public void setLastLoginDateDisplay(Date lastLoginDateDisplay) {
        this.lastLoginDateDisplay = lastLoginDateDisplay;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getAuthorities() {
        return authorities;
    }

    public void setAuthorities(String authorities) {
        this.authorities = authorities;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isNotLocked() {
        return isNotLocked;
    }

    public void setNotLocked(boolean notLocked) {
        isNotLocked = notLocked;
    }

    public User(String username) {
        this.id = 0;
        this.userId = "userId";
        this.firstName = "firstName";
        this.lastName = "lastName";
        this.password = "pass";
        this.mail = "mail";
        this.profileImageUrl = "profileImageUrl";
        this.lastLoginDate = new Date();
        this.lastLoginDateDisplay = new Date();
        this.joinDate = new Date();
        this.roles = "ROLE_ADMIN";
        this.authorities = "Authority";
        this.isActive = true;
        this.isNotLocked = true;

    }
}
