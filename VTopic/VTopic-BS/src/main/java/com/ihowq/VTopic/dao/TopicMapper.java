package com.ihowq.VTopic.dao;

import com.ihowq.VTopic.dto.CommonTopic;
import com.ihowq.VTopic.model.Topic;

import java.util.List;

/**
 * The interface Topic mapper.
 */
public interface TopicMapper {
    /**
     * Delete by primary key int.
     *
     * @param topicid the topicid
     * @return the int
     */
    int deleteByPrimaryKey(Long topicid);

    /**
     * Insert int.
     *
     * @param record the record
     * @return the int
     */
    int insert(Topic record);

    /**
     * Insert selective int.
     *
     * @param record the record
     * @return the int
     */
    int insertSelective(Topic record);

    /**
     * Select by primary key topic.
     *
     * @param topicid the topicid
     * @return the topic
     */
    Topic selectByPrimaryKey(Long topicid);

    /**
     * Select with manager list.
     *
     * @param userId the user id
     * @return the list
     */
    List<CommonTopic> selectWithManager(String userId);

    /**
     * Select with teacher list.
     *
     * @param userId the user id
     * @return the list
     */
    List<CommonTopic> selectWithTeacher(String userId);


    /**
     * Select with student list.
     *
     * @param userId the user id
     * @return the list
     */
    List<CommonTopic> selectWithStudent(String userId);

    /**
     * Update by primary key selective int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKeySelective(Topic record);

    /**
     * Update by primary key int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKey(Topic record);
}