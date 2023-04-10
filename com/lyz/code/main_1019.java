package com.lyz.code;

import com.lyz.code.dataStructure.ListNode;

import java.util.ArrayList;
import java.util.Arrays;

public class main_1019 {

    public static void main(String[] args) {
        ListNode node01 = new ListNode(2);
        ListNode node02 = new ListNode(7);
        ListNode node03 = new ListNode(4);
        ListNode node04 = new ListNode(3);
        ListNode node05 = new ListNode(5);

        node01.next = node02;
        node02.next = node03;
        node03.next = null;

        int[] ints = new main_1019().nextLargerNodes(node01);
        System.out.println(Arrays.toString(ints));
    }

    public int[] nextLargerNodes(ListNode head) {
        ListNode tmp = new ListNode();
        ArrayList<Integer> list = new ArrayList<>();
        while (head != null) {
            tmp = head.next;
            while (tmp != null) {
                if (tmp.val > head.val) {
                    list.add(tmp.val);
                    break;
                }
                tmp = tmp.next;
            }
            if(tmp == null) {
                list.add(0);
            }
            head = head.next;
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }

}
