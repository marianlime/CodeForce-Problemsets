import java.util.Scanner;
import java.lang.*;

public class Main {



    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int z=sc.nextInt();
        int c = 0;
        for(int i=0; i<z; i++){
            int sum = 0;
            int x = sc.nextInt();
            int y  = sc.nextInt();
            int l  = sc.nextInt();
            sum += x+y+l;
            if(sum>1){
                c += 1;
            }
        }
        System.out.println(c);
            }
        }
