package com.ihowq.VTopic.dao;

import com.ihowq.VTopic.dto.CommonMajor;
import com.ihowq.VTopic.model.Major;

import java.util.List;

/**
 * The interface Major mapper.
 */
public interface MajorMapper {

    List<CommonMajor> selectMajor();

    /**
     * Delete by primary key int.
     *
     * @param majorid the majorid
     * @return the int
     */
    int deleteByPrimaryKey(Long majorid);

    /**
     * Insert int.
     *
     * @param record the record
     * @return the int
     */
    int insert(Major record);

    /**
     * Insert selective int.
     *
     * @param record the record
     * @return the int
     */
    int insertSelective(Major record);

    /**
     * Select by primary key major.
     *
     * @param majorid the majorid
     * @return the major
     */
    Major selectByPrimaryKey(Long majorid);

    /**
     * Update by primary key selective int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKeySelective(Major record);

    /**
     * Update by primary key int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKey(Major record);
}