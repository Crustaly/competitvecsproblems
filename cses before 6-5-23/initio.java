

import java.util.*;
import java.lang.*;
import java.io.*;
public class initio {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i<t; i++)
		{
			int n = sc.nextInt();
			int x = sc.nextInt();
			int[] strength = new int[n];
			int[] friends = new int[n];
			for(int a = 0; a<n; a++)
			{
				strength[a] = sc.nextInt();
			}
			for(int b = 0; b<n; b++)
			{
				friends[b] = sc.nextInt();
			}
			int temp = 0;
			for(int c = 0; c<n; c++)
			{
				if(friends[c]==0)
				{
					temp += strength[c];
					strength[c] = 0;
				}
				
						
			}
			Arrays.sort(strength);
			x = x- temp;
			int count = 0;
			if(x<=0)
			{
				System.out.println(count);
				
			}
			else {
			for(int l = n-1; l>=0;l--)
			{
				x = x- strength[l];
				count++;
				if(x<=0)
				{
					System.out.println(count);
					break;
				}
				
			}
			
			
		}
		}
	}

}
