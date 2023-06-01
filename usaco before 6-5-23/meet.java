// Arup Guha
// 1/8/2020
// Solution for 2012 December USACO Bronze Problem: Meet and Greet

import java.util.*;
import java.io.*;

public class meet {

	public static void main(String[] args) {
		
		// Read in the basic graph parameters.
		Scanner sc=new Scanner(System.in);
		int nBessie = sc.nextInt();
		int[] posB = new int[1000001];
		int nElsie = sc.nextInt();
		int[] posE = new int[1000001];
		
		// Since the input is small, at each time step I can store where bessie is.
		int curIdx = 1, stepsBessie = 0, stepsElsie = 0;
		for (int i=0; i<nBessie; i++) {
			int t = sc.nextInt();
			stepsBessie += t;
			char dir = sc.next().charAt(0);
			int dx = dir == 'L' ? -1 : 1;
			for (int step=0; step<t; step++,curIdx++) 
				posB[curIdx] = posB[curIdx-1] + dx;
		}
		
		// She never moves afterwards.
		for (int i=stepsBessie+1; i<posB.length; i++)
			posB[i] = posB[stepsBessie];
		
		// I do the same for Elsie.
		curIdx = 1;
		for (int i=0; i<nElsie; i++) {
			int t = sc.nextInt();
			stepsElsie += t;
			char dir = sc.next().charAt(0);
			int dx = dir == 'L' ? -1 : 1;
			for (int step=0; step<t; step++,curIdx++) 
				posE[curIdx] = posE[curIdx-1] + dx;
		}
		
		// She never moves afterwards.
		for (int i=stepsElsie+1; i<posE.length; i++)
			posE[i] = posE[stepsElsie];		

		// Now, for them to meet, they have to be apart and then together on consecutive time steps.
		int res = 0;
		for (int i=1; i<=Math.max(stepsBessie, stepsElsie); i++)
			if (posB[i-1] != posE[i-1] && posB[i] == posE[i])
				res++;
		
		System.out.println(res);
	}
	
}