package by.htp.mandrik;

import org.junit.Before; 
import org.junit.Test;

import by.htp.mandrik.steps.Steps;

public class Runner
{
	private Steps steps;
	/*private final String FROMPOINT = "Минск";
	private final String TOPOINT = "Сочи";
	private final String STARTDATE = "22.12.2016";
	private final String ENDDATE = "29.12.2016";*/

	@Before
	public void setUp()
	{
		steps = new Steps();
		steps.initBrowser();
	}

	@Test
	public void oneCanFindTickets()
	{
		steps.findTickets();
		//Assert.assertTrue(steps.createNewRepository("testRepo", "auto-generated test repo"));
		//Assert.assertTrue(steps.currentRepositoryIsEmpty());
		// do not use lots of asserts
	}
}
