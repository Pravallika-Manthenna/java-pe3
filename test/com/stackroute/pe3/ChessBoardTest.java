package com.stackroute.pe3;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {
  ChessBoard consecutiveCheck;
  @Before
  public void setUp(){
    consecutiveCheck=new ChessBoard();

  }
  @After
  public void tearDown(){
    consecutiveCheck=null;

  }
  @Test
  public void givenInputHasStringOfDigitsShouldPrintConsecutiveDigits() {
    String expected[][] =  {{"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"},
                            {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW"},
                            {"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"},
                            {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW"},
                            {"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"},
                            {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW"},
                            {"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"},
                            {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW"}};

    String[][] actual = ChessBoard.display(8, 8);

    assertNotEquals("Following is chessPattern output", expected, actual);

  }

}
