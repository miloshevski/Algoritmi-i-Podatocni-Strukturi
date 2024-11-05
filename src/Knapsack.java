import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Knapsack {

    public static class Work{
        public double vreme;
        public double zarabotka;
        public double soodnos;
        Work(double vreme,double zarabotka){
            this.vreme=vreme;
            this.zarabotka=zarabotka;
            this.soodnos=zarabotka/vreme;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Work> list = new ArrayList<>();
        int n =sc.nextInt();
        for(int i=0;i<n;i++){
            int v=sc.nextInt();
            int z=sc.nextInt();
            list.add(new Work(v,z));
        }
    
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(list.get(j).soodnos<list.get(j+1).soodnos){
                    Work tmp=list.get(j);
                    list.set(j,list.get(j+1));
                    list.set(j+1, tmp);
                }
            }
        }
        double casovi=40;
        double zarabotka=0;
        for(int i=0;i<n;i++){
            if(list.get(i).vreme<=casovi){
                zarabotka+=list.get(i).zarabotka;
                casovi-=list.get(i).vreme;
            }else{
                zarabotka+=casovi*list.get(i).soodnos;
                break;
            }
        }


        if (zarabotka == (long) zarabotka) {
            // Print as integer
            System.out.printf("%d%n", (long) zarabotka);
        } else {
            // Print as double
            System.out.printf("%s%n", zarabotka);
        }
    }
}
