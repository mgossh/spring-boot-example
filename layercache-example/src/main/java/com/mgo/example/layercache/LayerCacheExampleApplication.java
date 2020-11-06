package com.mgo.example.layercache;

import com.github.xiaolyuh.cache.config.EnableLayeringCache;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 *
 * @author huaijin
 */
@SpringBootApplication
@EnableLayeringCache
public class LayerCacheExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(LayerCacheExampleApplication.class, args);
    }
}
