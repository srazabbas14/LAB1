import static org.junit.Assert.*;

import org.junit.Test;

public class mulTest {

	@Test
	public void test() {
		functions obj=new functions();
		double[][] x= {{1,2},{3,4}}; 
		double[][] y= {{1,2},{3,4}}; 
		double[][] z= {{7,10},{15,22}}; 
		assertArrayEquals(z,functions.multiplication(x, y));
	}

}
