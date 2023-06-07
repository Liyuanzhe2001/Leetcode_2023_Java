package com.lyz.code;

import com.lyz.code.dataStructure.TreeNode;
import com.sun.source.tree.Tree;

import java.util.ArrayDeque;
import java.util.Queue;

public class main_958 {

    public static void main(String[] args) {

    }

    class Pair {
        int index;
        TreeNode node;

        public Pair(int index, TreeNode node) {
            this.index = index;
            this.node = node;
        }
    }

    public boolean isCompleteTree(TreeNode root) {
        Queue<Pair> queue = new ArrayDeque<>();
        queue.add(new Pair(1, root));
        int n = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Pair poll = queue.poll();
                if (poll.index != n) {
                    return false;
                }
                if (poll.node.left != null) {
                    queue.add(new Pair(2 * n, poll.node.left));
                }
                if (poll.node.right != null) {
                    queue.add(new Pair(2 * n + 1, poll.node.right));
                }
                n++;
            }
        }
        return true;
    }

}
