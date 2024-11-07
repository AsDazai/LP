import java.util.*;

class Process {
    int id, remaining;
    Process(int id, int burst) { this.id = id; this.remaining = burst; }
}

public class RoundRobin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), tq = s.nextInt(), time = 0;
        Process[] p = new Process[n];
        for (int i = 0; i < n; i++) p[i] = new Process(i + 1, s.nextInt());

        while (true) {
            boolean done = true;
            for (Process pr : p) {
                if (pr.remaining > 0) {
                    done = false;
                    System.out.println("Time " + time + ": Process " + pr.id + " executing");
                    int timeSpent = Math.min(pr.remaining, tq);
                    pr.remaining -= timeSpent;
                    time += timeSpent;
                }
            }
            if (done) break;
        }
        s.close();
    }
}
