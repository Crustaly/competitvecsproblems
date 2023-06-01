import java.util.*;
import java.lang.*;
import java.io.*;
public class fieldReduc{

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    //Scanner sc = new Scanner(new File("reduce.in"));
    FileWriter file = new FileWriter("reduce.out");
    BufferedWriter output = new BufferedWriter(file);
    int n =sc.nextInt();
    int [][] points = new int [n][2];
    int ans = Integer.MAX_VALUE;
    TreeSet<Integer> x = new TreeSet<Integer>();
    TreeSet<Integer> y = new TreeSet<Integer>();
    int [] maxx = new int [4];
    int [] minx = new int [4];
    int [] maxy = new int [4];
    int [] miny = new int [4];
    for(int i =0;i<n;i++) {
    	points[i][0]=sc.nextInt();
    	points[i][1]=sc.nextInt();
    	x.add(points[i][0]);
    	y.add(points[i][1]);
    }
    for(int i =0;i<4;i++) {
    	maxx[i]=x.last();
    	x.remove(maxx[i]);
    }
    for(int i =0;i<4;i++) {
    	x.add(maxx[i]);
    }
    for(int i =0;i<4;i++) {
    	minx[i]=x.first();
    	x.remove(minx[i]);
    	
    }
    for(int i =0;i<4;i++) {
    	maxy[i]=y.last();
    	y.remove(maxy[i]);
    }
    for(int i =0;i<4;i++) {
    	y.add(maxy[i]);
    }
    for(int i =0;i<4;i++) {
    	miny[i]=y.first();
    	y.remove(miny[i]);
    	
    }

   
    for(int i =0;i<4;i++) {
    	for(int j=0;j<4;j++) {
    		for(int k=0;k<4;k++) {
    			for(int l=0;l<4;l++) {
    				 int count =0;
    				for(int p=0;p<n;p++ ) {
    					if(points[p][0]<minx[i]||points[p][0]>maxx[j]||points[p][1]<miny[k]||points[p][1]>maxy[l]) {
    						count++;
    					}
    				}
    				if(count<=3) {
    					ans=Math.min(ans, (maxx[j]-minx[i])*(maxy[l]-miny[k]));
    				}
    			}
    		}
    	}
    }
    




    System.out.println(ans);

    output.write(String.valueOf(ans));

    output.close();
  }


}



