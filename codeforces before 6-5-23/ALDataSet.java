import java.util.*;
public class ALDataSet {

    public static void main(String[] args) {
        // Add code here
    	Scanner sc = new Scanner(System.in);
        System.out.println("---ArrayList Data Set---");
        System.out.println("");
        ArrayList<Integer>al = new ArrayList<Integer>();
        while(true){
        	menu();
        	int s = sc.nextInt();
        	if(s==0) {
        	 break;
        	}
        	if(s==1) {
        		int a =1;
        		while(a!=0) {

        			System.out.println("Enter a number (0 when done): ");
        			a = sc.nextInt();
        			if(a!=0) {
        			al.add(a);
        			}
        		}
        		
        	}
        	if(s==2) {
        		System.out.println("Enter the index you want to remove: ");
        		int a = sc.nextInt();
        		System.out.println(al.get(a) +" was removed at index "+a+".");
        	}
        	if(s==3) {
        		System.out.println("Enter the index where you want to insert a value: ");
        		int i =sc.nextInt();
        		System.out.println("Enter the new value: ");
        		int val = sc.nextInt();
        		System.out.println(val+" was added at index "+i);
        		al.add(val,i);

        	}
        	if(s==4) {
        		System.out.println("What index");
        		int index = sc.nextInt();
        		System.out.println("The value at index "+index+" is: "+al.get(index) );
        	}
        	if(s==5) {
        		System.out.println("The list has "+al.size()+" items.");
        	}
        	if(s==6) {
        		System.out.println("The list contains the following data");
        		System.out.println(al);
        		System.out.println(".");
        	}
        	if(s==7) {
        		int sum=0;
        		for(int i:al) {
        			sum+=i;
        		}
        		System.out.println("The total of the numbers in the list is "+sum);
        	}
        	if(s==8) {
        		int sum=0;
        		for(int i:al) {
        			sum+=i;
        		}
        		
        		System.out.println("The average of the numbers in the list is " + sum/al.size());
        	}
        	if(s==10) {
        		System.out.println("Enter the index you want to remove: ");
int index = sc.nextInt();
   
        			
        			System.out.println(al.get(index)+" was removed at index "+ index+".");
        			al.remove(index);
        		
        	}
        	if(s==9) {
        		int u = sc.nextInt();
        		int index =-1;
        		for(int i=0;i<al.size();i++) 
        		{
        			if(al.get(i)==u) {
        				index =i;
        				break;
        			}
        			if(index!=-1) {
        				System.out.println("remove successful");
        				al.remove(index);
        			}
        			else {
        				System.out.println("value not found");
        			}
        		}
        	}
        	if(s==11) {
        		
        		al.clear();
        		System.out.println("The list has been cleared");
        	}
        	}
        System.out.println("Good Bye.");
        }
        
    
    static void menu(){
    	System.out.println("-Menu-");
        System.out.println("1. Add values");
        System.out.println("2. Change a value");
        System.out.println("3. Insert a value");
        System.out.println("4. Get Index");
        System.out.println("5. Get Size");
        System.out.println("6. Print");
        System.out.println("7. Total");
        System.out.println("8. Average");
        System.out.println("9. Remove a value");
        System.out.println("10. Remove a location");
        System.out.println("11. Clear");
        System.out.println("0. Exit");
        System.out.println("Enter selection: ");
        
        
    }

}
