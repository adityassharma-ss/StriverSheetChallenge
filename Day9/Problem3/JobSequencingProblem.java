import java.util.*;

class Job {
    int id, deadline, profit;

    public Job(int id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}

class myCmp implements Comparator<Job>{
    public int compare(Job a,Job b){
        return b.profit-a.profit;
    }
}

public class JobSequencingProblem {
    public static void main(String[] args) {
        int N = 4;
        Job[] jobs = new Job[N];
        jobs[0] = new Job(1, 4, 20);
        jobs[1] = new Job(2, 1, 10);
        jobs[2] = new Job(3, 1, 40);
        jobs[3] = new Job(4, 1, 30);

        int[] result = JobScheduling(jobs, N);
        System.out.println(result[0] + " " +  result[1]);
    }

    public static int[] JobScheduling(Job arr[], int n){
        Arrays.sort(arr,new myCmp());
        boolean done[]=new boolean[n];
        for(int i=0;i<n;i++){
            done[i]=false;
        }
        
        int day=0,profit=0;
        for(int i=0;i<n;i++){
            for(int j=Math.min(arr[i].deadline-1,n);j>=0;j--){
                if(done[j]==false){
                    day+=1;
                    profit+=arr[i].profit;
                    done[j]=true;
                    break;
                }
            }
        }
        int ans[]=new int[2];
        ans[0]=day;
        ans[1]=profit;
        return ans;
    }
}
