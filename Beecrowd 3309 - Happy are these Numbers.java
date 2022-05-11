/*https://www.beecrowd.com.br/judge/en/problems/view/3309?origem=1&msclkid=bb87c199d14511eca392ed86e52e6922*/

import java.io.IOException;
import java.util.*;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       int a[]=new int[t];
       for(int i=0;i<t;i++)
       {
           a[i]=sc.nextInt();
       }
       int c=0;
       for(int i=0;i<t;i++)
       {
            int sum=0;
            int r;
            while(a[i]!=0)
            {
                r=a[i]%10;
                sum=sum+r*r;
                a[i]=a[i]/10;
            }
            while(sum!=1&&sum!=4)
            {
                a[i]=sum;
                sum=0;
                while(a[i]!=0)
                {
                r=a[i]%10;
                sum=sum+r*r;
                a[i]=a[i]/10;
                }
            }
            if(sum==1)
            {
                c=c+1;
            }
            else if(sum==4)
            {
                c=c+0;
            }
       }
       System.out.println(c);
 
    }
 
}