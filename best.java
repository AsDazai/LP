import java.util.Scanner;

public class BestFit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] blocks = new int[s.nextInt()];
        int[] processes = new int[s.nextInt()];
        for (int i = 0; i < blocks.length; i++) blocks[i] = s.nextInt();
        for (int i = 0; i < processes.length; i++) processes[i] = s.nextInt();
        for (int p : processes) {
            int bestIdx = -1;
            for (int j = 0; j < blocks.length; j++) {
                if (blocks[j] >= p && (bestIdx == -1 || blocks[j] < blocks[bestIdx])) bestIdx = j;
            }
            if (bestIdx != -1) blocks[bestIdx] -= p;
            System.out.println("Process " + p + (bestIdx != -1 ? " allocated" : " not allocated"));
        }
        
        s.close();
    }
}
