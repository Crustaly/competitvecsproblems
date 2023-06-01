import java.util.*;
public class elephant{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int d = sc.nextInt();
    TreeSet <Integer> nums = new TreeSet<>();
    int [] bs =new int [n];
    for(int i=0;i<n;i++) {
    	bs[i]=sc.nextInt();
    	nums.add(bs[i]);
    	
    }
    int ans =0;
    for(int i:bs) {
    	ans+=Arrays.binarySearch(bs,nums.lower(bs[i]+d))-i;
    }
System.out.println(ans);

    

  }

}