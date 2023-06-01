import java.util.*;
public class numrep {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int poo = sc.nextInt();
    for(int moo=0;moo<poo;moo++){
    	boolean ans = true;
    	int n =sc.nextInt();
    	int [] nums = new int [n];
    	for(int i =0;i<n;i++) {
    		nums[i]=sc.nextInt();
    	}
    	char [] curr = new char [51];
    	String s= sc.next();
    	for(int i =0;i<n;i++) {
    		if(curr[nums[i]]=='\u0000'||curr[nums[i]]==s.charAt(i)) {
    			curr[nums[i]]=s.charAt(i);
    		}
    		else {
    			ans =false;
    			break;
    		}
    	}
    	if(ans) {
    	System.out.println("YeS");
    	}
    	else{
    		System.out.println("nO");
    	}
      
    }
  }
}