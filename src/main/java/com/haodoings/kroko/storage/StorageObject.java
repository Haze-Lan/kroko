package com.haodoings.kroko.storage;

/**
 * 集合对对应的存储对象封装
 */
public class StorageObject<E> {
    /**
     * 读索引
     */
    private Long readIndex = 0L;
    /**
     * 写索引
     */
    private Long writeIndex = 0L;



}
