import java.io.*;
import java.util.StringTokenizer;
import java.util.*;
public class multTable{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n =sc.nextInt();
		long low = 1, high = n * n, mid, leq;

		// binary search to find the median
		while (low < high)
		{
			mid = (low + high) / 2;
			leq = 0;
			for (int i = 1; i <= n; i++)
			{
				leq += Math.min(n, mid / i);
			}
			if (leq >= (n * n + 1) / 2)
			{
				high = mid;
			}
			else
			{
				low = mid + 1;
			}
		}
System.out.println(high);
	}
}	