package com.lyz.code.pat;

import java.util.*;

public class Main_03 {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode rig;

        public TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }
    }

    static Map<Integer, Integer> inorderMap = new HashMap<>();
    static Map<Integer, Integer> preorderMap = new HashMap<>();
    static int[][] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[2][n];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
                if (i == 0) {
                    inorderMap.put(arr[i][j], j);
                } else {
                    preorderMap.put(arr[i][j], j);
                }
            }
        }
        TreeNode treeNode = buildTreeInorder(new boolean[n + 1]);
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(treeNode);
        int n1 = 0;
        int n2 = 0;
        int n0 = 0;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            int c = 0;
            if (node.left != null) {
                queue.add(node.left);
                c++;
            }
            if (node.rig != null) {
                queue.add(node.rig);
                c++;
            }
            switch (c) {
                case 1:
                    n1 += 1;
                    break;
                case 2:
                    n2 += 1;
                    break;
                case 0:
                    n0 += 1;
            }
        }
        System.out.println(n1 + " * " + n2 + " / " + n0 + " = " + (n1 * n2) / n0);
        return;
    }


    public static int index = 0;

    public static TreeNode buildTreeInorder(boolean[] visited) {
        if (index == arr[1].length) {
            return null;
        }
        int rootIndex = index;
        TreeNode root = new TreeNode(arr[1][index]);
        visited[arr[1][index]] = true;
        if (isLeft(rootIndex, visited)) {
            index += 1;
            root.left = buildTreeInorder(visited);
        } else {
            root.left = null;
        }
        if (isRight(rootIndex, visited)) {
            index += 1;
            root.rig = buildTreeInorder(visited);
        } else {
            root.rig = null;
        }
        return root;
    }

    public static boolean isLeft(int rootIndex, boolean[] visited) {
        if (inorderMap.get(arr[1][rootIndex]) == 0) {
            return false;
        }
        return !visited[arr[0][inorderMap.get(arr[1][rootIndex]) - 1]];
    }

    public static boolean isRight(int rootIndex, boolean[] visited) {
        if (inorderMap.get(arr[1][rootIndex]) == arr[0].length - 1) {
            return false;
        }
        return !visited[arr[0][inorderMap.get(arr[1][rootIndex]) + 1]];
    }


}
