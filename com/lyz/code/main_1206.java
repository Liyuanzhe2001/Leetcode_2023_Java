package com.lyz.code;

public class main_1206 {
    class Skiplist {

        int[] count;

        public Skiplist() {
            count = new int[20001];
        }

        public boolean search(int target) {
            return count[target] > 0;
        }

        public void add(int num) {
            count[num]++;
        }

        public boolean erase(int num) {
            if (count[num] == 0) {
                return false;
            }
            count[num]--;
            return true;
        }
    }
}
