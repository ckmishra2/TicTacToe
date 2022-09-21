package tictactoe;

//class TicTacToe{

//		static char[] board =new char[10];
//		public static void main(String[] args) {
//			System.out.println("welcome to Tic Tac Toi GAME") ;
//			board() ;                            //calling the method board in main method	
//		}
//		public static void board() 
//		{
//			for(int i=1;i < 10 ; i++) {
//				board[i] =' ';
//			}
//
//		}
//
//	}
public class TicTacToe{
	static char[] board = new char[10];
	public static void main(String[] args) {
	System.out.println("Welcome to Tic Tac Toe");
	board();
	}	
	public static void board() {
		for(int i=1; i<10; i++) {
			board[i]=' ';
		}
	}
}
