package com.lyz.code.周赛345;

import java.util.*;

public class Main_04 {
    public static void main(String[] args) {
        int n = 6;
        int[][] edges = {{0, 1}, {0, 2}, {1, 2}, {3, 4}, {3, 5}};
        System.out.println(new AAA().countCompleteComponents(n, edges));
    }

}

class AAA {
    class UF {

        private int count;
        private int[] parent;
        private int[] size;

        public UF(int n) {
            this.count = n;
            parent = new int[n];
            size = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
                size[i] = 1;
            }
        }

        public void union(int p, int q) {
            int rootP = find(p);
            int rootQ = find(q);
            if (rootP == rootQ) {
                return;
            }
            if (size[rootP] > size[rootQ]) {
                parent[rootQ] = rootP;
                size[rootP] += size[rootQ];
            } else {
                parent[rootP] = rootQ;
                size[rootQ] += size[rootP];
            }
            count--;
        }

        public int find(int x) {
            while (parent[x] != x) {
                parent[x] = parent[parent[x]];
                x = parent[x];
            }
            return x;
        }

        public boolean connected(int p, int q) {
            int rootP = find(p);
            int rootQ = find(q);
            return rootP == rootQ;
        }

        public int count() {
            return count;
        }
    }

    public int countCompleteComponents(int n, int[][] edges) {
        UF uf = new UF(n);

        boolean[][] grid = new boolean[n][n];
        for (int[] e : edges) {
            uf.union(e[0], e[1]);
            grid[e[0]][e[1]] = true;
            grid[e[1]][e[0]] = true;
        }

        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int key = uf.find(i);
            List<Integer> tmp = map.getOrDefault(key, new ArrayList<>());
            tmp.add(i);
            map.put(key, tmp);
        }

        int res = 0;
        for (Integer key : map.keySet()) {
            List<Integer> list = map.get(key);
            boolean flag = false;
            for (int i = 0; i < list.size(); i++) {
                for (int j = i + 1; j < list.size(); j++) {
                    if (!grid[list.get(i)][list.get(j)]) {
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    break;
                }
            }
            if (!flag) {
                res += 1;
            }
        }

        return res;
    }
}
