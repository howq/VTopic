package com.ihowq.VTopic.dao;

import com.ihowq.VTopic.dto.CommonRecordBook;
import com.ihowq.VTopic.model.RecordBook;

import java.util.List;

/**
 * The interface Record book mapper.
 */
public interface RecordBookMapper {
    /**
     * Delete by primary key int.
     *
     * @param recordbookid the recordbookid
     * @return the int
     */
    int deleteByPrimaryKey(Long recordbookid);

    /**
     * Insert int.
     *
     * @param record the record
     * @return the int
     */
    int insert(RecordBook record);

    /**
     * Insert selective int.
     *
     * @param record the record
     * @return the int
     */
    int insertSelective(RecordBook record);

    /**
     * Select by primary key record book.
     *
     * @param recordbookid the recordbookid
     * @return the record book
     */
    RecordBook selectByPrimaryKey(Long recordbookid);

    /**
     * Is open select list.
     *
     * @return the list
     */
    List<CommonRecordBook> isOpenSelect();

    /**
     * Select record book list.
     *
     * @return the list
     */
    List<CommonRecordBook> selectRecordBook();

    /**
     * Update by primary key selective int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKeySelective(RecordBook record);

    /**
     * Update by primary key int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKey(RecordBook record);
}