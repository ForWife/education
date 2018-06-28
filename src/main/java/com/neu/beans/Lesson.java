package com.neu.beans;

import java.util.Date;

public class Lesson {//quality class
    private int lid;//quality class id
    private String lname;//class name
    private String imgurl;//class image url
    private float price;//class price
    private String ldesc;//rich text class intro
    private String status;//class status
    private String category;//class category
    private int qid;//company id (foreign)
    private Date pubtime;//class publish time

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getLdesc() {
        return ldesc;
    }

    public void setLdesc(String ldesc) {
        this.ldesc = ldesc;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQid() {
        return qid;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }

    public Date getPubtime() {
        return pubtime;
    }

    public void setPubtime(Date pubtime) {
        this.pubtime = pubtime;
    }
}
