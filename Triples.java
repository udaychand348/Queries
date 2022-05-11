//Triples programme codeforces1

import java.util.*;
public class Main
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int T=sc.nextInt();
while(T>0)
{
int n=sc.nextInt();
int[] a=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
ArrayList<Integer> al=new ArrayList<>();
for(int i=0;i<n;i++)
{
       al.add(a[i]);
}
Map<Integer,Integer> hm=new TreeMap<>();
for(int i:al)
{
 Integer k=hm.get(i);
 hm.put(i, (k== null) ? 1 : k + 1);
}
int max=0,max1=0;
for(Map.Entry<Integer, Integer> val : hm.entrySet())
{
              if(val.getValue()>=max)
              {
                max=val.getValue();
                max1=val.getKey();
              }
 }
if(max<3)
{
System.out.println(-1);
}
else
{
 System.out.println(max1);
}
T=T-1;
 }
   }
}