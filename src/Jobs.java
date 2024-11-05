import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Jobs {
    public static class Job {
        public double time;
        public double price;
        public double ratio;

        Job(double t, double p) {
            this.time = t;
            this.price = p;
            this.ratio = price / time;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Job> jobs = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            jobs.add(new Job(sc.nextDouble(), sc.nextDouble()));
        }


        Collections.sort(jobs,new Comparator<Job>(){
            public int compare(Job j1,Job j2){
                return Double.compare(j2.ratio,j1.ratio);
            }
        });
        int casovi=40;
        int zarabotka=0;
        for(int i=0;i<n;i++){
            if(casovi==0){
                break;
            }
            if(jobs.get(i).time<=casovi){
                zarabotka+=jobs.get(i).price;
                casovi-=jobs.get(i).time;
            }else{
                zarabotka+=(casovi*jobs.get(i).ratio);
                break;
            }
        }
        System.out.println(zarabotka);
    }
}
