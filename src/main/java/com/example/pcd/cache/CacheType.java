package com.example.pcd.cache;

/**
 * @author ming
 * @date 2019-07-08
 */
public enum CacheType {
    /** redis */
    REDIS("redis"),

    /** memcached */
    MEMCACHED("memcached"),

    /** guava */
    GUAVA("guava");

    private String name;

    CacheType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
