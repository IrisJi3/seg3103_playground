package tic;

public class Tic {
	
	
	static String[][] def_board=new String[3][3];
	static String [][] map=Tic.default_Board();
	
	public static String[][] default_Board(){
		
		for (int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {			
				Tic.def_board[i][j]= "_";
			}
		}
		return Tic.def_board;
	}
	public static String[][] emptyBoard(int row, int col) {

		String[][] board = new String[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				board[i][j] = "_";
			}
		}
		return board;
	}
	
	
	public static int boardSize(String b[][]){
		
		return (b.length)*(b[0].length);
	}
	
	public static String boardPositions (boolean player, int row, int col) {
		String sign = "_";
		if(player) 
			sign ="X";
		else 
			sign ="O";
		
		if(Tic.map[row][col]=="_")
			return Tic.map[row][col] = sign;
		else if (Tic.map[row][col]=="X" || Tic.map[row][col]=="O") 
			return "N";					
		
	return Tic.map [row][col];
}

	public static boolean winner() {
		
	if (Tic.map [0][0]=="X" && Tic.map [1][0]=="X" && Tic.map [2][0]=="X")
		return true;
	else if (Tic.map [0][0]=="X" && Tic.map [1][1]=="X" && Tic.map [2][2]=="X")
		return true;
	else if (Tic.map [0][0]=="X" && Tic.map [0][1]=="X" && Tic.map [0][2]=="X")
	    return true;
	else if (Tic.map [1][0]=="X" && Tic.map [1][1]=="X" && Tic.map [1][2]=="X")
	    return true;
	else if (Tic.map [0][1]=="X" && Tic.map [1][1]=="X" && Tic.map [2][1]=="X")
	    return true;
	else if (Tic.map [2][0]=="X" && Tic.map [2][1]=="X" && Tic.map [2][2]=="X")
	    return true;
	else if (Tic.map [0][2]=="X" && Tic.map [1][2]=="X" && Tic.map [2][2]=="X")
	    return true;
	else 
	    return false;
}

}
