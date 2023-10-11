import java.util.Scanner;

public class B1836 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int t = 0;t< T;t++){
            long N = in.nextInt();
            long K = in.nextInt();
            long G = in.nextInt();
            long coins = K * G;
            long maxSingleSave = (G-1)/2;
            long save = Math.min(coins, maxSingleSave*(N-1));
            long last = coins - save;
            long r = last % G;
            if(r <= maxSingleSave){
                save += r;
            }else{
                save -= (G -r);
            }
            System.out.println(save);
        }
    }

}
