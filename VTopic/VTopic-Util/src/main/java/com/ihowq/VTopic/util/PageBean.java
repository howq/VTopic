package com.ihowq.VTopic.util;

import com.github.pagehelper.Page;

import java.io.Serializable;
import java.util.List;

/**
 * 分页查询Bean
 *
 * @author howq
 * @create 2017-03-24 23:50
 **/
public class PageBean<T> implements Serializable {
    private static final long serialVersionUID = 8656597559014685635L;
    private long total;        //总记录数
    private List<T> list;    //结果集
    private int pageNum;    // 第几页
    private int pageSize;    // 每页记录数
    private int pages;        // 总页数
    private int size;        // 当前页的数量 <= pageSize，该属性来自ArrayList的size属性

    /**
     * 包装Page对象，因为直接返回Page对象，在JSON处理以及其他情况下会被当成List来处理，
     * 而出现一些问题。
     *
     * @param list
     */
    public PageBean(List<T> list) {
        if (list instanceof Page) {
            Page<T> page = (Page<T>) list;
            this.pageNum = page.getPageNum();
            this.pageSize = page.getPageSize();
            this.total = page.getTotal();
            this.pages = page.getPages();
            this.list = page;
            this.size = page.size();
        }
    }

    /**
     * Getter for property 'total'.
     *
     * @return Value for property 'total'.
     */
    public long getTotal() {
        return total;
    }

    /**
     * Setter for property 'total'.
     *
     * @param total Value to set for property 'total'.
     */
    public void setTotal(long total) {
        this.total = total;
    }

    /**
     * Getter for property 'list'.
     *
     * @return Value for property 'list'.
     */
    public List<T> getList() {
        return list;
    }

    /**
     * Setter for property 'list'.
     *
     * @param list Value to set for property 'list'.
     */
    public void setList(List<T> list) {
        this.list = list;
    }

    /**
     * Getter for property 'pageNum'.
     *
     * @return Value for property 'pageNum'.
     */
    public int getPageNum() {
        return pageNum;
    }

    /**
     * Setter for property 'pageNum'.
     *
     * @param pageNum Value to set for property 'pageNum'.
     */
    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    /**
     * Getter for property 'pageSize'.
     *
     * @return Value for property 'pageSize'.
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * Setter for property 'pageSize'.
     *
     * @param pageSize Value to set for property 'pageSize'.
     */
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * Getter for property 'pages'.
     *
     * @return Value for property 'pages'.
     */
    public int getPages() {
        return pages;
    }

    /**
     * Setter for property 'pages'.
     *
     * @param pages Value to set for property 'pages'.
     */
    public void setPages(int pages) {
        this.pages = pages;
    }

    /**
     * Getter for property 'size'.
     *
     * @return Value for property 'size'.
     */
    public int getSize() {
        return size;
    }

    /**
     * Setter for property 'size'.
     *
     * @param size Value to set for property 'size'.
     */
    public void setSize(int size) {
        this.size = size;
    }
}