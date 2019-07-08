package com.example.pcd.cache;

/**
 * @author ming
 * @date 2019-07-08
 */
public interface CacheFactory<K, V> {

    /**
     * 返回具体的缓存实现类
     *
     * @return
     */
    Cache cacheProvider();
}
