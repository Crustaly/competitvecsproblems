import java.util.*;

public class seating {
	static ArrayList<String> students;
	static ArrayList<Integer> seats; 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter students; names on their own line (Enter \"Done\" when finished):");
		students = new ArrayList<String>();
		seats = new ArrayList<Integer>();
		while(sc.hasNext()) {
			String s = sc.next();
			if(s.equals("Done")) {
				break;
			}
			students.add(s);
		}
		System.out.println();
		System.out.println("Enter the number of seats in your classroom: ");
		int n = sc.nextInt();
		if(n<students.size()) {
			System.out.println("Error not enough seats.");
		}
		else {
			for(int i =1;i<n+1;i++) {
				seats.add(i);
			}
			System.out.println();
			System.out.println("The seating chart is: ");
			System.out.println(seatingChart(students, seats));
			
		}
	}
	static String seatingChart(ArrayList<String>students, ArrayList<Integer> seats) {
		ArrayList<Integer>order = new ArrayList<Integer>();
		String ans = "";
		for(int i =0;i<students.size();i++) {
			int a = (int)(Math.random() * seats.size());
			int k = seats.get(a);
			order.add(k);
			seats.remove(a);
		}
		for(int i =0;i<students.size();i++) {
			ans+=students.get(i);
			ans+="-";
			ans+=order.get(i);
			ans+="\n";
		}
		return ans;
	}
}