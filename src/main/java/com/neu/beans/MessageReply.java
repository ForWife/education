package com.neu.beans;

import java.util.Date;

public class MessageReply {//reply of friend circle message
    private int id;//primary key
    private int mid;//message id
    private String content;//reply content
    private String nickname;//reply username
    private Date stime;//reply time

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
