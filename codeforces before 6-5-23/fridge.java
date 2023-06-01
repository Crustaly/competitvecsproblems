import java.io.IOException;
import java.util.Scanner;

public class fridge {
	static int pa,ka, pb,kb,f;
	static int ansa,ansb,ansc, ansd;
	static long price;
	public static void main(String[] args) throws IOException{
	Scanner sc = new Scanner(System.in);
	price = Long.MAX_VALUE/2;
    pa= sc.nextInt();
    ka= sc.nextInt();
    pb= sc.nextInt();
    kb= sc.nextInt();
    f = sc.nextInt();
    recurse(0,0,0,f);
    System.out.println(ansa+" "+ansb+" "+ansc);
}
	static void recurse(int a, int b, int sum, int fridge) {
	
		if(fridge<=0&&sum<price) {
			ansa = a;
			ansb=b;
			ansc=sum;
			price = sum;
			return;
		}
		if(fridge<=0) {
			return;
		}
		recurse(a+1,b,sum+pa,fridge-ka);
		recurse(a,b+1,sum+pb,fridge-kb);
	}
}