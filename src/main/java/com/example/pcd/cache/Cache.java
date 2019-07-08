package com.example.pcd.cache;

import java.util.concurrent.TimeUnit;

/**
 * @author ming
 * @date 2019-06-29
 */
public interface Cache<K, V> {

    void put(K key, V value, long ttl, TimeUnit timeUnit);

    V get(K key);

    void delete(K key);

    boolean exist(K key);
}
