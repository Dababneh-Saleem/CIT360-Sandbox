/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myatomicthread;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.w3c.dom.css.Counter;

/**
 *
 * @author sdababneh
 */
public class MyAtomicThread {
 
    public static void main(String[] args) throws InterruptedException {
 
        ProcessingThread pt = new ProcessingThread();
        Thread t1 = new Thread(pt, "t1");
        t1.start();
        Thread t2 = new Thread(pt, "t2");
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Processing count=" + pt.getCount());
    }
 
}
 
 
class ProcessingThread implements Runnable {
    private AtomicInteger count = new AtomicInteger();
 
 
    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                processSomething(i);
            } catch (IOException ex) {
                Logger.getLogger(ProcessingThread.class.getName()).log(Level.SEVERE, null, ex);
            }
            count.incrementAndGet();
        }
    }
 
 
    public int getCount() {
        return this.count.get();
    }
 
 
    private void processSomething(int i) throws MalformedURLException, IOException {
        // processing some job
        URL url = new URL("http://www.google.com");
        HttpURLConnection httpCon = 
        (HttpURLConnection) url.openConnection();
        long date = httpCon.getDate();
        if (date == 0) {
            //datetime = null;
            System.out.println("No date information.");
        } else {
            Date datetime = new Date(date);
            System.out.println("Thread " + i + " Date: " + datetime);
        }
    }
 
}