package com.lyz.code;

public class Main_2409 {

    public static void main(String[] args) {
        String arriveAlice = "09-01", leaveAlice = "10-19", arriveBob = "06-19", leaveBob = "10-20";
        System.out.println(new Main_2409().countDaysTogether(arriveAlice, leaveAlice, arriveBob, leaveBob));
    }

    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        if (compareTime(arriveBob, leaveAlice) || compareTime(arriveAlice, leaveBob)) {
            return 0;
        }
        String start = compareTime(arriveAlice, arriveBob) ? arriveAlice : arriveBob;
        String end = compareTime(leaveAlice, leaveBob) ? leaveBob : leaveAlice;
        String[] startTime = start.split("-");
        String[] endTime = end.split("-");
        int cnt = 0;
        for (int s = Integer.parseInt(startTime[0]); s <= Integer.parseInt(endTime[0]); s++) {
            cnt += getDay(s);
        }
        cnt -= Integer.parseInt(startTime[1]) - 1;
        int tmp = getDay(Integer.parseInt(endTime[0]));
        cnt = cnt - (tmp - Integer.parseInt(endTime[1]));
        return cnt;
    }

    public boolean compareTime(String time1, String time2) {
        String[] str1 = time1.split("-");
        String[] str2 = time2.split("-");
        if (str1[0].compareTo(str2[0]) > 0) {
            return true;
        } else if (str1[0].equals(str2[0])) {
            return str1[1].compareTo(str2[1]) > 0;
        } else {
            return false;
        }
    }

    public int getDay(int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return 28;
            default:
                return 0;
        }
    }
}
