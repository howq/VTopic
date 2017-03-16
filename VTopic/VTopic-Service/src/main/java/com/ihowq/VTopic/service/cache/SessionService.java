package com.ihowq.VTopic.service.cache;

import com.ihowq.VTopic.service.cache.model.CustLoginSession;
import com.ihowq.VTopic.util.Md5CryptDigest;
import com.ihowq.VTopic.util.common.VTopicConst;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.security.DigestException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Session Service
 *
 * @author howq
 * @create 2017-03-16 0:52
 **/
@Service(value = "sessionService")
public class SessionService {
    private static final Logger logger = LoggerFactory.getLogger(SessionService.class);

    @Resource
    private CacheService cacheService;

    /**
     * 更新或创建session并保存到redis缓存中
     * @throws DigestException
     * @throws NoSuchAlgorithmException
     */
    public void createOrUpdateLoginSession(HttpServletRequest httpRequest, HttpServletResponse httpResponse, CustLoginSession loginSession ,String rememberMe) throws NoSuchAlgorithmException, DigestException {

        String path = "/";
        int cookieAge = 60 *30;
        String token = Md5CryptDigest.encodeMd5(loginSession.getUserInfo().getUserid() + System.currentTimeMillis() +  loginSession.getSessionId());
        loginSession.setToken(getSessionToken(token));
        AtomicInteger requestCount = new AtomicInteger(0);
        loginSession.setRequestCount(requestCount);

        if(rememberMe.equals("on")){
            cookieAge = 60 * 60 * 24 * 30;
        }

        Cookie loginCookie = null;
        Cookie[] cookies = httpRequest.getCookies();
        String cookieNames = VTopicConst.COOKIE_NAME;

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookieNames.equals(cookie.getName())) {
                    loginCookie = cookie;
                    break;
                }
            }
        }

        if (loginCookie == null) {
            loginCookie = new Cookie(cookieNames, loginSession.getToken());
        } else {
            try {
                //cacheService.removeCustLoginSession(CustLoginSession.parseLoginCacheKey(loginCookie.getValue()));
                cacheService.removeCustLoginSession(loginCookie.getValue());
            } catch (Exception e) {
                logger.info("Remove cache data is not exists.");
            }

            loginCookie.setValue(loginSession.getToken());
        }

        /* 重新计算Cookie的过期时间。 */
        loginCookie.setPath(path);
        if (cookieAge > 0) {
            loginCookie.setMaxAge(cookieAge);
        }
        httpResponse.addCookie(loginCookie);

        httpRequest.setAttribute(cookieNames, loginSession);
        cacheService.setCustLoginSession(loginSession);
    }

    /**
     * 用于更新session信息
     * @throws DigestException
     * @throws NoSuchAlgorithmException
     */
    public CustLoginSession getSession(HttpServletRequest httpRequest) throws NoSuchAlgorithmException, DigestException {
        Cookie loginCookie = null;
        Cookie[] cookies = httpRequest.getCookies();
        String cookieNames = VTopicConst.COOKIE_NAME;

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookieNames.equals(cookie.getName())) {
                    loginCookie = cookie;
                    break;
                }
            }
        } else {
            return null;
        }

        if(loginCookie == null) {
            return null;
        }

        String userToken = loginCookie.getValue();
        CustLoginSession loginSession = cacheService.getCustLoginSession(userToken);
        if(loginSession == null) {
            return null;
        } else {
            cacheService.setCustLoginSession(loginSession);
        }

        return loginSession;
    }

    /**
     * 删除session
     */
    public void removeSession(HttpServletRequest httpRequest, HttpServletResponse response) throws Exception {
        Cookie loginCookie = null;
        Cookie[] cookies = httpRequest.getCookies();
        String cookieNames = VTopicConst.COOKIE_NAME;

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookieNames.equals(cookie.getName())) {
                    loginCookie = cookie;
                    break;
                }
            }
        }
        String userToken = loginCookie.getValue();
        cacheService.removeCustLoginSession(userToken);
        loginCookie.setPath("/");
        loginCookie.setMaxAge(0);
        response.addCookie(loginCookie);
    }

    /**
     * 把token添加入redis
     */
    private void addUserToken(String userid, String token) throws Exception {
        String md5UserName = Md5CryptDigest.encodeMd5(userid);
        List<String> tokenList = cacheService.getUserToken(md5UserName);
        if(tokenList == null) {
            tokenList = new ArrayList<String>();
        }
        tokenList.add(token);
        cacheService.saveUserToken(md5UserName, tokenList);
    }

    /**
     * 移除用户某个token
     */
    private void removeUserToken(String userid, String token) throws Exception {
        String md5UserName = Md5CryptDigest.encodeMd5(userid);
        List<String> tokenList = cacheService.getUserToken(md5UserName);
        tokenList.remove(token);
        cacheService.saveUserToken(md5UserName, tokenList);
    }

    /**
     * 移除用户的所有token
     */
    private void removeAllUserToken(String userid) throws Exception {
        List<String> tokenList = new ArrayList<String>();
        cacheService.saveUserToken(Md5CryptDigest.encodeMd5(userid), tokenList);
    }

    /**
     * token 令牌
     * @param token
     * @return
     */
    private String getSessionToken(String token) {
        return VTopicConst.TOKEN + token;
    }
}
