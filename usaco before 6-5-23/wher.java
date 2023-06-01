import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class wher {
	  public static void main(String[] args) throws IOException{
		    //Scanner sc = new Scanner(System.in);
		    Scanner sc = new Scanner(new File("whereami.in"));
		    FileWriter file = new FileWriter("whereami.out");
		    BufferedWriter output = new BufferedWriter(file);
		int n= sc.nextInt();
		String s = sc.next();
		boolean works = true;
		for(int i =1;i<=n;i++) {
			works = true;
			HashSet<String> poop= new HashSet<String>();
			for(int j=0;j<n-i+1;j++) {
		
				if(poop.contains(s.substring(j,j+i))) {
					works = false;
					break;
				}
				poop.add(s.substring(j,j+i));
			}
			if(works) {
				output.write(String.valueOf(i));
				break;
			}
		}
		output.close();
	}
}
