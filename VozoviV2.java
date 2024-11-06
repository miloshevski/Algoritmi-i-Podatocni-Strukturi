import java.util.ArrayList;
import java.util.Scanner;

public class VozoviV2 {
    public static class Voz {
        public int pristiganje; // Arrival time
        public int poagjanje;   // Departure time

        Voz(int pr, int po) {
            this.pristiganje = pr;
            this.poagjanje = po;
        }
    }

    // Check if two intervals overlap
    public static boolean check(Voz a, Voz b) {
        return a.pristiganje < b.poagjanje && b.pristiganje < a.poagjanje;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Voz> vozovi = new ArrayList<>();
        
        // Input intervals
        for (int i = 0; i < n; i++) {
            int arrival = sc.nextInt();
            int departure = sc.nextInt();
            vozovi.add(new Voz(arrival, departure));
        }
        
        int overlaps = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) { // Start from i+1 to avoid self-comparison
                if (check(vozovi.get(i), vozovi.get(j))) {
                    overlaps++;
                }
            }
        }

        System.out.println(overlaps);
    }
}
