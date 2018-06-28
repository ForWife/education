package com.neu.beans;

import java.util.Date;

public class MessageLike {//who like the friend circle message
    private int id;//primary key
    private int mid;//message id(foregin)
    private String nickname;//like username
    private Date stime;//like time

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Date getStime() {
        return stime;
    }

    public void setStime(Date stime) {
        this.stime = stime;
    }
}
