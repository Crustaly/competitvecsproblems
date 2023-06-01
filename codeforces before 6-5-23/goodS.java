import java.util.*;
import java.lang.*;
import java.io.*;
public class goodS{

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    
    int t =sc.nextInt();
    for (int x = 0; x < t; x++) { 
		int arrayLength = sc.nextInt();
		String array = sc.next();
		System.out.println(solve(arrayLength, array));
	}



  }

		static long solve (int arrayLength, String stringArray) {
			int[] array = new int[arrayLength + 1];
			for (int x = 1; x <= arrayLength; x++) {  
				array[x] = stringArray.charAt(x - 1) - '0';
			}
			for (int x = 1; x <= arrayLength; x++) { 
				array[x] += array[x - 1];
			}
			Map<Integer, Long> sumDist = new HashMap<>();
			for (int x = 0; x <= arrayLength; x++) {  
				if (sumDist.containsKey(array[x] - x)) {  
					sumDist.put(array[x] - x, sumDist.get(array[x] - x) + 1);
				}
				else {  
					sumDist.put(array[x] - x, (long) 1);
				}
			}
			
			long goodArrays = 0;
			for (int key : sumDist.keySet()) {  
				long f = sumDist.get(key);
				// sum of all positive integers less than f
				goodArrays += f * (f - 1) / 2;
			}
			return goodArrays;
		}


}



