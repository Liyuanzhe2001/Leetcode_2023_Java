package com.lyz.code;

import com.lyz.code.dataStructure.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author lkunk
 * @date 2023年07月09日 16:46
 * @description
 */

public class main_173 {
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
