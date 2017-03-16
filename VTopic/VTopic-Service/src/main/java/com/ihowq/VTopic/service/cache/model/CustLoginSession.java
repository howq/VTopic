package com.ihowq.VTopic.service.cache.model;

import com.ihowq.VTopic.model.UserInfo;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 登入用户会话
 *
 * @author howq
 * @create 2017-03-16 0:07
 **/
public class CustLoginSession extends BaseSession {

    private static final long serialVersionUID = -3758413896166051405L;

    private static final String INTERVAL = "><";

    /**
     * token序列
     */
    private String token;

    /**
     * 会话编号。
     */
    private String sessionId;

    /**
     * 上次验证的时间.
     */
    private long previousVerifyTimestamp = System.currentTimeMillis();

    /**
     * 用户信息
     */
    private UserInfo userInfo;

    /**
     * 请求数
     */
    private AtomicInteger requestCount;

    /**
     * 跳转路径
     */
    private String url;

    /**
     * Getter for property 'serialVersionUID'.
     *
     * @return Value for property 'serialVersionUID'.
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * Getter for property 'INTERVAL'.
     *
     * @return Value for property 'INTERVAL'.
     */
    public static String getINTERVAL() {
        return INTERVAL;
    }

    /**
     * Getter for property 'token'.
     *
     * @return Value for property 'token'.
     */
    public String getToken() {
        return token;
    }

    /**
     * Setter for property 'token'.
     *
     * @param token Value to set for property 'token'.
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * Getter for property 'sessionId'.
     *
     * @return Value for property 'sessionId'.
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Setter for property 'sessionId'.
     *
     * @param sessionId Value to set for property 'sessionId'.
     */
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * Getter for property 'previousVerifyTimestamp'.
     *
     * @return Value for property 'previousVerifyTimestamp'.
     */
    public long getPreviousVerifyTimestamp() {
        return previousVerifyTimestamp;
    }

    /**
     * Setter for property 'previousVerifyTimestamp'.
     *
     * @param previousVerifyTimestamp Value to set for property 'previousVerifyTimestamp'.
     */
    public void setPreviousVerifyTimestamp(long previousVerifyTimestamp) {
        this.previousVerifyTimestamp = previousVerifyTimestamp;
    }

    /**
     * Getter for property 'userInfo'.
     *
     * @return Value for property 'userInfo'.
     */
    public UserInfo getUserInfo() {
        return userInfo;
    }

    /**
     * Setter for property 'userInfo'.
     *
     * @param userInfo Value to set for property 'userInfo'.
     */
    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    /**
     * Getter for property 'requestCount'.
     *
     * @return Value for property 'requestCount'.
     */
    public AtomicInteger getRequestCount() {
        return requestCount;
    }

    /**
     * Setter for property 'requestCount'.
     *
     * @param requestCount Value to set for property 'requestCount'.
     */
    public void setRequestCount(AtomicInteger requestCount) {
        this.requestCount = requestCount;
    }

    /**
     * Getter for property 'url'.
     *
     * @return Value for property 'url'.
     */
    public String getUrl() {
        return url;
    }

    /**
     * Setter for property 'url'.
     *
     * @param url Value to set for property 'url'.
     */
    public void setUrl(String url) {
        this.url = url;
    }

}
