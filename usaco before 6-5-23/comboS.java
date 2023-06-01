import java.util.*;
import java.lang.*;
import java.io.*;
public class comboS {
static int l,c;
static String [] vowels= {"a","e","i","o","u"};
static String [] chars;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);

    l =sc.nextInt();
   c=sc.nextInt();
    chars = new String [c];
    for(int i =0;i<c;i++) {
    	chars[i]=sc.next();
    }
    Arrays.sort(chars);
    generateID("",-1,0);

    



  }
  static void generateID(String str,int pos,int numVowels) {
	  if(str.length()==l) {

		  if(numVowels>=1&&l-numVowels>=2) {
			  System.out.println(str);
			  
		  }
		  return;
	  }
	  for(int i =pos+1;i<c;i++) {
		  generateID(str+chars[i],i,numVowels+isVowel(chars[i]));
	  }
	  
  }
  static int isVowel(String s) {
	  for(int i =0;i<vowels.length;i++) {
		  if(s.equals(vowels[i])) {
			  return 1;
		  }
	  }
	  return 0;  }
   

}



