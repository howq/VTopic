package com.ihowq.VTopic.dto;

/**
 * @author howq
 * @create 2017-03-25 16:19
 **/
public class CommonTopic {

    private Long topicid;

    private String topicname;

    private String topiccoment;

    private Integer categoryid;

    private String categoryname;

    private String majoeid;

    private Byte limitnum;

    private String teacher;

    /**
     * Getter for property 'topicid'.
     *
     * @return Value for property 'topicid'.
     */
    public Long getTopicid() {
        return topicid;
    }

    /**
     * Setter for property 'topicid'.
     *
     * @param topicid Value to set for property 'topicid'.
     */
    public void setTopicid(Long topicid) {
        this.topicid = topicid;
    }

    /**
     * Getter for property 'categoryname'.
     *
     * @return Value for property 'categoryname'.
     */
    public String getCategoryname() {
        return categoryname;
    }

    /**
     * Setter for property 'categoryname'.
     *
     * @param categoryname Value to set for property 'categoryname'.
     */
    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }

    /**
     * Getter for property 'topicname'.
     *
     * @return Value for property 'topicname'.
     */
    public String getTopicname() {
        return topicname;
    }

    /**
     * Setter for property 'topicname'.
     *
     * @param topicname Value to set for property 'topicname'.
     */
    public void setTopicname(String topicname) {
        this.topicname = topicname;
    }

    /**
     * Getter for property 'topiccoment'.
     *
     * @return Value for property 'topiccoment'.
     */
    public String getTopiccoment() {
        return topiccoment;
    }

    /**
     * Setter for property 'topiccoment'.
     *
     * @param topiccoment Value to set for property 'topiccoment'.
     */
    public void setTopiccoment(String topiccoment) {
        this.topiccoment = topiccoment;
    }

    /**
     * Getter for property 'categoryid'.
     *
     * @return Value for property 'categoryid'.
     */
    public Integer getCategoryid() {
        return categoryid;
    }

    /**
     * Setter for property 'categoryid'.
     *
     * @param categoryid Value to set for property 'categoryid'.
     */
    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    /**
     * Getter for property 'majoeid'.
     *
     * @return Value for property 'majoeid'.
     */
    public String getMajoeid() {
        return majoeid;
    }

    /**
     * Setter for property 'majoeid'.
     *
     * @param majoeid Value to set for property 'majoeid'.
     */
    public void setMajoeid(String majoeid) {
        this.majoeid = majoeid;
    }

    /**
     * Getter for property 'limitnum'.
     *
     * @return Value for property 'limitnum'.
     */
    public Byte getLimitnum() {
        return limitnum;
    }

    /**
     * Setter for property 'limitnum'.
     *
     * @param limitnum Value to set for property 'limitnum'.
     */
    public void setLimitnum(Byte limitnum) {
        this.limitnum = limitnum;
    }

    /**
     * Getter for property 'teacher'.
     *
     * @return Value for property 'teacher'.
     */
    public String getTeacher() {
        return teacher;
    }

    /**
     * Setter for property 'teacher'.
     *
     * @param teacher Value to set for property 'teacher'.
     */
    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
}
