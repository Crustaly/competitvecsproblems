import java.util.*;
import java.lang.*;
import java.io.*;
public class rutastucka {

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    ArrayList<Integer> east=new ArrayList<Integer>();
    ArrayList<Integer> north=new ArrayList<Integer>();
    int [] xcoords=new int [n];
    int [] ycoords=new int [n];
    for(int i =0;i<n;i++) {
    	char dir=sc.next().charAt(0);
    	if(dir=='E') {
    		east.add(i);
    	}
    	else {
    		north.add(i);
    	}
    	xcoords[i]=sc.nextInt();
    	ycoords[i]=sc.nextInt();
    }
    east.sort(Comparator.comparingInt(j->ycoords[j]));
    north.sort(Comparator.comparingInt(j->xcoords[j]));
    int [] numstopped=new int [n];
    boolean [] stopped=new boolean [n];

    for(int i:east) {
    	for(int j:north) {
    		if(stopped[i]==false&&stopped[j]==false
    				&&xcoords[j]>xcoords[i]&&ycoords[i]>ycoords[j]) {
    			//figure out which one gets stopped
    			int xdif=xcoords[j]-xcoords[i];
    			int ydif=ycoords[i]-ycoords[j];
    			if(ydif<xdif) {
    				//east is stopped
    				stopped[i]=true;
    				numstopped[j]++;
    				numstopped[j]+=numstopped[i];
    			}
    			if(ydif>xdif) {
    				//north is stopped
    				stopped[j]=true;
    				numstopped[i]++;
    				numstopped[i]+=numstopped[j];
    			}
    		}
    	}
    }

     for(int i:numstopped) {
    	 System.out.println(i);
     }

  }


}



