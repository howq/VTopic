package com.ihowq.VTopic.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * The type VTopic config.
 *
 * 项目设定代理类、 取得各种定义设定值
 *
 * @author howq
 * @create 2017 -03-28 10:02
 */
@Service
public class VTConfig {

    /**
     * Login ip地址
     **/
    @Value("${vtopic.login.host}")
    private String loginHost;

    /**
     * 前台ip地址
     **/
    @Value("${vtopic.frontend.host}")
    private String frontendHost;

    /**
     * 后台ip地址
     **/
    @Value("${vtopic.backend.host}")
    private String backendHost;

    /**
     * Login项目端口
     **/
    @Value("${vtopic.login.port}")
    private String loginPort;

    /**
     * 前台项目端口
     **/
    @Value("${vtopic.frontend.port}")
    private String frontendPort;

    /**
     * 后台项目端口
     **/
    @Value("${vtopic.backend.port}")
    private String backendPort;

    /**
     * Login项目名称
     **/
    @Value("${vtopic.login.project}")
    private String loginProjectName;

    /**
     * 前台项目名称
     **/
    @Value("${vtopic.frontend.project}")
    private String frontendProjectName;

    /**
     * 后台项目名称
     **/
    @Value("${vtopic.backend.project}")
    private String backendProjectName;

    /**
     * Getter for property 'loginHost'.
     *
     * @return Value for property 'loginHost'.
     */
    public String getLoginHost() {
        return loginHost;
    }

    /**
     * Setter for property 'loginHost'.
     *
     * @param loginHost Value to set for property 'loginHost'.
     */
    public void setLoginHost(String loginHost) {
        this.loginHost = loginHost;
    }

    /**
     * Getter for property 'frontendHost'.
     *
     * @return Value for property 'frontendHost'.
     */
    public String getFrontendHost() {
        return frontendHost;
    }

    /**
     * Setter for property 'frontendHost'.
     *
     * @param frontendHost Value to set for property 'frontendHost'.
     */
    public void setFrontendHost(String frontendHost) {
        this.frontendHost = frontendHost;
    }

    /**
     * Getter for property 'backendHost'.
     *
     * @return Value for property 'backendHost'.
     */
    public String getBackendHost() {
        return backendHost;
    }

    /**
     * Setter for property 'backendHost'.
     *
     * @param backendHost Value to set for property 'backendHost'.
     */
    public void setBackendHost(String backendHost) {
        this.backendHost = backendHost;
    }

    /**
     * Getter for property 'loginPort'.
     *
     * @return Value for property 'loginPort'.
     */
    public String getLoginPort() {
        return loginPort;
    }

    /**
     * Setter for property 'loginPort'.
     *
     * @param loginPort Value to set for property 'loginPort'.
     */
    public void setLoginPort(String loginPort) {
        this.loginPort = loginPort;
    }

    /**
     * Getter for property 'frontendPort'.
     *
     * @return Value for property 'frontendPort'.
     */
    public String getFrontendPort() {
        return frontendPort;
    }

    /**
     * Setter for property 'frontendPort'.
     *
     * @param frontendPort Value to set for property 'frontendPort'.
     */
    public void setFrontendPort(String frontendPort) {
        this.frontendPort = frontendPort;
    }

    /**
     * Getter for property 'backendPort'.
     *
     * @return Value for property 'backendPort'.
     */
    public String getBackendPort() {
        return backendPort;
    }

    /**
     * Setter for property 'backendPort'.
     *
     * @param backendPort Value to set for property 'backendPort'.
     */
    public void setBackendPort(String backendPort) {
        this.backendPort = backendPort;
    }

    /**
     * Getter for property 'loginProjectName'.
     *
     * @return Value for property 'loginProjectName'.
     */
    public String getLoginProjectName() {
        return loginProjectName;
    }

    /**
     * Setter for property 'loginProjectName'.
     *
     * @param loginProjectName Value to set for property 'loginProjectName'.
     */
    public void setLoginProjectName(String loginProjectName) {
        this.loginProjectName = loginProjectName;
    }

    /**
     * Getter for property 'frontendProjectName'.
     *
     * @return Value for property 'frontendProjectName'.
     */
    public String getFrontendProjectName() {
        return frontendProjectName;
    }

    /**
     * Setter for property 'frontendProjectName'.
     *
     * @param frontendProjectName Value to set for property 'frontendProjectName'.
     */
    public void setFrontendProjectName(String frontendProjectName) {
        this.frontendProjectName = frontendProjectName;
    }

    /**
     * Getter for property 'backendProjectName'.
     *
     * @return Value for property 'backendProjectName'.
     */
    public String getBackendProjectName() {
        return backendProjectName;
    }

    /**
     * Setter for property 'backendProjectName'.
     *
     * @param backendProjectName Value to set for property 'backendProjectName'.
     */
    public void setBackendProjectName(String backendProjectName) {
        this.backendProjectName = backendProjectName;
    }
}
