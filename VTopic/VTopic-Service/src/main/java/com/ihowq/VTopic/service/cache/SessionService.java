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
    public void createOrUpdateLoginSession(HttpServletRequest httpRequest, HttpServletResponse httpResponse, CustLoginSession loginSession) throws NoSuchAlgorithmException, DigestException {

        String path = "/";
        int cookieAge = -1;
        cookieAge = 60 * 60 * 24 * 30;
        String token = Md5CryptDigest.encodeMd5(loginSession.getUserInfo().getUsername() + System.currentTimeMillis() +  loginSession.getSessionId());
        loginSession.setToken(getSessionToken(token));
        AtomicInteger requestCount = new AtomicInteger(0);
        loginSession.setRequestCount(requestCount);

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

    private String getSessionToken(String token) {
        return VTopicConst.TOKEN + token;
    }
}
