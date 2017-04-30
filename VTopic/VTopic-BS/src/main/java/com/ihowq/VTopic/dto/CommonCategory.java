package com.ihowq.VTopic.dto;

/**
 * The type Common category.
 *
 * @author howq
 * @create 2017 -04-30 下午12:07
 */
public class CommonCategory {

    private Long categoryid;

    private String categoryname;

    private String categoryinfo;

    /**
     * Gets categoryid.
     *
     * @return the categoryid
     */
    public Long getCategoryid() {
        return categoryid;
    }

    /**
     * Sets categoryid.
     *
     * @param categoryid the categoryid
     */
    public void setCategoryid(Long categoryid) {
        this.categoryid = categoryid;
    }

    /**
     * Gets categoryname.
     *
     * @return the categoryname
     */
    public String getCategoryname() {
        return categoryname;
    }

    /**
     * Sets categoryname.
     *
     * @param categoryname the categoryname
     */
    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }

    /**
     * Gets categoryinfo.
     *
     * @return the categoryinfo
     */
    public String getCategoryinfo() {
        return categoryinfo;
    }

    /**
     * Sets categoryinfo.
     *
     * @param categoryinfo the categoryinfo
     */
    public void setCategoryinfo(String categoryinfo) {
        this.categoryinfo = categoryinfo;
    }
}