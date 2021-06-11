import java.io.*;
import java.util.*;
public class PrimeGame {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int l=sc.nextInt();
            int r=sc.nextInt();
            int flag=0;
            int max=-1;
            int min=0;
            for(int i=l;i<=r;i++){
                flag=0;
                for(int j=2;j<i;j++) {
                    if (i % j == 0) {
                        flag = 1;
                    }
                }
                if(i==1){
                    flag=1;
                }
                if(flag==0){
                    if(min==0){
                        min=i;
                        max=i;
                    }
                    else{
                        max=i;
                    }
                }
            }
            System.out.println(max-min);
        }
    }
}

