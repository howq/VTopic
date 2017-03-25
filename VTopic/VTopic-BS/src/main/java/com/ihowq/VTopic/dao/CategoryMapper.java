package com.ihowq.VTopic.dao;

import com.ihowq.VTopic.model.Category;

/**
 * The interface Category mapper.
 */
public interface CategoryMapper {
    /**
     * Delete by primary key int.
     *
     * @param categoryid the categoryid
     * @return the int
     */
    int deleteByPrimaryKey(Long categoryid);

    /**
     * Insert int.
     *
     * @param record the record
     * @return the int
     */
    int insert(Category record);

    /**
     * Insert selective int.
     *
     * @param record the record
     * @return the int
     */
    int insertSelective(Category record);

    /**
     * Select by primary key category.
     *
     * @param categoryid the categoryid
     * @return the category
     */
    Category selectByPrimaryKey(Long categoryid);

    /**
     * Update by primary key selective int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKeySelective(Category record);

    /**
     * Update by primary key int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKey(Category record);
}