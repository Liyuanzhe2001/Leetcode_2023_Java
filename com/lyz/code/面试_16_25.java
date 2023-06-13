package com.lyz.code;

import java.util.*;

public class 面试_16_25 {

    class LRUCache {

        // 数据-密钥
        Map<Integer, Integer> dataKey;
        int capacity;

        public LRUCache(int capacity) {
            dataKey = new LinkedHashMap<>(capacity);
            this.capacity = capacity;
        }

        public int get(int key) {
            if (!dataKey.containsKey(key)) {
                return -1;
            }
            Integer value = dataKey.remove(key);
            dataKey.put(key, value);
            return value;
        }

        public void put(int key, int value) {
            if(dataKey.containsKey(key)){
                dataKey.remove(key);
            }
            if (dataKey.size() == capacity) {
                Integer next = dataKey.keySet().iterator().next();
                dataKey.remove(next);
            }
            dataKey.put(key, value);
        }
    }

}
