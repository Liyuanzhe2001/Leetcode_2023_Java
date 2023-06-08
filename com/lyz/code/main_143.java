package com.lyz.code;

import com.lyz.code.dataStructure.ListNode;
import com.lyz.code.dataStructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class main_143 {

    public static void main(String[] args) {


    }

    public void reorderList(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        for (ListNode tmp = head; tmp != null; tmp = tmp.next) {
            list.add(head);
        }
        for (int i = 0; i < list.size() / 2; i++) {
            System.out.println(head.val);
            ListNode node = list.get(list.size() - i - 1);
            node.next = head.next;
            head.next = node;
            head = head.next.next;
        }
    }

}
