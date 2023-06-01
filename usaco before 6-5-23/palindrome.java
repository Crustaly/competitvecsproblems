import java.util.*;
import java.lang.*;
import java.io.*;
public class palindrome {

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    String n="";
    while(sc.hasNextLine())
    {
         n+=sc.nextLine();
         n+='\n';
         
    }
    
    String f = "";
    List<Integer> indexes = new ArrayList<Integer>();
    


   for(int index=0;index<n.length();index++) {
    	if (Character.isLetter(n.charAt(index))){
    		indexes.add(index);
    		f+=Character.toLowerCase(n.charAt(index));
    		
    	}
    }
       
    
    int maxlen=0;
    int start=0;
    int end =0;
    int ms =0;
    int me =0;
    for(int i =0;i<f.length();i++) {
    	start=i;
    	end=i;
    	
    	while(start-1>=0&&end+1<f.length()&&f.charAt(start-1)==f.charAt(end+1)){
    	
    		start--;
    		end++;
    	}
    	if(start<0||end>f.length()-1) {
    		start++;
    		end--;
    	
    	}
    
    	
    		if(end-start+1>maxlen) {
    		
    			maxlen=end-start+1;
    			ms=start;
    			me = end;

    	}
    }
    for(int i =0;i<f.length()-1;i++) {
    	start=i;
    	end=i+1;
    	if(f.charAt(start)==f.charAt(end)) {
    		
    	
    	while(start-1>=0&&end+1<f.length()&&f.charAt(start-1)==f.charAt(end+1)){
    	
    		start--;
    		end++;
    	}
    	
    	if(start<0||end>f.length()-1) {
    		start++;
    		end--;
    	
    	}
    	
    	
    		if(end-start+1>maxlen) {
    
    			maxlen=end-start+1;
    			ms=start;
    			me = end;

    	}
    	}
    }
    
    
    System.out.println(maxlen);

  
    System.out.println( n.substring(indexes.get(ms),(indexes.get(me)+1) ));
  }


}




