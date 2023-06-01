import java.util.*;
public class subarray{
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int n =sc.nextInt();
    int [] a = null;
    for(int i = 0;i<n;i++){
      int poo = sc.nextInt();
      a = new int [poo]; 
      int even = 0;
      int odd = 0;
 
      for(int j = 0;j<poo;j++){
        a[j]=sc.nextInt();
 
      }
      for(int j=0;j<poo;j++){
       if(a[j]%2==0){
         even++;
       }
        else{
          odd++;
        }
      }
      if(even>odd){
        System.out.println(odd);
      }
      else{
        System.out.println(even);
      }
      }
      }
  }