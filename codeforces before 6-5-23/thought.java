import java.util.*;
import java.lang.*;
import java.io.*;
public class thought {
static HashMap<Integer, int []> map;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    map = new HashMap<Integer, int []>();
    generate();
    int n =sc.nextInt();
    for(int i =0;i<n;i++) {
    	int a =sc.nextInt();
    	if(map.containsKey(a)) {
    		int [] ops =map.get(a);
    		System.out.print("4 "+opprint(ops[0])+" 4 "+opprint(ops[1])+" 4 "+opprint(ops[2])+" 4 ");
    		System.out.print(" = "+a);
    		System.out.println();
    	}
    	else System.out.println("no solution");
    }


  }
  static void generate() {

	 for(int i =0;i<4;i++) {
		 for(int j =0;j<4;j++) {
			 for(int k=0;k<4;k++) {
				 ArrayList<Integer>nums = new ArrayList<Integer>();
				 nums.add(4);
				 nums.add(4);
				 nums.add(4);
				 nums.add(4);
				 int [] ops = {i,j,k};
				 int index=0;
				 for(int l:ops) {
					 if(l>=2) {
						 nums.add(index,operate(nums.get(index), nums.get(index+1), l));
						nums.remove(index+1);
						nums.remove(index+1);
					 }
					 else {
						 index++;
					 }
				 }
				 index=0;
				 for(int l:ops) {
					 if(l<2) {
					nums.add(index,operate(nums.get(index), nums.get(index+1), l));
					nums.remove(index+1);
					nums.remove(index+1);
				 }
				 }
				 map.put(nums.get(0), ops);

				 
			 }
		 }
	 }
	
	  
  }
  static String opprint(int c) {
	  if(c==0)return "+";
	  if(c==1)return "-";
	  if(c==2)return "*";
	  if(c==3)return "/";
	  return "";
  }
  static int operate(int a, int b, int c) {
	  if(c==0)return a+b;
	  if(c==1)return a-b;
	  if(c==2)return a*b;
	  if(c==3)return a/b;
	  return 0;
  }
}