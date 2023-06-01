import java.util.*;

public class findReplace {
	static int [] adj;
	static boolean [] visited;
	static boolean isCycle, isInvalid;
	static boolean  [] cycle;
	static int inDegree [];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String s =sc.nextLine();
		for(int cas =0;cas<t;cas++) {
			String a = sc.nextLine();
			String b =sc.nextLine();
			System.out.println(solve(a,b));
		}

	}
	static int solve(String a,String b) {
		if(a.equals(b))return 0;
		adj = new int [52];
		Arrays.fill(adj, -1);
		HashSet<Integer>unique = new HashSet<Integer>();
		inDegree = new int [52];
	    for(int i =0;i<a.length();i++) {
	    	int indexa =0;
	    	int indexb =0;
	    	if(Character.isLowerCase(a.charAt(i))) {
	    		indexa = a.charAt(i)-'a';
	    	}
	    	if(Character.isUpperCase(a.charAt(i))) {
	    		indexa = a.charAt(i)-'A'+26;
	    	}
	    	if(Character.isLowerCase(b.charAt(i))) {
	    		indexb = b.charAt(i)-'a';
	    	}
	    	if(Character.isUpperCase(b.charAt(i))) {
	    		indexb = b.charAt(i)-'A'+26;
	    	}
	    	if(adj[indexa]==-1) {
	    		inDegree[indexb]++;
		    	adj[indexa] = indexb;
	    	}
	    	
	    	else if(adj[indexa]!=indexb) {
	    		return -1;
	    	}
	    	unique.add(indexb);
	    }
	    if(unique.size()==52) {
	    	return -1; 
	    }
	    int ans =0;
	    for(int i =0;i<52;i++) {
	    	if(adj[i]!=-1&&adj[i]!=i) {
	    		ans++;
	    	}
	    	if(adj[i]==i) {
	    		adj[i]=-1;
	    	}
	    }

	    visited = new boolean [52];
	    for(int i =0;i<52;i++) {
	    	if(!visited[i]&&adj[i]!=-1&&adj[i]!=i) {
	    		isCycle = false;
	    		isInvalid =false;
	    		cycle = new boolean[52];
	    		dfs(i);

	    		if(isCycle) {
	    			if(!isInvalid) {
	    				ans+=1;
	    			}
	    		
	    		}
	    	}
	    }
	    return ans;
	    
	}
	static void dfs(int node) {
		visited[node]=true;
		cycle[node]=true;

		int i = adj[node];
		if(i==-1) {
			return;
		}

			if(cycle[i]&&i!=node) {
				isCycle = true;
				for(int j=0;j<52;j++) {
					if(cycle[j]&&inDegree[j]!=1) {
						isInvalid = true;
					}
				}
			}
			if(!visited[i]) {
				dfs(i);
			}
		}
		
	}
