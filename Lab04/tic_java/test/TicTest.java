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
	    assertEquals(16,obj.boardSize(result));
	}
	
		@Test
	void test_boardPositions() {
		/*
		 _ X O
		 _ X _
		 O X O 
		 
		 player 1: X - true
		 player 2: O - false
		 */
		assertEquals("X", obj.boardPositions(true, 0, 1));
		assertEquals("O", obj.boardPositions(false, 0, 2));
		assertEquals("X", obj.boardPositions(true, 1, 1));
		assertEquals("O", obj.boardPositions(false, 2, 0));
		assertEquals("X", obj.boardPositions(true, 2, 1));
		assertEquals("O", obj.boardPositions(false, 2, 2));
		assertEquals("X", obj.boardPositions(true, 2, 2));
		//assertEquals("N", obj.boardPositions(true, 2, 2));
	}
	
}