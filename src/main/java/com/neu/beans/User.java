package com.neu.beans;

public class User {//backend admin user
    private String username;//admin username
    private String uesrpassword;//admin password
    private int qid;//which company id (foreign)
    private String jurisdiction;//account privilige
    private int id;//primary key

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUesrpassword() {
        return uesrpassword;
    }

    public void setUesrpassword(String uesrpassword) {
        this.uesrpassword = uesrpassword;
    }

    public int getQid() {
        return qid;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
