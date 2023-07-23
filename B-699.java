import java.util.Scanner;

public class B699 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int i = 0;i < T;i++){
            int N = in.nextInt();
            int K = in.nextInt();
            int[] H = new int[N];
            for(int n=0;n<N; n++){
                H[n] = in.nextInt();
            }
            int pos = -1;
            main: for (int k = 0; k<K;k++){
                pos = 0;
                while(true){
                    if(pos == N-1){
                        pos = -1;
                        break main;
                    }else if(H[pos] >= H[pos+1]){
                        pos++;
                    }else{
                        H[pos]++;
                        break;
                    }
                }
            }
            System.out.println((pos == -1) ? pos : (pos +1));
        }
    }

}
