package com.ihowq.VTopic.model;

import java.util.Date;

public class UserInfo {
    private String userid;

    private Byte roleid;

    private String majorid;

    private String username;

    private String sextype;

    private String usertel;

    private String usermobile;

    private String useremail;

    private String creater;

    private Date creatdatetime;

    private String changer;

    private Date changedatetime;

    private String deleteman;

    private Date deletedatetime;

    private String deleteflg;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Byte getRoleid() {
        return roleid;
    }

    public void setRoleid(Byte roleid) {
        this.roleid = roleid;
    }

    public String getMajorid() {
        return majorid;
    }

    public void setMajorid(String majorid) {
        this.majorid = majorid == null ? null : majorid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getSextype() {
        return sextype;
    }

    public void setSextype(String sextype) {
        this.sextype = sextype == null ? null : sextype.trim();
    }

    public String getUsertel() {
        return usertel;
    }

    public void setUsertel(String usertel) {
        this.usertel = usertel == null ? null : usertel.trim();
    }

    public String getUsermobile() {
        return usermobile;
    }

    public void setUsermobile(String usermobile) {
        this.usermobile = usermobile == null ? null : usermobile.trim();
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail == null ? null : useremail.trim();
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