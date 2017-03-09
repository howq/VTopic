package com.ihowq.VTopic.model;

public class RecordBookKey {
    private Long recordbookid;

    private String managerid;

    public Long getRecordbookid() {
        return recordbookid;
    }

    public void setRecordbookid(Long recordbookid) {
        this.recordbookid = recordbookid;
    }

    public String getManagerid() {
        return managerid;
    }

    public void setManagerid(String managerid) {
        this.managerid = managerid == null ? null : managerid.trim();
    }
}