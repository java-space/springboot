package com.example.springboot.config;

import lombok.Data;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

@Data
public class AppSession {

    private int counter;


    public void updateCounter() {
    }
}
