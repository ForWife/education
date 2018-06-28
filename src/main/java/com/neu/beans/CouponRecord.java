package com.neu.beans;

import java.util.Date;

public class CouponRecord {//coupon get record
    private int id;//primary key
    private int cid;//coupon id (foreign)
    private String openid;//wechat openid
    private Date gettime;//get coupon time

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public Date getGettime() {
        return gettime;
    }

    public void setGettime(Date gettime) {
        this.gettime = gettime;
    }
}
