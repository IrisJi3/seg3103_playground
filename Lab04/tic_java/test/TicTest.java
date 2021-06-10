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
		
	String[] [] result3 = {{"_","_","_"},{"_","_","_"},{"_","_","_"}};	
	assertEquals(result3, obj.emptyBoard(2,3));		
	}
	
	
	
}