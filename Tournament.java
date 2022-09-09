/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    long[] ar=new long[n];
	    for(int i=0;i<n;i++){
	        ar[i]=sc.nextInt();
	    }
	    Arrays.sort(ar);
		long sum = 0;
		long revenue = 0;
		for(int i=0;i<n-1;i++){
		    sum += ar[i];
		    revenue += ar[i+1]*(i+1)-sum;
		}
		System.out.println(revenue);
		// your code goes here
	}
}
