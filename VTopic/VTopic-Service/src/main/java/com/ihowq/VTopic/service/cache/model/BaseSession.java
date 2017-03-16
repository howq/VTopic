package com.ihowq.VTopic.service.cache.model;

import java.io.Serializable;

/**
 * 基础Session
 *
 * @author howq
 * @create 2017-03-16 0:03
 **/
public class BaseSession implements Serializable {

    private static final long serialVersionUID = 1537405693583814983L;


    /**
     * 学号/工号
     */
    protected String userid;

    /**
     * 角色id
     */
    protected String roleid;

    /**
     * 姓名.
     */
    protected String username;

    /**
     * Getter for property 'serialVersionUID'.
     *
     * @return Value for property 'serialVersionUID'.
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * Getter for property 'userid'.
     *
     * @return Value for property 'userid'.
     */
    public String getUserid() {
        return userid;
    }

    /**
     * Setter for property 'userid'.
     *
     * @param userid Value to set for property 'userid'.
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * Getter for property 'roleid'.
     *
     * @return Value for property 'roleid'.
     */
    public String getRoleid() {
        return roleid;
    }

    /**
     * Setter for property 'roleid'.
     *
     * @param roleid Value to set for property 'roleid'.
     */
    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    /**
     * Getter for property 'username'.
     *
     * @return Value for property 'username'.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Setter for property 'username'.
     *
     * @param username Value to set for property 'username'.
     */
    public void setUsername(String username) {
        this.username = username;
    }
}
