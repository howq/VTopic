package com.ihowq.VTopic.service.common;

import com.ihowq.VTopic.dto.CommonTopic;
import com.ihowq.VTopic.model.Topic;
import com.ihowq.VTopic.util.PageBean;
import org.springframework.dao.DataAccessException;

import javax.servlet.http.HttpServletRequest;
import java.security.DigestException;
import java.security.NoSuchAlgorithmException;

/**
 * The interface Topic service.
 *
 * @author howq
 * @create 2017 -03-25 15:50
 */
public interface TopicService {

    /**
     * 获取课题列表
     *
     * @param startPage the start page
     * @param pageSize  the page size
     * @param request   the request
     * @return the topics
     * @throws DataAccessException the data access exception
     */
    public PageBean<CommonTopic> getTopics(int startPage, int pageSize, HttpServletRequest request) throws DataAccessException;

    /**
     * Del topic.
     *
     * @param topicId the topic id
     * @param request the request
     * @throws DataAccessException      the data access exception
     * @throws DigestException          the digest exception
     * @throws NoSuchAlgorithmException the no such algorithm exception
     */
    public void delTopic(Long topicId, HttpServletRequest request) throws DataAccessException, DigestException, NoSuchAlgorithmException;

    /**
     * Save or update topic.
     *
     * @param topic    the topic
     * @param isUpdate the is update
     * @param request  the request
     * @throws DataAccessException      the data access exception
     * @throws DigestException          the digest exception
     * @throws NoSuchAlgorithmException the no such algorithm exception
     */
    public void saveOrUpdateTopic(Topic topic, boolean isUpdate, HttpServletRequest request) throws DataAccessException, DigestException, NoSuchAlgorithmException;

}
