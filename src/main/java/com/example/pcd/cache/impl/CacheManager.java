package com.example.pcd.cache.impl;

import com.example.pcd.cache.Cache;
import com.example.pcd.cache.CacheFactory;

import java.util.concurrent.TimeUnit;

/**
 * @author ming
 * @date 2019-06-24
 */
public class CacheManager<K, V> implements CacheFactory<K, V>, Cache<K, V>  {


    @Override
    public Cache cacheProvider() {
        return null;
    }

    @Override
    public void put(Object key, Object value, long ttl, TimeUnit timeUnit) {

    }

    @Override
    public V get(Object key) {
        return null;
    }

    @Override
    public void delete(Object key) {

    }

    @Override
    public boolean exist(Object key) {
        return false;
    }
}
