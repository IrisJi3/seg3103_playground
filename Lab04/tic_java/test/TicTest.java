package tic;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class TicTest {
	Tic obj = new Tic();
	@Test
	void test_defaultBoard() {
        String[] [] map = {{"_","_","_"},{"_","_","_"},{"_","_","_"}};
		assertEquals(map,obj.default_Board());
	}
	
	@Test
	void test_emptyBoard() {
		
	String[] [] result2 = {{"_","_"},{"_","_"}};	
	assertEquals(result2, obj.emptyBoard(2,2));		
	}
	
	@Test
	void test_boardSize() {
		String[][] result= obj.emptyBoard(4, 4);
	    assertEquals(13,obj.boardSize(result));
	}
	
}