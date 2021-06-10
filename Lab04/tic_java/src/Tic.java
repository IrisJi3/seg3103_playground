package tic;

public class Tic {
	
	
	static String[][] def_board=new String[3][3];

	
	public static String[][] default_Board(){
		
		for (int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {			
				Tic.def_board[i][j]= "_";
			}
		}
		return Tic.def_board;
	}
	
	public static String[][] emptyBoard(int indexI, int indexJ) {

		String[][] board = new String[indexI][indexJ];
		for (int i = 0; i < indexI; i++) {
			for (int j = 0; j < indexJ; j++) {
				board[i][j] = "_";
			}
		}
		return board;
	}
	
}
