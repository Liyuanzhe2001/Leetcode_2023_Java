package com.lyz.code;

import com.lyz.code.dataStructure.TreeNode;

/**
 * @author lkunk
 * @date 2023年09月04日 9:52
 * @description
 */

public class main_449 {
    public static class Codec {

        public static TreeNode res;
        String s = "";

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            res = root;
            return s;
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            s = data;
            return res;
        }
    }
}
