import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int key = input.nextInt();
        for(int i = 0; i < key; i++){
            int n = input.nextInt();
            int a = input.nextInt();
            int b = input.nextInt();
            if(b < a){
                System.out.println("1");
            }else {
                if(n%a == 0){
                    System.out.println(n/a);
                }
                else{
                    System.out.println(n/a +1);
                }
            }
        }
    }
}
