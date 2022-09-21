package tictactoe;

import java.util.Scanner;

public class TicTacToe {
	static char[] board = new char[10];
	static char Player_letter;
	static char Computer_letter;

	public static void main(String[] args) {
		System.out.println("welcome to Tic Tac Toi GAME");
		board(); 

		chooseLetter();
	}

	public static void board() {
		// giving each array index value as empty initially
		for (int i = 1; i < 10; i++) {
			board[i] = ' ';
		}

	}

	public static void chooseLetter() {
		Scanner s = new Scanner(System.in);
		System.out.println("please  select X  or O ");
		char letter = s.next().charAt(0); 
		if (letter == 'X') {
			Player_letter = letter;
			Computer_letter = 'O';
		} else if (letter == 'O') {
			Player_letter = letter;
			Computer_letter = 'X';
		} else { 
			System.out.println("wrong selection ! Now computer will assign letters.");
			Computer_letter = 'X';
			Player_letter = 'O';
		}
		System.out.println("player letter is " + Player_letter);
		System.out.println("computer letter is " + Computer_letter);
	}

}
