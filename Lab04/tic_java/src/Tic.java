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
	
	public static String[][] emptyBoard(int indexI, int indexJ) {

		String[][] board = new String[indexI][indexJ];
		for (int i = 0; i < indexI; i++) {
			for (int j = 0; j < indexJ; j++) {
				board[i][j] = "_";
			}
		}
		return board;
	}
	
	public static int boardSize(String b[][]){
		
		return (b.length)*(b[0].length);
	}
	
	public static String boardPositions (boolean player, int x, int y) {
		String sign = "_";
		if(player) 
			sign ="X";
		else 
			sign ="O";
		
		if(Tic.map[x][y]=="_")
			return Tic.map[x][y] = sign;
		else if(Tic.map[x][y]=="X" || Tic.map[x][y]=="O")
			return "N";					
		
	return Tic.map [x][y];
	}
	
	public static boolean winner(String[][] para) {
	
		para=Tic.map;
		
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
