package com.ihowq.VTopic.model;

import java.util.Date;

public class Role {
    private Byte roleid;

    private String roleauthoriy;

    private String rolename;

    private String rolecoment;

    private String creater;

    private Date creatdatetime;

    private String changer;

    private Date changedatetime;

    private String deleteman;

    private Date deletedatetime;

    private String deleteflg;

    public Byte getRoleid() {
        return roleid;
    }

    public void setRoleid(Byte roleid) {
        this.roleid = roleid;
    }

    public String getRoleauthoriy() {
        return roleauthoriy;
    }

    public void setRoleauthoriy(String roleauthoriy) {
        this.roleauthoriy = roleauthoriy == null ? null : roleauthoriy.trim();
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public String getRolecoment() {
        return rolecoment;
    }

    public void setRolecoment(String rolecoment) {
        this.rolecoment = rolecoment == null ? null : rolecoment.trim();
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