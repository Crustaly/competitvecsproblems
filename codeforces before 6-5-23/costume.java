import java.util.*;
import java.io.*;
 public class costume {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int fill =sc.nextInt();
    while(sc.hasNextInt()) {
    	
    	ArrayList<Integer> values = new ArrayList<Integer>();
    	ArrayList<Integer> left = new ArrayList<Integer>();
    	
    	values.add(0);
    	while(sc.hasNextInt()) {
        	int a =sc.nextInt();
    		if(a==0) {
    			break;
    		}
    		else values.add(a);
    	
    	}
    	Collections.sort(values);
    	
    	for(int i =1;i<=values.get(values.size()-1);i++) {
    		left.add(i);
    	}
    	boolean works =true;
    	boolean[] ans = new boolean [values.size()]; 
    	for(int i=0;i<values.size();i++) {
    		for(int j =i+1;j<values.size();j++) {
    			if(!ans[(values.get(j)-values.get(i))-1]) {
    				ans[(values.get(j)-values.get(i))-1]=true;
    			}
    			else {
    				works = false;
    			}
    		}
    	}
    	if(!works) {
    		System.out.println("not a ruler");
    	}
    	else {
    		int count =0;
    		for(int i =1;i<ans.length;i++) {
    			if(ans[i]) {
    				count++;
    			}
    		}
    		if(count<ans.length) {
    			System.out.print("missing ");
    		
    			for(int i =1;i<ans.length;i++) {
        			if(!ans[i]) {
        			System.out.println(i);
        			}
        		}
    		System.out.println();
    		}
    		else {
    			System.out.println("perfect");
    		}
    		
    	}
    	}
  }
 }