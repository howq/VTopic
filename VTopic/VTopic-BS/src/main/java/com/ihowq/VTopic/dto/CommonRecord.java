package com.ihowq.VTopic.dto;

/**
 * Record View 表现层
 *
 * @author howq
 * @create 2017-03-25 13:49
 **/
public class CommonRecord {

    private Long recordid;

    private Long topicid;

    private String student;

    private String teacher;

    private String operater;

    private String status;

    /**
     * Getter for property 'status'.
     *
     * @return Value for property 'status'.
     */
    public String getStatus() {
        return status;
    }

    /**
     * Setter for property 'status'.
     *
     * @param status Value to set for property 'status'.
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Getter for property 'recordid'.
     *
     * @return Value for property 'recordid'.
     */
    public Long getRecordid() {
        return recordid;
    }

    /**
     * Setter for property 'recordid'.
     *
     * @param recordid Value to set for property 'recordid'.
     */
    public void setRecordid(Long recordid) {
        this.recordid = recordid;
    }

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
     * Getter for property 'student'.
     *
     * @return Value for property 'student'.
     */
    public String getStudent() {
        return student;
    }

    /**
     * Setter for property 'student'.
     *
     * @param student Value to set for property 'student'.
     */
    public void setStudent(String student) {
        this.student = student;
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

    /**
     * Getter for property 'operater'.
     *
     * @return Value for property 'operater'.
     */
    public String getOperater() {
        return operater;
    }

    /**
     * Setter for property 'operater'.
     *
     * @param operater Value to set for property 'operater'.
     */
    public void setOperater(String operater) {
        this.operater = operater;
    }
}
