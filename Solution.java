import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        
        String str;
      
     
        int i,j;
        int x,y;
        int count=0;
        int n,t;
       
        
        t=in.nextInt();
     
        
        for(n=0;n<t;n++)
            {
            
            count=0;
            
            str=in.next();
            int len = str.length();
            
           System.out.println("len=" +len); 
            System.out.println("str=" + str);
            
            
        for(i=0,j=len;i<((len+1)/2);i++,j--)
            {
            
            System.out.println(i);
            System.out.println(j);
            
            char a=str.charAt(i+1);
            char b=str.charAt(j+;
            	  
            System.out.println("a=" + a);
            System.out.println("b=" + b);
            
            x= (int) a;
            y= (int) b;
            System.out.println(x);
            System.out.println(y);
            
            if(x<y)
                {
                while(x!=y)
                    {
                    y--;
                    count++;
                }
            }
                if(x>y)
                    {
                    while(x!=y)
                        {
                        x--;
                        count++;
                    }
                    
                }
            }
            System.out.println("count=" +count);
        }
        }
        
    }