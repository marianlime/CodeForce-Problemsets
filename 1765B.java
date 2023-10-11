import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int g = input.nextInt();
        while(g-- > 0){
            int wl = input.nextInt();
            boolean flag = true;
            StringBuilder s = new StringBuilder((input.next()));
            if(wl%3==2){
                System.out.println("No");
                continue;
            }
            for(int i = 2; i <= s.length(); i+=3){
                if (s.charAt(i) != s.charAt(i -1)){
                    flag = false;
                    break;
                }
            }
            System.out.println(flag?"Yes":"No");
        }
    }
 
}
