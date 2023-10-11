import java.util.Arrays;
import java.util.Scanner;

public class G2859 {

    public static void main(String[] args){
        Scanner tn = new Scanner(System.in);
        int F = tn.nextInt();
        for(int t =0;t < F;t++){
            int N = tn.nextInt();
            Integer[] A = new Integer[N];
            for(int n=0; n<N;n++){
                A[n] = tn.nextInt();
            }
            Arrays.sort(A);
            boolean ok = (A[0] == 1);
            long sum = 1;
            for( int n = 1; n< N;n++) {
                if (A[n] > sum) {
                    ok = false;
                    break;
                }
                sum = sum + A[n];
            }
            System.out.println(ok ? "YES" : "NO");
        }
    }

}
