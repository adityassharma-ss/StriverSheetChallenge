public class InversionOfArray {
    public static void main(String[] args) {
        int[] A = { 3,2,1 };
        int n = 3;
        int cnt = solve(A,n);
        System.out.println(cnt);
    }

    public static int solve(int[] A, int n){
        int count = 0;
        for(int i=0; i<n; i++){
            for(int j=i+1;j<n;j++){
                if(A[i]>A[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
