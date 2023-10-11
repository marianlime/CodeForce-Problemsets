import java.util.Scanner;


public class B1708 {

    public static void main(String[] args) {


    Scanner in = new Scanner(System.in);
    int T = in.nextInt();
    for(int t = 0; t<T; t++)

    {
        int N = in.nextInt();
        int L = in.nextInt();
        int R = in.nextInt();
        StringBuilder out = new StringBuilder();
        boolean possible = true;
        for (int n = 1; n < N; n++) {
            int a = n * (R / n);
            if (a < L) {
                possible = false;
                break;
            }
            out.append(a).append(' ');
        }
        if (possible) {
            System.out.println("YES");
            System.out.println(out);
        } else {
            System.out.println("NO");
        }
    }
}
}
