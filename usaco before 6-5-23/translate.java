import java.util.*;
import java.lang.*;
import java.io.*;
public class translate{

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);

    int n =sc.nextInt();
    int m =sc.nextInt();
    String [] phrases = new String [n];
    String [] prefixes = new String [m];
    int ans=0;
  
    String fill=sc.nextLine();
    for(int i=0;i<n;i++) {
    	phrases[i]=sc.nextLine();
    }
    for(int i =0;i<m;i++){
    	prefixes[i]=sc.nextLine();
    }  
    Arrays.sort(phrases);
    Arrays.sort(prefixes);
  
    
    for(String i :prefixes) {
    	int lb = lowerbound(i, phrases);
    	if(lb>=phrases.length) {
    		continue;
    	}
    	if(isPrefix(phrases[lb],i)) {
    		
    		ans++;
    	}
    }
   



    System.out.println(ans);

  }
  static int lowerbound(String a, String [] arr) {
	  int l=0;
	  int r=arr.length;
	  while(l<r) {
		  int mid=(l+r)/2;
		  if(a.compareTo(arr[mid])<=0) {
			  r=mid;
			  
		  }
		  else {
			  l=mid+1;
		  }
		 
	  }
	  return l;
  }

static boolean isPrefix(String phrase, String prefix) {
	boolean works=true;
	if(phrase.length()<prefix.length()) {
		return false;
	}
	for(int i=0;i<prefix.length();i++) {
		if(prefix.charAt(i)!=phrase.charAt(i)) {
			works=false;
			break;
		}
	}

	return works;
}
}



