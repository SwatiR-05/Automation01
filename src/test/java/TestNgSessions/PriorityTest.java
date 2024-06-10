package TestNgSessions;

import org.testng.annotations.Test;

public class PriorityTest {
	@Test(priority = 5)
	public void atest() {
		System.out.println("a");
		
	}

	@Test
	public void btest() {
		System.out.println("b");
		
	}
	@Test
	public void ctest() {
		System.out.println("c");
		
	}
	@Test
	public void dtest() {
		System.out.println("d");
		
	}
	@Test(priority= 1)
	public void etest() {
		System.out.println("e");
		
	}
	
}
