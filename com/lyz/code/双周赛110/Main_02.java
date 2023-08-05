package com.lyz.code.双周赛110;

import com.lyz.code.dataStructure.ListNode;
import org.w3c.dom.ls.LSException;

import java.util.List;

/**
 * @author lkunk
 * @date 2023年08月05日 22:27
 * @description
 */

public class Main_02 {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode preNode = head;
        ListNode nextNode = head.next;
        while (nextNode != null) {
            ListNode addNode = new ListNode(cal(preNode.val, nextNode.val));
            preNode.next = addNode;
            addNode.next = nextNode;
            preNode = nextNode;
            nextNode = nextNode.next;
        }
        return head;
    }

    public int cal(int x, int y) {
        while (y != 0) {
            int a = x % y;
            x = y;
            y = a;
        }
        return x;
    }
}
