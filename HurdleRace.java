import java.util.*;

public class HurdleRace {
    static int hurdleRace(int k, int[] height) {
        int maxHeight = Arrays.stream(height).max().getAsInt();
        return Math.max(0, maxHeight - k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // number of hurdles
        int k = sc.nextInt(); // natural jump height
        int[] height = new int[n];
        
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }
        
        System.out.println(hurdleRace(k, height));
    }
}
