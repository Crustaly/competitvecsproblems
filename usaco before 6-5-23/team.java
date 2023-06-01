import java.util.*;
import java.lang.*;
import java.io.*;
public class team {
static int [] skills;
static int [] teamLevels,teamSize;
static int min;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);


    skills = new int [12];
    for(int i=0;i<12;i++) {
    	skills[i]=sc.nextInt();
    }
    min=Integer.MAX_VALUE;

      teamLevels = new int [4];
      teamSize = new int [4];
     combos(0);
     System.out.println(min);



  }
  static void combos(int i) {
	  if(min==0) {
		  return;
	  }
	  if(i==12) {
		  min=Math.min(min,max(teamLevels)-min(teamLevels) );
		  return;
	  }
	  for(int p=0;p<=3;p++) {
		  teamLevels[p]+=skills[i];
		  teamSize[p]++;
		  combos(i+1);
		  teamLevels[p]-=skills[i];
		  teamSize[p]--;
	  
	  }
	  
  }
  static int max(int[] a) {
	  int poo =0;
	for(int i =0;i<4;i++) {
		poo=Math.max(poo, a[i]);
	}
	return poo;
  }
  static int min(int[] a) {
	  int poo =Integer.MAX_VALUE;
	for(int i =0;i<4;i++) {
		poo=Math.min(poo, a[i]);
	}
	return poo;
  }


}



