package com.legend.scl.aqs;

import java.util.concurrent.locks.ReentrantLock;

public class Test {
    static public volatile int i = 0;
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        i++;
        lock.unlock();
    }
}
