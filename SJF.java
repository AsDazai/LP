import java.util.*;

class Process {
    int id, remaining;
    Process(int id, int burst) { this.id = id; this.remaining = burst; }
}

public class SJFPreemptive {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Process[] p = new Process[s.nextInt()];
        for (int i = 0; i < p.length; i++) p[i] = new Process(i + 1, s.nextInt());
        
        int time = 0;
        while (true) {
            Arrays.sort(p, Comparator.comparingInt(a -> a.remaining > 0 ? a.remaining : Integer.MAX_VALUE));
            boolean done = true;
            for (Process pr : p) {
                if (pr.remaining > 0) { System.out.println("Time " + time + ": Process " + pr.id + " is executing"); pr.remaining--; done = false; break; }
            }
            if (done) break; time++;
        }
        s.close();
    }
}
