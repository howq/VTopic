package com.ihowq.model;

import java.util.Date;

public class Topic {
    private Long topicid;

    private String topicname;

    private String topiccoment;

    private Integer categoryid;

    private String majoeid;

    private Byte limitnum;

    private String teacher;

    private String creater;

    private Date creatdatetime;

    private String changer;

    private Date changedatetime;

    private String deleteman;

    private Date deletedatetime;

    private String deleteflg;

    public Long getTopicid() {
        return topicid;
    }

    public void setTopicid(Long topicid) {
        this.topicid = topicid;
    }

    public String getTopicname() {
        return topicname;
    }

    public void setTopicname(String topicname) {
        this.topicname = topicname == null ? null : topicname.trim();
    }

    public String getTopiccoment() {
        return topiccoment;
    }

    public void setTopiccoment(String topiccoment) {
        this.topiccoment = topiccoment == null ? null : topiccoment.trim();
    }

    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    public String getMajoeid() {
        return majoeid;
    }

    public void setMajoeid(String majoeid) {
        this.majoeid = majoeid == null ? null : majoeid.trim();
    }

    public Byte getLimitnum() {
        return limitnum;
    }

    public void setLimitnum(Byte limitnum) {
        this.limitnum = limitnum;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher == null ? null : teacher.trim();
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