package com.ihowq.VTopic.dto;

/**
 * The type Common major.
 *
 * @author howq
 * @create 2017 -04-30 下午12:04
 */
public class CommonMajor {

    private Long majorid;

    private String majorname;

    private String majorinfo;

    /**
     * Gets majorid.
     *
     * @return the majorid
     */
    public Long getMajorid() {
        return majorid;
    }

    /**
     * Sets majorid.
     *
     * @param majorid the majorid
     */
    public void setMajorid(Long majorid) {
        this.majorid = majorid;
    }

    /**
     * Gets majorname.
     *
     * @return the majorname
     */
    public String getMajorname() {
        return majorname;
    }

    /**
     * Sets majorname.
     *
     * @param majorname the majorname
     */
    public void setMajorname(String majorname) {
        this.majorname = majorname;
    }

    /**
     * Gets majorinfo.
     *
     * @return the majorinfo
     */
    public String getMajorinfo() {
        return majorinfo;
    }

    /**
     * Sets majorinfo.
     *
     * @param majorinfo the majorinfo
     */
    public void setMajorinfo(String majorinfo) {
        this.majorinfo = majorinfo;
    }
}