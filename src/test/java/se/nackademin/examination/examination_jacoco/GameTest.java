package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class GameTest {

	@Test
	public void testMethod1() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnNames("Rafael", "Silva");
		assertEquals("The result should be 1", i, 1);
	}
	
	@Test
	public void testMethodRun() {
		Game game = new Game();
		ArrayList<String> resultArray = new ArrayList<String>();
		
		String inputValue = "Game";
		resultArray.add(inputValue);
		inputValue = "Daniel";
		resultArray.add(inputValue);
		inputValue = "Eriksson";
		resultArray.add(inputValue);
		inputValue = "M";
		resultArray.add(inputValue);
		inputValue = "21";
		resultArray.add(inputValue);
		inputValue = "Stockholm";
		resultArray.add(inputValue);
		
		assertEquals(resultArray.get(0), "Game"); //gamename
		assertEquals(resultArray.get(1), "Daniel"); //firstname
		assertEquals(resultArray.get(2), "Eriksson"); //lastname
		char tempchar = resultArray.get(3).charAt(0);	
		assertEquals(tempchar, 'M'); //gender
		assertEquals(Integer.parseInt(resultArray.get(4)), 21); //age
		assertEquals(resultArray.get(5), "Stockholm"); //city
		
		game.run(resultArray);
		
	}
	@Test
	public void testMethodRun2() {
		Game game = new Game();
		ArrayList<String> resultArray = new ArrayList<String>();
		
		String inputValue = "Game";
		resultArray.add(inputValue);
		inputValue = "Daniel1234";
		resultArray.add(inputValue);
		inputValue = "Eriksson";
		resultArray.add(inputValue);
		inputValue = "F";
		resultArray.add(inputValue);
		inputValue = "31";
		resultArray.add(inputValue);
		inputValue = "Sto";
		resultArray.add(inputValue);
		
		assertEquals(resultArray.get(0), "Game"); //gamename
		assertEquals(resultArray.get(1), "Daniel1234"); //firstname
		assertEquals(resultArray.get(2), "Eriksson"); //lastname
		char tempchar = resultArray.get(3).charAt(0);	
		assertEquals(tempchar, 'F'); //gender
		assertEquals(Integer.parseInt(resultArray.get(4)), 31); //age
		assertEquals(resultArray.get(5), "Sto"); //city
		
		game.run(resultArray);
		
	}
	@Test
	public void testMethodRun3() {
		Game game = new Game();
		ArrayList<String> resultArray = new ArrayList<String>();
		
		String inputValue = "Game";
		resultArray.add(inputValue);
		inputValue = "Daniel12";
		resultArray.add(inputValue);
		inputValue = "Eriksson";
		resultArray.add(inputValue);
		inputValue = "O";
		resultArray.add(inputValue);
		inputValue = "31";
		resultArray.add(inputValue);
		inputValue = "Ato";
		resultArray.add(inputValue);
		
		assertEquals(resultArray.get(0), "Game"); //gamename
		assertEquals(resultArray.get(1), "Daniel12"); //firstname
		assertEquals(resultArray.get(2), "Eriksson"); //lastname
		char tempchar = resultArray.get(3).charAt(0);	
		assertEquals(tempchar, 'O'); //gender
		assertEquals(Integer.parseInt(resultArray.get(4)), 31); //age
		assertEquals(resultArray.get(5), "Ato"); //city
		
		game.run(resultArray);
		
	}
	@Test
	public void testMethodRun4() {
		Game game = new Game();
		ArrayList<String> resultArray = new ArrayList<String>();
		
		String inputValue = "Game";
		resultArray.add(inputValue);
		inputValue = "Daniel12";
		resultArray.add(inputValue);
		inputValue = "Eriksson";
		resultArray.add(inputValue);
		inputValue = "O";
		resultArray.add(inputValue);
		inputValue = "31";
		resultArray.add(inputValue);
		inputValue = "Bdasd";
		resultArray.add(inputValue);
	
		game.run(resultArray);
	}
	@Test
	public void testMethodRun5() {
		Game game = new Game();
		ArrayList<String> resultArray = new ArrayList<String>();
		
		String inputValue = "Game";
		resultArray.add(inputValue);
		inputValue = "Daniel12";
		resultArray.add(inputValue);
		inputValue = "Eriksson";
		resultArray.add(inputValue);
		inputValue = "O";
		resultArray.add(inputValue);
		inputValue = "31";
		resultArray.add(inputValue);
		inputValue = "Cdasd";
		resultArray.add(inputValue);
	
		game.run(resultArray);
	}
	@Test
	public void testMethodRun6() {
		Game game = new Game();
		ArrayList<String> resultArray = new ArrayList<String>();
		
		String inputValue = "Game";
		resultArray.add(inputValue);
		inputValue = "Daniel12";
		resultArray.add(inputValue);
		inputValue = "Eriksson";
		resultArray.add(inputValue);
		inputValue = "O";
		resultArray.add(inputValue);
		inputValue = "31";
		resultArray.add(inputValue);
		inputValue = "Ddasd";
		resultArray.add(inputValue);
	
		game.run(resultArray);
	}
	@Test
	public void testMethodRun7() {
		Game game = new Game();
		ArrayList<String> resultArray = new ArrayList<String>();
		
		String inputValue = "Game";
		resultArray.add(inputValue);
		inputValue = "Daniel12";
		resultArray.add(inputValue);
		inputValue = "Eriksson";
		resultArray.add(inputValue);
		inputValue = "O";
		resultArray.add(inputValue);
		inputValue = "31";
		resultArray.add(inputValue);
		inputValue = "Edasd";
		resultArray.add(inputValue);
	
		game.run(resultArray);
	}
	@Test
	public void testMethodRun8() {
		Game game = new Game();
		ArrayList<String> resultArray = new ArrayList<String>();
		
		String inputValue = "Game";
		resultArray.add(inputValue);
		inputValue = "Daniel12";
		resultArray.add(inputValue);
		inputValue = "Eriksson";
		resultArray.add(inputValue);
		inputValue = "O";
		resultArray.add(inputValue);
		inputValue = "31";
		resultArray.add(inputValue);
		inputValue = "Fdasd";
		resultArray.add(inputValue);
	
		game.run(resultArray);
	}
	@Test
	public void testMethodRun9() {
		Game game = new Game();
		ArrayList<String> resultArray = new ArrayList<String>();
		
		String inputValue = "Game";
		resultArray.add(inputValue);
		inputValue = "Daniel12";
		resultArray.add(inputValue);
		inputValue = "Eriksson";
		resultArray.add(inputValue);
		inputValue = "O";
		resultArray.add(inputValue);
		inputValue = "31";
		resultArray.add(inputValue);
		inputValue = "Gdasd";
		resultArray.add(inputValue);
	
		game.run(resultArray);
	}
	@Test
	public void testMethodRun10() {
		Game game = new Game();
		ArrayList<String> resultArray = new ArrayList<String>();
		
		String inputValue = "Game";
		resultArray.add(inputValue);
		inputValue = "Daniel12";
		resultArray.add(inputValue);
		inputValue = "Eriksson";
		resultArray.add(inputValue);
		inputValue = "O";
		resultArray.add(inputValue);
		inputValue = "31";
		resultArray.add(inputValue);
		inputValue = "Hdasd";
		resultArray.add(inputValue);
	
		game.run(resultArray);
	}
	@Test
	public void testMethodRun11() {
		Game game = new Game();
		ArrayList<String> resultArray = new ArrayList<String>();
		
		String inputValue = "Game";
		resultArray.add(inputValue);
		inputValue = "Daniel12";
		resultArray.add(inputValue);
		inputValue = "Eriksson";
		resultArray.add(inputValue);
		inputValue = "O";
		resultArray.add(inputValue);
		inputValue = "31";
		resultArray.add(inputValue);
		inputValue = "Idasd";
		resultArray.add(inputValue);
	
		game.run(resultArray);
	}
	@Test
	public void testMethodRun12() {
		Game game = new Game();
		ArrayList<String> resultArray = new ArrayList<String>();
		
		String inputValue = "Game";
		resultArray.add(inputValue);
		inputValue = "Daniel12";
		resultArray.add(inputValue);
		inputValue = "Eriksson";
		resultArray.add(inputValue);
		inputValue = "O";
		resultArray.add(inputValue);
		inputValue = "31";
		resultArray.add(inputValue);
		inputValue = "Jdasd";
		resultArray.add(inputValue);
	
		game.run(resultArray);
	}

}
