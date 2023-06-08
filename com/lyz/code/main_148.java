package com.lyz.code;

import com.lyz.code.dataStructure.ListNode;
import com.lyz.code.dataStructure.TreeNode;

public class main_148 {

    public static void main(String[] args) {

    }

    public ListNode sortList(ListNode head) {
        ListNode root = new ListNode();
        while (head != null) {
            if (root.next == null) {
                root.next = new ListNode(head.val);
            } else {
                ListNode pre;
                pre = root;
                for (ListNode tmp = root.next; tmp != null; tmp = tmp.next) {
                    if (head.val <= tmp.val) {
                        break;
                    }
                    pre = tmp;
                }
                ListNode insertNode = new ListNode(head.val);
                insertNode.next = pre.next;
                pre.next = insertNode;
            }
            head = head.next;
        }
        return root.next;
    }

}
