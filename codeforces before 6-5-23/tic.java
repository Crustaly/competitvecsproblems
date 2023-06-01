import java.util.*;

public class tic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean x = true;
		char[][] board = new char [3][3];
		while(!isCat(board)) {
			printBoard(board);
			int c = 0;
			int r =0;
			if(x) {
				
				while(true) {
					System.out.println("X enter the column for your move (0-2): ");
					c = sc.nextInt();
					System.out.println("X enter the row for your move (0-2): ");
					r = sc.nextInt();
					if(r<3&&c<3)break;
					else System.out.println("Invalid move, enter a new move.");
				}
				board[r][c] = 'X';
				x = false;
			}
			else {
				while(true) {
					System.out.println("O enter the column for your move (0-2): ");
					c = sc.nextInt();
					System.out.println("O enter the row for your move (0-2): ");
					r = sc.nextInt();
					if(r<3&&c<3)break;
					else System.out.println("Invalid move, enter a new move.");
				}
				board[r][c] = 'O';
				x = true;
			}
			if(isWinner(board, 'X')) {
				System.out.println("X wins!");
				break;
			}
			if(isWinner(board, 'O')) {
				System.out.println("O wins!");
				break;
			}
			if(isCat(board))
				{System.out.println("Cats game.");
				break;
				}
		}
	}
	static boolean isWinner(char [][] board, char player) {
		boolean won = false;
		for(int i=0;i<3;i++) {
			if(board[i][0]==player&&board[i][1]==player&&board[i][2]==player)
				won = true;
			if(board[0][i]==player&&board[1][i]==player&&board[2][i]==player)
				won = true;
		}
		if(board[0][0]==player&&board[1][1]==player&&board[2][2]==player) won = true;
		if(board[0][2]==player&&board[1][1]==player&&board[2][0]==player) won = true;
		return won;
	}
	static boolean isCat(char [][] board) {
		boolean full = true;
		for(int i =0;i<3;i++) {
			for(int j =0;j<3;j++) {
				if(board[i][j]!='X'&&board[i][j]!='O')full = false;
			}
		}
		if(!isWinner(board, 'X')&&!isWinner(board,'O')&&full) {
			return true;
		}
		return false;
	}
	static void printBoard(char [][] board) {
		System.out.print(" ");
		if(board[0][0]!='X'&&board[0][0]!='O')
			System.out.print(" ");
		else System.out.print(board[0][0]);
		System.out.print(" | ");
		if(board[0][1]!='X'&&board[0][1]!='O')
			System.out.print(" ");
		else System.out.print(board[0][1]);
		System.out.print(" | ");
		if(board[0][2]!='X'&&board[0][2]!='O')
			System.out.print(" ");
		else System.out.println(board[0][2]);
		System.out.println();
		System.out.println("-----------");
		System.out.print(" ");
		if(board[1][0]!='X'&&board[1][0]!='O')
			System.out.print(" ");
		else System.out.print(board[1][0]);
		System.out.print(" | ");
		if(board[1][1]!='X'&&board[1][1]!='O')
			System.out.print(" ");
		else System.out.print(board[1][1]);
		System.out.print(" | ");
		if(board[1][2]!='X'&&board[1][2]!='O')
			System.out.print(" ");
		else System.out.print(board[1][2]);
		System.out.println();
		System.out.println("-----------");
		System.out.print(" ");
		if(board[2][0]!='X'&&board[2][0]!='O')
			System.out.print(" ");
		else System.out.print(board[2][0]);
		System.out.print(" | ");
		if(board[2][1]!='X'&&board[2][1]!='O')
			System.out.print(" ");
		else System.out.print(board[2][1]);
		System.out.print(" | ");
		if(board[2][2]!='X'&&board[2][2]!='O')
			System.out.print(" ");
		else System.out.println(board[2][2]);
		System.out.println();
	}
}