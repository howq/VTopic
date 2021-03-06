package com.ihowq.VTopic.dto;

import java.util.Date;

/**
 * RecordBook View表现层
 *
 * @author howq
 * @create 2017-03-25 13:16
 **/
public class CommonRecordBook {

    private Long recordbookid;

    private String vyear;

    private String starttime;

    private String endtime;

    private String managerid;

    /**
     * Getter for property 'recordbookid'.
     *
     * @return Value for property 'recordbookid'.
     */
    public Long getRecordbookid() {
        return recordbookid;
    }

    /**
     * Setter for property 'recordbookid'.
     *
     * @param recordbookid Value to set for property 'recordbookid'.
     */
    public void setRecordbookid(Long recordbookid) {
        this.recordbookid = recordbookid;
    }

    /**
     * Getter for property 'vyear'.
     *
     * @return Value for property 'vyear'.
     */
    public String getVyear() {
        return vyear;
    }

    /**
     * Setter for property 'vyear'.
     *
     * @param vyear Value to set for property 'vyear'.
     */
    public void setVyear(String vyear) {
        this.vyear = vyear;
    }

    /**
     * Getter for property 'starttime'.
     *
     * @return Value for property 'starttime'.
     */
    public String getStarttime() {
        return starttime;
    }

    /**
     * Setter for property 'starttime'.
     *
     * @param starttime Value to set for property 'starttime'.
     */
    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    /**
     * Getter for property 'endtime'.
     *
     * @return Value for property 'endtime'.
     */
    public String getEndtime() {
        return endtime;
    }

    /**
     * Setter for property 'endtime'.
     *
     * @param endtime Value to set for property 'endtime'.
     */
    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    /**
     * Getter for property 'managerid'.
     *
     * @return Value for property 'managerid'.
     */
    public String getManagerid() {
        return managerid;
    }

    /**
     * Setter for property 'managerid'.
     *
     * @param managerid Value to set for property 'managerid'.
     */
    public void setManagerid(String managerid) {
        this.managerid = managerid;
    }
}
