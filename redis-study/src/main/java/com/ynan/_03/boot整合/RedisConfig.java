package com.ynan._03.boot整合;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * @program: redis-study
 * @description:
 * @author: yn
 * @create: 2021-07-01 21:42
 */
@Configuration
public class RedisConfig
{
    // @Autowired
    // private JedisConnectionFactory jedisConnectionFactory;
    //
    // @Bean
    // public RedisCacheManager cacheManager()
    // {
    //     // RedisCacheManager redisCacheManager = new RedisCacheManager(redisTemplate());
    //     return null;
    // }
    //
    // @SuppressWarnings("rawtypes")
    // private RedisTemplate redisTemplate()
    // {
    //     RedisTemplate<Object, Object> redisTemplate = new RedisTemplate<>();
    //     redisTemplate.setConnectionFactory(jedisConnectionFactory);
    //     // 开启事务
    //     redisTemplate.setEnableTransactionSupport(true);
    //     // 使用string序列化缓存键
    //     StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();
    //     redisTemplate.setKeySerializer(stringRedisSerializer);
    //     redisTemplate.setHashKeySerializer(stringRedisSerializer);
    //     return redisTemplate;
    // }
}
