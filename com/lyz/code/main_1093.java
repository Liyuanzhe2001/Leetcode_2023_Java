package com.lyz.code;

public class main_1093 {

    public static void main(String[] args) {

    }

    public double[] sampleStats(int[] count) {
        double minimum = 256;
        double maximum = 0;
        double sum = 0;
        long n = 0;
        int mode = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] == 0) {
                continue;
            }
            minimum = Math.min(minimum, i);
            maximum = Math.max(maximum, i);
            if (count[i] > count[mode]) {
                mode = i;
            }
            sum = sum + count[i] * i;
            n += count[i];
        }
        System.out.println(sum);
        System.out.println(n);
        double median = n % 2 == 1 ? find(count, (int) (n / 2 + 1)) : (find(count, (int) (n / 2)) + find(count, (int) (n / 2 + 1))) / 2.0;
        return new double[]{minimum, maximum, sum / (n * 1.0), median, mode};
    }

    int find(int[] count, int i) {
        for (int k = 0, t = 0; ; ++k) {
            t += count[k];
            if (t >= i) {
                return k;
            }
        }
    }

}
