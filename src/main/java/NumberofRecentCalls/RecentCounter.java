package main.java.NumberofRecentCalls;

import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {

    private Queue<Integer> queue;

    public RecentCounter() {
        this.queue = new LinkedList<>();
    }

    public int ping(int t) {
        this.queue.add(t);
            while(queue.peek() < (t-3000)) {
                this.queue.remove();
            }
        return this.queue.size();
    }
}
