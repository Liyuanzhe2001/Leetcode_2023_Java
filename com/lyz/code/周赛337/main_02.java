package com.lyz.code.周赛337;

public class main_02 {
	public static void main(String[] args) {
//		int[][] grid = {{0,11,16,5,20},{17,4,19,10,15},{12,1,8,21,6},{3,18,23,14,9},{24,13,2,7,22}};
		int[][] grid = { { 0, 3, 6 }, { 5, 8, 1 }, { 2, 7, 4 } };
		System.out.println(new main_02().checkValidGrid(grid));
	}

	public boolean checkValidGrid(int[][] grid) {
		return step(0, grid, 0, 0);
	}

	public boolean step(int target, int[][] grid, int x, int y) {
		System.out.println(x+" "+y);
		if (target != grid[x][y]) {
			return false;
		}
		if (target == grid.length * grid.length - 1) {
			return true;
		}
		boolean flag = false;
		// x-2 y+1
		if (x - 2 >= 0 && y + 1 <= grid.length - 1) {
			flag = flag || step(target + 1, grid, x - 2, y + 1);
		}
		// x-1 y+2
		if (x - 1 >= 0 && y + 2 <= grid.length - 1) {
			flag = flag || step(target + 1, grid, x - 1, y + 2);
		}
		// x-2 y-1
		if (x - 2 >= 0 && y - 1 >= 0) {
			flag = flag || step(target + 1, grid, x - 2, y - 1);
		}
		// x-1 y-2
		if (x - 1 >= 0 && y - 2 >= 0) {
			flag = flag || step(target + 1, grid, x - 1, y - 2);
		}
		// x+1 y-2
		if (x + 1 <= grid.length - 1 && y - 2 >= 0) {
			flag = flag || step(target + 1, grid, x + 1, y - 2);
		}
		// x+2 y-1
		if (x + 2 <= grid.length - 1 && y - 1 >= 0) {
			flag = flag || step(target + 1, grid, x + 2, y - 1);
		}
		// x+1 y+2
		if (x + 1 <= grid.length-1 && y + 2 <= grid.length - 1) {
			flag = flag || step(target + 1, grid, x + 1, y + 2);
		}
		// x+2 y+1
		if (x + 2 <= grid.length - 1 && y + 1 <= grid.length - 1) {
			flag = flag || step(target + 1, grid, x + 2, y + 1);
		}
		return flag;
	}

}
