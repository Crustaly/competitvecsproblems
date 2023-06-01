import java.util.*;
public class car {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        System.out.println("---Car Sales Tracker---");
        System.out.println();
        System.out.println("Please enter the sales for the first 8 months of the year: ");
        ArrayList<Double> sales= new ArrayList<Double>();
        ArrayList<Double> salesback= new ArrayList<Double>(8);
        for (int i = 0; i < 8; i++) {
      	  salesback.add((double)0);
      	}
        double total =0;
        double high =0;
        double low =Integer.MAX_VALUE;

        for(int i =0;i<8;i++) {
        	System.out.println("Enter the sales amount for month "+i+":" );
        	sales.add(sc.nextDouble());
        	salesback.set(8-i-1,sales.get(i));
        	high = Math.max(high, sales.get(i));
        	low = Math.min(low, sales.get(i));
        	total+=sales.get(i);
        }
        System.out.println();
        System.out.println("The following are the sales amounts for the first 8 months of the year : ");
        System.out.println(sales);
        System.out.println();
        System.out.println("Sales amounts in reverse order");
        System.out.println(salesback);
        System.out.println("The total sales amount: "+total);
        System.out.println("The average sales amount: "+total/8);
        System.out.println("The highest sales amount: "+high);
        System.out.println("The lowest sales amount: "+low);
        System.out.println("The range of sales amounts: "+(high-low));
        Collections.sort(sales);
        System.out.println("The sales in order from least to greatest: ");
        System.out.println(sales);
        
    }

}
