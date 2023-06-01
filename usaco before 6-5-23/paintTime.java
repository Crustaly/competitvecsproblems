import java.io.PrintWriter;
import java.util.*;

public class paintTime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int n = sc.nextInt();
		int q = sc.nextInt();
		String s = sc.next();
		Stack <Integer> nums = new Stack<Integer>();
		int [] prefix = new int [n+1];
		int [] suffix = new int [n+1];
		for(int i=0;i<s.length();i++) {

			prefix[i+1]=prefix[i];
			if(nums.isEmpty()|| s.charAt(i)>nums.peek()+'A') {
				prefix[i+1]+=1;
				nums.add(s.charAt(i)-'A');
			}
			else if(s.charAt(i)<nums.peek()+'A'){
			while(!nums.isEmpty()&&s.charAt(i)<nums.peek()+'A') {
					nums.pop(); 
			}
			if(nums.isEmpty()||s.charAt(i)!=nums.peek()+'A') {
				nums.add(s.charAt(i)-'A');
				prefix[i+1]+=1;
			}
			}
			
			}
		nums.clear();
		for(int i=s.length()-1;i>=0;i--) {

			suffix[i]=suffix[i+1];
			if(nums.isEmpty()|| s.charAt(i)>nums.peek()+'A') {
				suffix[i]+=1;
				nums.add(s.charAt(i)-'A');
			}
			else if(s.charAt(i)<nums.peek()+'A'){
			while(!nums.isEmpty()&&s.charAt(i)<nums.peek()+'A') {
					nums.pop(); 
			}
			if(nums.isEmpty()|| s.charAt(i)!=nums.peek()+'A') {
				nums.add(s.charAt(i)-'A');
				suffix[i]+=1;
			}
			}
			
			}
		for(int i =0;i<q;i++) {
			int a = prefix[sc.nextInt()-1];
			int b = suffix[sc.nextInt()]+a;
			out.print(String.valueOf(b)+"\n");
		}
		out.close();
		

		}
	}

