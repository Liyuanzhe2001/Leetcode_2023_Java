package com.lyz.code;

import com.lyz.code.dataStructure.ListNode;
import com.lyz.code.dataStructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class main_109 {

    public static void main(String[] args) {

    }

    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }
        List<Integer> list = new ArrayList<>();
        for (ListNode tmp = head; tmp != null; tmp = tmp.next) {
            list.add(tmp.val);
        }
        return buildTree(list, 0, list.size() - 1);
    }

    public TreeNode buildTree(List<Integer> list, int lef, int rig) {
        if (lef > rig) {
            return null;
        }
        int mid = (lef + rig) >> 1;
        TreeNode root = new TreeNode(list.get(mid));
        root.left = buildTree(list, lef, mid - 1);
        root.right = buildTree(list, mid + 1, rig);
        return root;
    }

}
