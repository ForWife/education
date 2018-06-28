package com.neu.beans;

public class Enterprise {
    private int qid;//company id
    private String name;//company name
    private String videopath;//video intro path
    private String introduction;//company intro
    private String jczs;//rich text intro

    public int getQid() {
        return qid;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVideopath() {
        return videopath;
    }

    public void setVideopath(String videopath) {
        this.videopath = videopath;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getJczs() {
        return jczs;
    }

    public void setJczs(String jczs) {
        this.jczs = jczs;
    }
}
