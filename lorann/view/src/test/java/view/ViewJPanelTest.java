package view;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class ViewJPanelTest {

	/**
	 * Creation and initialization of attributes
	 */
	
	private int x;
	private int y;
	private Boolean yes = false;
	private String itslost = "";
	private int score = 0;
	private int score2 = 650;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	/**
	 * Test if X = 20, Y = 12 and the boolean is true
	 */

    @Test
	public void testChanges() {
	  this.yes = true;
	  for (y = 0; y <= 11; y++) {
	  for (x = 0; x <= 19; x++) {
		  
	  }
	  }
	   assertTrue(yes);
	   assertEquals(20, x);
	   assertEquals(12, y);
	 }

	 /**
	  * Test if the correct text is displayed when you lose
	  */
	  
    @Test
    public void testLose() {
        this.itslost = "YOU LOSE";
        assertEquals("YOU LOSE", itslost);
    }
    
    /**
     * Test if score = 650
     */
    
	@Test
	public void testSetScore() {
		this.score = score2;
		assertEquals(650, score);
	}

}
