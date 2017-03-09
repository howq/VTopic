package com.ihowq.model;

import java.util.Date;

public class Major {
    private Long majorid;

    private String majorname;

    private String majorinfo;

    private String creater;

    private Date creatdatetime;

    private String changer;

    private Date changedatetime;

    private String deleteman;

    private Date deletedatetime;

    private String deleteflg;

    public Long getMajorid() {
        return majorid;
    }

    public void setMajorid(Long majorid) {
        this.majorid = majorid;
    }

    public String getMajorname() {
        return majorname;
    }

    public void setMajorname(String majorname) {
        this.majorname = majorname == null ? null : majorname.trim();
    }

    public String getMajorinfo() {
        return majorinfo;
    }

    public void setMajorinfo(String majorinfo) {
        this.majorinfo = majorinfo == null ? null : majorinfo.trim();
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    public Date getCreatdatetime() {
        return creatdatetime;
    }

    public void setCreatdatetime(Date creatdatetime) {
        this.creatdatetime = creatdatetime;
    }

    public String getChanger() {
        return changer;
    }

    public void setChanger(String changer) {
        this.changer = changer == null ? null : changer.trim();
    }

    public Date getChangedatetime() {
        return changedatetime;
    }

    public void setChangedatetime(Date changedatetime) {
        this.changedatetime = changedatetime;
    }

    public String getDeleteman() {
        return deleteman;
    }

    public void setDeleteman(String deleteman) {
        this.deleteman = deleteman == null ? null : deleteman.trim();
    }

    public Date getDeletedatetime() {
        return deletedatetime;
    }

    public void setDeletedatetime(Date deletedatetime) {
        this.deletedatetime = deletedatetime;
    }

    public String getDeleteflg() {
        return deleteflg;
    }

    public void setDeleteflg(String deleteflg) {
        this.deleteflg = deleteflg == null ? null : deleteflg.trim();
    }
}