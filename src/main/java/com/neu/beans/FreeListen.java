package com.neu.beans;

public class FreeListen {//free listen class
    private int id;//primary key
    private String title;//class title
    private String imgurl;//class image url
    private String fdesc;//intro
    private String status;//class status
    private int qid;//company id(foreign)
    private int branchid;//class at branch id(foreign)
    private int pubtime;//publish time

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public String getFdesc() {
        return fdesc;
    }

    public void setFdesc(String fdesc) {
        this.fdesc = fdesc;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getQid() {
        return qid;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }

    public int getBranchid() {
        return branchid;
    }

    public void setBranchid(int branchid) {
        this.branchid = branchid;
    }

    public int getPubtime() {
        return pubtime;
    }

    public void setPubtime(int pubtime) {
        this.pubtime = pubtime;
    }
}
