package com.lyz.code;

public class main_2526 {


}


class DataStream {

    int value;
    int k;
    int cnt = 0;

    public DataStream(int value, int k) {
        this.value = value;
        this.k = k;
    }

    public boolean consec(int num) {
        if(value == num) {
            cnt ++;
        }else {
            cnt = 0;
        }
        if (cnt >= k) {
            return true;
        }
        return false;
    }
}
