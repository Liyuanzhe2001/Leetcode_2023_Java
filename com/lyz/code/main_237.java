package com.lyz.code;

import com.lyz.code.dataStructure.ListNode;

public class main_237 {

    public static void main(String[] args) {

    }

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

}
