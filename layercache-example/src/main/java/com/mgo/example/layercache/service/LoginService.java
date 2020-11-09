package com.mgo.example.layercache.service;

import com.github.xiaolyuh.annotation.Cacheable;
import com.github.xiaolyuh.annotation.FirstCache;
import com.github.xiaolyuh.annotation.SecondaryCache;
import com.mgo.example.layercache.constant.CachKeyPrefix;
import com.mgo.example.layercache.vo.UserVo;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author: shish@kltb.com.cn
 * @date: 2020-11-06 15:53
 * @desc:
 */
@Service
public class LoginService {

    @Cacheable(value = CachKeyPrefix.USER_INFO, key = "#userId + ':' + #name", depict = "用户信息缓存", enableFirstCache = true,
    firstCache = @FirstCache(expireTime = 4, timeUnit = TimeUnit.MINUTES),
    secondaryCache = @SecondaryCache(expireTime = 4, timeUnit = TimeUnit.MINUTES))
    public UserVo getUser(String userId, String name) {
        return UserVo.builder()
                .id(userId)
                .userName(name)
                .userPassword("123")
                .build();
    }
}
