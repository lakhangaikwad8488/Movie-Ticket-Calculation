package test.java.yaksha;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import main.java.yaksha.CinemaTicket;
import main.java.yaksha.TestUtils;

class CinemaTicketTest {

	@Test
	void testCalculateCost() throws IOException {
		CinemaTicket t=new CinemaTicket();
		//assertTrue(t.calculateCost(10,"y","y","q"));
		 TestUtils.yakshaAssert(TestUtils.currentTest(),t.calculateCost(10,"y","y","q")==true==true?"true":"false",TestUtils.businessTestFile);
 
	}

}
