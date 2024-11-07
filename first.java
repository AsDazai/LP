import java.util.Scanner;

public class FirstFit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] blocks = new int[s.nextInt()];
        int[] processes = new int[s.nextInt()];

        for (int i = 0; i < blocks.length; i++) blocks[i] = s.nextInt();
        for (int i = 0; i < processes.length; i++) processes[i] = s.nextInt();
        for (int p : processes) {
            boolean allocated = false;
            for (int j = 0; j < blocks.length; j++) {
                if (blocks[j] >= p) {
                    blocks[j] -= p;
                    allocated = true;
                    System.out.println("Process " + p + " allocated");
                    break;
                }
            }
            if (!allocated) System.out.println("Process " + p + " not allocated");
        }
        
        s.close(); } }
