/*https://www.beecrowd.com.br/judge/en/problems/view/1168?msclkid=7905f207d14511ec928ec56b6acb6f07*/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    String s=sc.next();
		    int r,c=0;
		    char[] ch= s.toCharArray();
		    for(int j=0;j<s.length();j++)
		    {
		        
		        switch (ch[j]) {
                case '1':
                    c=c+2;
                    break;
                case '2':
                    c=c+5;
                    break;
                case '3':
                    c=c+5;
                    break;
                case '4':
                    c=c+4;
                    break;
                case '5':
                    c=c+5;
                    break;
                case '6':
                    c=c+6;
                    break;
                case '7':
                    c=c+3;
                    break;
                case '8':
                    c=c+7;
                    break;
                case '9':
                    c=c+6;
                    break;
                case '0':
                    c=c+6;
                    break;
                }
                
		    }
		    System.out.println(c+" leds");
		}
	}
}
