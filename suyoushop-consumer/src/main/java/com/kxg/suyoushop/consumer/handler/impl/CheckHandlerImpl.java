package com.kxg.suyoushop.consumer.handler.impl;

import com.kxg.suyoushop.consumer.handler.CheckHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * @program: suyoushop
 * @description:
 * @author: Jaysrr
 * @create: 2020-03-11 14:46
 **/
@Component
public class CheckHandlerImpl implements CheckHandler {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public Boolean checkSSOToken(String token) {
        if (StringUtils.isEmpty(token)) {
            return false;
        }
        //拿token去redis里看看有没有对应的值
        String tokenValue = stringRedisTemplate.opsForValue().get(token);
        if (StringUtils.isEmpty(tokenValue)) {
            return false;
        }
        return true;
    }
}
