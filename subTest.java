import static org.junit.Assert.*;

import org.junit.Test;

public class subTest {

	@Test
	public void test() {
		functions obj=new functions();
		double[][] x= {{1,2},{3,4}}; 
		double[][] y= {{1,2},{3,4}}; 
		double[][] z= {{0,0},{0,0}}; 
		assertArrayEquals(z,functions.subtraction(x, y));
	}

}
