package junittestpackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddnumbers {

	@Test
	public void test() {
		jUnitFunctions junit = new jUnitFunctions();
		String result = junit.AddStrings("Hello", " World");
		assertEquals("Hello World",result);
	}

}