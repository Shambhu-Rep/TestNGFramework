package com.superthis.cons.interview;

import org.testng.annotations.Test;

public class PS1 extends PS {
	@Test
	private void testMethodos() {
		
		PS2 ps2 = new PS2(3);
		sampleTest();
		
		System.out.println(ps2.decrement());
		System.out.println(ps2.increment());
		System.out.println(ps2.multiplyTwo());
		System.out.println(ps2.multiplyThree());
		

	}

}
