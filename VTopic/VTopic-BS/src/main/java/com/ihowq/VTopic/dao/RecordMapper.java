package com.ihowq.VTopic.dao;

import com.ihowq.VTopic.model.Record;

/**
 * The interface Record mapper.
 */
public interface RecordMapper {
    /**
     * Delete by primary key int.
     *
     * @param recordid the recordid
     * @return the int
     */
    int deleteByPrimaryKey(Long recordid);

    /**
     * Insert int.
     *
     * @param record the record
     * @return the int
     */
    int insert(Record record);

    /**
     * Insert selective int.
     *
     * @param record the record
     * @return the int
     */
    int insertSelective(Record record);

    /**
     * Select by primary key record.
     *
     * @param recordid the recordid
     * @return the record
     */
    Record selectByPrimaryKey(Long recordid);

//    List<CommonRecord> selectRecord(Record record);

    /**
     * Update by primary key selective int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKeySelective(Record record);

    /**
     * Update by primary key int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKey(Record record);
}