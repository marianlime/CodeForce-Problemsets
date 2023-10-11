import java.util.*;


public class B765 {
    public static void main(String[] args){
        Scanner re = new Scanner(System.in);
        int F = re.nextInt();
        for(int t = 0;t < F;t++){
            int N = re.nextInt();
            int min = Integer.MAX_VALUE;
            Map<Integer, Integer> map = new HashMap<>();
            for(int n = 0; n < N;n++){
                int a = re.nextInt();
                Integer last  = map.put(a , n);
                if(last != null){
                    min = Math.min(min, n-last);
                }
            }
            int answer = (min == Integer.MAX_VALUE) ? -1 : (N - min);
            System.out.println(answer);
        }
    }

}
