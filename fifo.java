import java.util.*;

public class FIFO {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int frames = s.nextInt(), pageFaults = 0;
        int[] pages = new int[s.nextInt()];
        for (int i = 0; i < pages.length; i++) pages[i] = s.nextInt();
        Queue<Integer> memory = new LinkedList<>();
        for (int page : pages) {
            if (!memory.contains(page)) {
                if (memory.size() == frames) memory.poll();
                memory.add(page);
                pageFaults++;
            }
        }
        System.out.println("Page Faults: " + pageFaults);
        s.close();
    } 	}
I
