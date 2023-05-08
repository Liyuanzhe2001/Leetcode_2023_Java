//package com.lyz.code;
//
//import java.util.ArrayDeque;
//import java.util.Queue;
//
//public class main_1263 {
//
//    public static void main(String[] args) {
//    /*
//    ["#",".",".","#","#","#","#","#"],
//    ["#",".",".","T","#",".",".","#"],
//    ["#",".",".",".","#","B",".","#"],
//    ["#",".",".",".",".",".",".","#"],
//    ["#",".",".",".","#",".","S","#"],
//    ["#",".",".","#","#","#","#","#"]
//     */
//        char[][] grid = {{'#','.','.','#','T','#','#','#','#'},{'#','.','.','#','.','#','.','.','#'},{'#','.','.','#','.','#','B','.','#'},{'#','.','.','.','.','.','.','.','#'},{'#','.','.','.','.','#','.','S','#'},{'#','.','.','#','.','#','#','#','#'}};
//        System.out.println(new main_1263().minPushBox(grid));
//    }
//
//    class Position {
//        int x;
//        int y;
//        int peopleX;
//        int peopleY;
//
//        public Position(int x, int y, int peopleX, int peopleY) {
//            this.x = x;
//            this.y = y;
//            this.peopleX = peopleX;
//            this.peopleY = peopleY;
//        }
//
//        public int getX() {
//            return x;
//        }
//
//        public void setX(int x) {
//            this.x = x;
//        }
//
//        public int getY() {
//            return y;
//        }
//
//        public void setY(int y) {
//            this.y = y;
//        }
//
//        public int getPeopleX() {
//            return peopleX;
//        }
//
//        public void setPeopleX(int peopleX) {
//            this.peopleX = peopleX;
//        }
//
//        public int getPeopleY() {
//            return peopleY;
//        }
//
//        public void setPeopleY(int peopleY) {
//            this.peopleY = peopleY;
//        }
//    }
//
//    public int minPushBox(char[][] grid) {
//        int nowX = 0;
//        int nowY = 0;
//        int peopleX = 0;
//        int peopleY = 0;
//        for (int i = 0; i < grid.length; i++) {
//            for (int j = 0; j < grid[0].length; j++) {
//                if (grid[i][j] == 'B') {
//                    nowX = i;
//                    nowY = j;
//                }
//                if (grid[i][j] == 'S') {
//                    peopleX = i;
//                    peopleY = j;
//                }
//            }
//        }
//        Queue<Position> queue = new ArrayDeque<>();
//        queue.add(new Position(nowX, nowY, peopleX, peopleY));
//        int n = 0, x, y, px, py;
//        boolean[][] visited = new boolean[grid.length][grid[0].length];
//        while (!queue.isEmpty()) {
//            System.out.println(n);
//            int size = queue.size();
//            for (int i = 0; i < size; i++) {
//                Position position = queue.poll();
//                x = position.getX();
//                y = position.getY();
//                px = position.getPeopleX();
//                py = position.getPeopleY();
////                System.out.println(x + " " + y);
//                if (grid[x][y] == 'T') {
//                    return n;
//                } else {
//                    if (x - 1 >= 0 && x + 1 < grid.length) {
//                        if (grid[x - 1][y] != '#' && grid[x + 1][y] != '#') {
//                            if (!visited[x - 1][y] && dfs(new boolean[grid.length][grid[0].length], grid, px, py, x, y, x + 1, y)) {
//                                queue.add(new Position(x - 1, y, x, y));
//                            }
//                            if (!visited[x + 1][y] && dfs(new boolean[grid.length][grid[0].length], grid, px, py, x, y, x - 1, y)) {
//                                queue.add(new Position(x + 1, y, x, y));
//                            }
//                        }
//                    }
//                    if (y - 1 >= 0 && y + 1 < grid[0].length) {
//                        if (grid[x][y - 1] != '#' && grid[x][y + 1] != '#') {
//                            if (!visited[x][y - 1] && dfs(new boolean[grid.length][grid[0].length], grid, px, py, x, y, x, y + 1)) {
//                                queue.add(new Position(x, y - 1, x, y));
//                            }
//                            if (!visited[x][y + 1] && dfs(new boolean[grid.length][grid[0].length], grid, px, py, x, y, x, y - 1)) {
//                                queue.add(new Position(x, y + 1, x, y));
//                            }
//                        }
//                    }
//                }
//                visited[x][y] = true;
//            }
//            n++;
//        }
//        return -1;
//    }
//
//    public boolean dfs(boolean[][] visited, char[][] grid, int x, int y, int bX, int bY, int targetX, int targetY) {
////        System.out.println(x + " " + y + " " + bX + " " + bY);
//        if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || visited[x][y] || grid[x][y] == '#' || (x == bX && y == bY)) {
//            return false;
//        }
//        if (targetX == x && targetY == y) {
//            return true;
//        }
//        visited[x][y] = true;
//        return dfs(visited, grid, x - 1, y, bX, bY, targetX, targetY) ||
//                dfs(visited, grid, x + 1, y, bX, bY, targetX, targetY) ||
//                dfs(visited, grid, x, y - 1, bX, bY, targetX, targetY) ||
//                dfs(visited, grid, x, y + 1, bX, bY, targetX, targetY);
//    }
//
//}
