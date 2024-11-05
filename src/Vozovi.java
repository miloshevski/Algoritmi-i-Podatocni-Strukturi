import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Vozovi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> pristiganje = new ArrayList<>();
        ArrayList<Integer> poagjanje = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            pristiganje.add(sc.nextInt());
            poagjanje.add(sc.nextInt());
        }

        Collections.sort(pristiganje);
        Collections.sort(poagjanje);

        int i = 0, j = 0, platformi = 0;
        int maxx = 0;

        while (i < n && j < n) {
            if (pristiganje.get(i) <= poagjanje.get(j)) {
                platformi++;
                i++;
                maxx = Math.max(maxx, platformi);
            } else { 
                platformi--;
                j++;
            }
        }

        System.out.println(maxx);
    }
}
