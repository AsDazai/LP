import java.util.Scanner;

public class NextFit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] blocks = new int[s.nextInt()];
        int[] processes = new int[s.nextInt()];
        for (int i = 0; i < blocks.length; i++) blocks[i] = s.nextInt();
        for (int i = 0; i < processes.length; i++) processes[i] = s.nextInt();
        int lastPos = 0;
        for (int p : processes) {
            boolean allocated = false;
            for (int i = 0; i < blocks.length; i++) {
                int j = (lastPos + i) % blocks.length;
                if (blocks[j] >= p) {
                    blocks[j] -= p;
                    lastPos = (j + 1) % blocks.length;
                    allocated = true;
                    System.out.println("Process " + p + " allocated to block " + (j + 1));
                    break;
                }
            }
            if (!allocated) System.out.println("Process " + p + " not allocated");
        }
        s.close();
    } }
