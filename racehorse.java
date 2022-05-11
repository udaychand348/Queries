/*Racing Horses problem 
 from codechef*/
 
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T>0)
		{
		    int N=sc.nextInt();
		    int[] S=new int[N];
		    for(int i=0;i<N;i++)
		    {
		        S[i]=sc.nextInt();
		    }
		    Arrays.sort(S);
		    int min=(S[N-1]-S[0]);
		    for(int i=0;i<(S.length-1);i++)
		    {
		        int min1=Math.abs(S[i+1]-S[i]);
		        min=Math.min(min,min1);
		    }
		    System.out.println(min);
		    T=T-1;
		}
	}
}
