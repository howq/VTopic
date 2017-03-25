package com.ihowq.VTopic.service.topic;

import com.ihowq.VTopic.dto.CommonTopic;
import com.ihowq.VTopic.util.PageBean;
import org.springframework.dao.DataAccessException;

import javax.servlet.http.HttpServletRequest;

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

}
