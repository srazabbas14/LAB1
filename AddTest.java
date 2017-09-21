import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

	@Test
	public void test() {
		functions obj=new functions();
		double[][] x= {{1,2},{3,4}}; 
		double[][] y= {{1,2},{3,4}}; 
		double[][] z= {{2,4},{6,8}}; 
		assertArrayEquals(z,functions.addition(x, y));
	}

}
