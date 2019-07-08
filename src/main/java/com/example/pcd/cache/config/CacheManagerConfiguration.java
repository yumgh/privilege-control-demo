package com.example.pcd.cache.config;

import com.example.pcd.cache.CacheType;
import lombok.Data;

/**
 * @author ming
 * @date 2019-06-24
 */
@Data
public class CacheManagerConfiguration {

    private CacheType defaultCache = CacheType.REDIS;

}
