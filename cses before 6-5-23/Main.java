import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i<n; i++)
		{
			int x = sc.nextInt();
			int [] age = new int[x];
			String [] occ = new String[x];
			for(int a = 0; a<x; a++)
			{
				String temp = sc.next();
				temp += " " +sc.next();
				temp += " " +sc.next();
				occ[a] = temp;
				age[a] = sc.nextInt();
			}
			String best = "XXXXXXXX";
			int maxage = 100;
			for(int a = 0; a<x; a++)
			{
				if(occ[a].contains("Peasant"))
				{
					if(occ[a].contains("Stroud")==false)
					{
						if(age[a]>=21&&age[a]<=60)
						{
							if(Math.abs(age[a]-25)<=Math.abs(maxage-25))
							{
								if(age[a]<=maxage)
								{
									maxage = age[a];
									if(occ[a].charAt(0)<best.charAt(0))
									{
										best = occ[a];
									}	
								}
							}
						}
					}
				}
				
			}
			if(best!="XXXXXXXX")
			{
				int  c = best.lastIndexOf(" ");
				System.out.println(best.substring(0,c));
			}
			
		}








		
	}

}

