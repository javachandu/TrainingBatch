package com.java.MultiThreadingExample;

public class MultiThreading {

		    public static void main(String[] args) {
		        // Create and start two threads
		        Thread thread1 = new Thread(new MyRunnable("Thread 1"));
		        Thread thread2 = new Thread(new MyRunnable("Thread 2"));
		        Thread thread3 = new Thread(new MyRunnable("Thread 3"));
		        Thread thread4 = new Thread(new MyRunnable("Thread 4"));

		        thread1.start();
		        thread2.start();
		        thread3.start();
		        thread4.start();

		    }
		}

		class MyRunnable implements Runnable {
		    private String threadName;

		    public MyRunnable(String threadName) {
		        this.threadName = threadName;
		    }

		    public void run() {
		        System.out.println("Thread " + threadName + " is running.");

		        try {
		            // Simulate to do some task
		            for (int i = 0; i < 5; i++) {
		                System.out.println("Thread " + threadName + ": " + i);
		                Thread.sleep(4000); // Sleep for 3 second
		            }
		        } catch (InterruptedException e) {
		            System.out.println("Thread " + threadName + " was interrupted.");
		        }

		        System.out.println("Thread " + threadName + " finished execution.");
		    }


	}

