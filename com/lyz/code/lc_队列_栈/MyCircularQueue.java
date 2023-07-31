package com.lyz.code.lc_队列_栈;

/**
 * @author lkunk
 * @date 2023年07月31日 22:46
 * @description
 */

public class MyCircularQueue {

    int[] queue;
    int len;
    int front = 0;
    int rear = 0;

    public MyCircularQueue(int k) {
        queue = new int[k];
        len = k;
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        queue[rear % len] = value;
        rear++;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        front++;
        return true;
    }

    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return queue[front % len];
    }

    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        return queue[(rear - 1) % len];
    }

    public boolean isEmpty() {
        return rear == front;
    }

    public boolean isFull() {
        return rear - len == front;
    }
}
