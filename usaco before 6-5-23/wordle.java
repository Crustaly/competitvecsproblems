import java.util.*;
import java.lang.*;
import java.io.*;
public class wordle{

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);

    int n =sc.nextInt();
    int [][] data = new int [n][4];
    int [][] correct = new int [n][2];
    boolean works=true;
    for(int i=0;i<n;i++) {
    	int poo=sc.nextInt();
    	data[i][3]=poo%10;
   	  data[i][2]=poo%100/10;
   	  data[i][1]=poo%1000/100;
   	  data[i][0]=poo%10000/1000;
    	correct[i][0]=sc.nextInt();
    	correct[i][1]=sc.nextInt();
    }
    int [] codeDigit =new int[4];
	int index =0;
	
  for(int i =1000;i<10000;i++) {

	  codeDigit[3]=i%10;
	  codeDigit[2]=i%100/10;
	  codeDigit[1]=i%1000/100;
	  codeDigit[0]=i%10000/1000;
	   works=true;

	 
	int [] tempData=new int [4];
		  for(int k=0;k<n;k++) {
			  
			  for (int p=0;p<4; p++) {
				  tempData[p]=data[k][p];
			  }
			  codeDigit[3]=i%10;
			  codeDigit[2]=i%100/10;
			  codeDigit[1]=i%1000/100;
			  codeDigit[0]=i%10000/1000;
			  int yesyes =0;
			  int yes=0;
			  for(int galli=0;galli<4;galli++) {
					if(tempData[galli]==codeDigit[galli]) {
					yesyes++;
					tempData[galli]= -110;
					codeDigit[galli]=-101009;
					}
					}
			
			  for(int j=0;j<4;j++) {
				  

			index=-100;
			
			//yes checker
			 for(int poo =0;poo<4;poo++) {
				 if(tempData[poo]==codeDigit[j]) {
					 index=poo;
					 yes++;
					 tempData[poo]=-10310;
					 break;
				 }
			 }
			 
		
			  }
			
	
		  if(!(yesyes==correct[k][0]&&yes==correct[k][1])) {
			  works=false;
			  break;
			  
		  }
		
		  }
		  if(works) {
			  System.out.println(i);
			  break;
		  }
  }
  if(!works) {
	  System.out.println("NONE");
  }
  

  }

}




