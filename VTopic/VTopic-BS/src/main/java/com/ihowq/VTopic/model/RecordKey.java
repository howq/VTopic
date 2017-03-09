package com.ihowq.VTopic.model;

public class RecordKey {
    private Long recordid;

    private Long topicid;

    private String student;

    private String teacher;

    public Long getRecordid() {
        return recordid;
    }

    public void setRecordid(Long recordid) {
        this.recordid = recordid;
    }

    public Long getTopicid() {
        return topicid;
    }

    public void setTopicid(Long topicid) {
        this.topicid = topicid;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student == null ? null : student.trim();
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher == null ? null : teacher.trim();
    }
}