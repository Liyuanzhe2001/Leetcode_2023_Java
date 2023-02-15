package com.lyz.code;

public class main_1154 {

    public static void main(String[] args) {
        String date = "2019-01-09";
        System.out.println(new main_1154().dayOfYear(date));
    }

    public int dayOfYear(String date) {
        String[] split = date.split("-");
        int year = Integer.parseInt(split[0]);
        int month = Integer.parseInt(split[1]);
        int res = Integer.parseInt(split[2]);
        for (int i = 1; i < month; i++) {
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    res += 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    res += 30;
                    break;
                default:
                    // 闰年
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                        res += 29;
                    } else {
                        res += 28;
                    }
                    break;
            }
        }
        return res;
    }

}
