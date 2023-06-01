import java.util.*;

public class wordMatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(scoreGuess("i","missippi"));
	}

    public static int scoreGuess(String guess, String secret) {
        int count =0;
        for(int i =0;i<secret.length()-guess.length()+1;i++){
            if(secret.substring(i,i+guess.length()).equals(guess)){
                count++;
            }
        }
        return count*guess.length()*guess.length();
    }
}