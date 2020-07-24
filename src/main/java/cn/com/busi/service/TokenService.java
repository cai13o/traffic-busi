package cn.com.busi.service;

import cn.com.busi.entity.TUser;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @BelongsProject: traffic-busi
 * @BelongsPackage: cn.com.busi.service
 * @Author: Administrator
 * @CreateTime: 2020-07-23 08:59
 * @Description:
 */
@Service
public class TokenService {
    public String getToken(TUser tUser) {
        Date start = new Date();
        long currentTime = System.currentTimeMillis() + 60* 60 * 1000;//一小时有效时间
        Date end = new Date(currentTime);
        String token = "";

        token = JWT.create().withAudience(tUser.getUsername().toString()).withIssuedAt(start).withExpiresAt(end)
                .sign(Algorithm.HMAC256(tUser.getPassword()));
        return token;
    }
}
