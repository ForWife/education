package com.neu.beans;

public class LessonBranch {//quality class belong
    private int id;//primary key
    private int lid;//quality class id(foreign)
    private int branchid;//branch id (foreign)

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public int getBranchid() {
        return branchid;
    }

    public void setBranchid(int branchid) {
        this.branchid = branchid;
    }
}
