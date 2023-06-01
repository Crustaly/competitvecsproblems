import java.util.*;
import java.lang.*;
import java.io.*;
public class convention2{

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    //Scanner sc = new Scanner(new File("convention2.in"));
    FileWriter file = new FileWriter("convention2.out");
    BufferedWriter output = new BufferedWriter(file);
    int n =sc.nextInt();
     cow [] list = new cow[n];
    for(int i =0;i<n;i++) {
    	int a =sc.nextInt();
    	int b=sc.nextInt();
         list[i]= new cow(a,b,i);
    	}
    Arrays.sort(list);
	PriorityQueue<cow> pq = new PriorityQueue<cow>( new Comparator<cow>() {
		public int compare(cow a, cow b) {
			return a.senior-b.senior;
		}
	});
    int time=0;
    int ans =0;
    int curCow =0;
    while(!pq.isEmpty()||curCow<n) {
    	// this cow goes to q
    	if(curCow<n&&list[curCow].start<=time) {
    		pq.add(list[curCow]);
    		curCow++;
    	}
    	//cow can go eat, no one in q
    	else if(pq.isEmpty()) {
    		time= list[curCow].time+list[curCow].start;
    		curCow++;
    	}
    	//someone in q can eat
    	else {
    		cow  poo =pq.poll();
    		ans = Math.max(ans,time- poo.start);
    		time+=poo.time;
    	}
    }
    




  System.out.println(ans);

    output.write(String.valueOf(ans));

    output.close();
  } 
static class cow implements Comparable<cow>
 {
	 public int start; 
	 public int time; 
	 public int senior;
	 public cow(int s, int t, int se) {
		 start =s;
		 time = t;
		 senior = se; 
	 }
	 public int compareTo(cow otra) {
		 return this.start - otra.start;
	 }
	 
 }
 }
  