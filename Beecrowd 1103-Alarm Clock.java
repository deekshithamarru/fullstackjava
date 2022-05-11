/*https://www.beecrowd.com.br/judge/en/problems/view/1103?origem=1&msclkid=a1c99981d14511ec8b2a6ca99b72190b*/

import java.io.IOException;
import java.util.*;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
       Scanner sc=new Scanner(System.in);
        int h1,m1,h2,m2;
        int x,y;
        while(sc.hasNext())
        {
            h1=sc.nextInt();
            m1=sc.nextInt();
            h2=sc.nextInt();
            m2=sc.nextInt();
            if(h1==0&&m1==0&&h2==0&&m2==0)
            {
                break;
            }
            if(h1==0)
            {
                x=24*60+m1;
            }
            else
            {
                x=h1*60 +m1;
            }
            if(h2==0) 
            {
                y=24*60 +m2;
            }
            else
            {
                y=h2*60+m2;
            }
            if(y>x)
            {
                System.out.println(y-x);
            }
            else
            {
                System.out.println(24*60-(x-y));
            }
        }
 
    }
 
}