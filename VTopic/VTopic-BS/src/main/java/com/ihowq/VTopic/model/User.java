package com.ihowq.VTopic.model;

import java.util.Date;

public class User {
    private String username;

    private Byte roleid;

    private String password;

    private Date logindatetimetime;

    private Date logoutdatetimetime;

    private String userstatus;

    private String sessionid;

    private String ipadd;

    private String blowser;

    private String creater;

    private Date creatdatetime;

    private String changer;

    private Date changedatetime;

    private String deleteman;

    private Date deletedatetime;

    private String deleteflg;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Byte getRoleid() {
        return roleid;
    }

    public void setRoleid(Byte roleid) {
        this.roleid = roleid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getLogindatetimetime() {
        return logindatetimetime;
    }

    public void setLogindatetimetime(Date logindatetimetime) {
        this.logindatetimetime = logindatetimetime;
    }

    public Date getLogoutdatetimetime() {
        return logoutdatetimetime;
    }

    public void setLogoutdatetimetime(Date logoutdatetimetime) {
        this.logoutdatetimetime = logoutdatetimetime;
    }

    public String getUserstatus() {
        return userstatus;
    }

    public void setUserstatus(String userstatus) {
        this.userstatus = userstatus == null ? null : userstatus.trim();
    }

    public String getSessionid() {
        return sessionid;
    }

    public void setSessionid(String sessionid) {
        this.sessionid = sessionid == null ? null : sessionid.trim();
    }

    public String getIpadd() {
        return ipadd;
    }

    public void setIpadd(String ipadd) {
        this.ipadd = ipadd == null ? null : ipadd.trim();
    }

    public String getBlowser() {
        return blowser;
    }

    public void setBlowser(String blowser) {
        this.blowser = blowser == null ? null : blowser.trim();
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