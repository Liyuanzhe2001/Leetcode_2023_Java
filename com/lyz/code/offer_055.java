package com.lyz.code;

import com.lyz.code.dataStructure.TreeNode;

import javax.management.Query;
import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author lkunk
 * @date 2023年07月09日 16:43
 * @description
 */

public class offer_055 {

    class BSTIterator {

        Queue<Integer> queue = new ArrayDeque<>();

        public BSTIterator(TreeNode root) {
            dfs(root);
        }

        public void dfs(TreeNode root) {
            if (root == null) {
                return;
            }
            dfs(root.left);
            queue.add(root.val);
            dfs(root.right);
        }

        public int next() {
            return queue.poll();
        }

        public boolean hasNext() {
            return !queue.isEmpty();
        }
    }

}
