package com.app.agrilink360;

public class User {
    private String emailAddress;
    private String password;


    private String pnone;

    private String ageODB;
    private String place;
    private String fullName;

    public User(String emailAddress, String password, String pnone, String ageODB, String place, String fullName) {
        this.emailAddress = emailAddress;
        this.password = password;
        this.pnone = pnone;
        this.ageODB = ageODB;
        this.place = place;
        this.fullName = fullName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPnone() {
        return pnone;
    }

    public void setPnone(String pnone) {
        this.pnone = pnone;
    }

    public String getAgeODB() {
        return ageODB;
    }

    public void setAgeODB(String ageODB) {
        this.ageODB = ageODB;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
